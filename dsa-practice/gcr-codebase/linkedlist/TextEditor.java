package linkedlist;
public class TextEditor {

    class Node {
        String content;
        Node prev;
        Node next;

        Node(String content) {
            this.content = content;
        }
    }

    Node head, current;
    int size = 0;
    final int MAX = 10;

    // Add new text state
    void addState(String content) {
        Node newNode = new Node(content);

        if (current != null)
            current.next = null;

        if (head == null) {
            head = current = newNode;
        } else {
            newNode.prev = current;
            current.next = newNode;
            current = newNode;
        }

        size++;
        if (size > MAX)
            head = head.next;
    }

    // Undo operation
    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    // Redo operation
    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    // Display current text
    void display() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
    }
}

