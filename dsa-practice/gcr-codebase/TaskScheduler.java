public class TaskScheduler {
    // Inner Node class representing each task
    class Node {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Node next;

        // Constructor to initialize task details
        Node(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = null;
        }
    }

    // Head pointer of the circular linked list
    Node head;

    // Add a task at the beginning
    void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add a task at the end
    void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Add a task at a specific position
    void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++)
            temp = temp.next;

        Node newNode = new Node(taskId, taskName, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove a task using Task ID
    void removeByTaskId(int taskId) {
        if (head == null)
            return;

        if (head.taskId == taskId) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            if (head.next == head) {
                head = null;
                return;
            }

            temp.next = head.next;
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != head && curr.next.taskId != taskId)
            curr = curr.next;

        if (curr.next.taskId == taskId)
            curr.next = curr.next.next;
    }

    // View current task and move to next task
    void viewAndMoveNext() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("Current Task: " + head.taskId + " " + head.taskName +
                " " + head.priority + " " + head.dueDate);

        head = head.next;
    }

    // Display all tasks starting from head
    void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        Node temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName +
                    " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search tasks by priority
    void searchByPriority(int priority) {
        if (head == null)
            return;

        Node temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskId + " " + temp.taskName +
                        " " + temp.priority + " " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks found with priority " + priority);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();

        ts.addAtEnd(1, "Design Module", 2, "10-02-2026");
        ts.addAtBeginning(2, "Write Code", 1, "05-02-2026");
        ts.addAtPosition(2, 3, "Testing", 2, "08-02-2026");

        ts.displayTasks();

        ts.viewAndMoveNext();
        ts.viewAndMoveNext();

        ts.searchByPriority(2);

        ts.removeByTaskId(2);
        ts.displayTasks();
    }
}
