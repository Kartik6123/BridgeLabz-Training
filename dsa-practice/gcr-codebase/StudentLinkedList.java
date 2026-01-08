import java.util.*;

class Node {
    int rollNumber;
    int age;
    String name;
    String grade;
    Node next;
    // Constructor to create a new student node
    Node(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentLinkedList {
    Node head;
    // Add student at beginning
    void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add student at end
    void addAtEnd(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Add student at specific position
    void addAtPosition(int position, int rollNumber, String name, int age, String grade) {
        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null)
            return;

        Node newNode = new Node(rollNumber, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete student by roll number
    void deleteByRollNumber(int rollNumber) {
        if (head == null)
            return;

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Search student by roll number
    void searchByRollNumber(int rollNumber) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade using roll number
    void updateGrade(int rollNumber, String newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    // Display all student records
    void displayStudents() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No student records available");
            return;
        }
        while (temp != null) {
            System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}
  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        while (true) {
            System.out.println("1.Add Begin 2.Add End 3.Add Position 4.Delete 5.Search 6.Update Grade 7.Display 8.Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                list.addAtBeginning(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
            } 
            else if (choice == 2) {
                list.addAtEnd(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
            } 
            else if (choice == 3) {
                list.addAtPosition(scanner.nextInt(), scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
            } 
            else if (choice == 4) {
                list.deleteByRollNumber(scanner.nextInt());
            } 
            else if (choice == 5) {
                list.searchByRollNumber(scanner.nextInt());
            } 
            else if (choice == 6) {
                list.updateGrade(scanner.nextInt(), scanner.next());
            } 
            else if (choice == 7) {
                list.displayStudents();
            } 
            else {
                break;
            }
        }
    }
}

