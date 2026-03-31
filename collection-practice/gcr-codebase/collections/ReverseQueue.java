import java.util.*;

public class ReverseQueue {

    static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }

        int front = q.remove(); // remove front
        reverseQueue(q);       // reverse remaining
        q.add(front);          // add back at end
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverseQueue(queue);

        System.out.println(queue);
    }
}
