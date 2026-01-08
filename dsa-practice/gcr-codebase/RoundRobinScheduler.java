public class RoundRobinScheduler {

    // Node class representing each process
    class Node {
        int processId;
        int burstTime;
        int remainingTime;
        int priority;
        int waitingTime;
        int turnaroundTime;
        Node next;

        // Constructor to initialize process details
        Node(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
            this.waitingTime = 0;
            this.turnaroundTime = 0;
            this.next = null;
        }
    }

    // Head pointer of circular linked list
    Node head;

    // Add process at the end of circular list
    void addProcess(int processId, int burstTime, int priority) {
        Node newNode = new Node(processId, burstTime, priority);

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

    // Remove process using Process ID
    void removeProcess(int processId) {
        if (head == null)
            return;

        if (head.processId == processId && head.next == head) {
            head = null;
            return;
        }

        if (head.processId == processId) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = head.next;
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != head && curr.next.processId != processId)
            curr = curr.next;

        if (curr.next.processId == processId)
            curr.next = curr.next.next;
    }

    // Display current process list
    void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue");
            return;
        }

        Node temp = head;
        do {
            System.out.println("P" + temp.processId +
                    " BT:" + temp.remainingTime +
                    " Priority:" + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate round-robin scheduling
    void roundRobin(int timeQuantum) {
        if (head == null)
            return;

        Node current = head;
        int currentTime = 0;
        int totalProcesses = countProcesses();

        while (totalProcesses > 0) {

            if (current.remainingTime > 0) {

                int executionTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= executionTime;
                currentTime += executionTime;

                // Update waiting time for other processes
                Node temp = head;
                do {
                    if (temp != current && temp.remainingTime > 0)
                        temp.waitingTime += executionTime;
                    temp = temp.next;
                } while (temp != head);

                // If process completed
                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    int completedProcessId = current.processId;
                    current = current.next;
                    removeProcess(completedProcessId);
                    totalProcesses--;
                    displayProcesses();
                    continue;
                }
            }

            current = current.next;
            displayProcesses();
        }

        calculateAverages();
    }

    // Count number of processes
    int countProcesses() {
        if (head == null)
            return 0;

        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Calculate and display average waiting and turnaround time
    void calculateAverages() {
        double totalWaitingTime = 0;
        double totalTurnaroundTime = 0;
        int count = 0;

        Node temp = head;
        if (temp == null)
            return;

        do {
            totalWaitingTime += temp.waitingTime;
            totalTurnaroundTime += temp.turnaroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Average Waiting Time: " + (totalWaitingTime / count));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / count));
    }

    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        int timeQuantum = 3;
        rr.roundRobin(timeQuantum);
    }
}
