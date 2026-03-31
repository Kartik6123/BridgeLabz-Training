import java.util.*;

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    // Add element to the queue
    void enqueue(int x) {
        in.push(x);
    }

    // Remove and return front element
    int dequeue() {

        // Transfer elements only if out stack is empty
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        if (out.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return out.pop();
    }

    // Return front element without removing it
    int peek() {

        // Ensure out stack has the front element
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        if (out.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return out.peek();
    }

    // Check if queue is empty
    boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }
}

public class Queue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek()); // Output: 1

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 1
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 2

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 3

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
    }
}