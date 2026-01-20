package TrafficManager;
public class Main {

    static String[] queue = new String[3];
    static int front = 0, rear = 0, size = 0;

    static void enqueue(String car) {
        if (size == queue.length) {
            System.out.println("Queue Overflow! " + car + " waits outside");
            return;
        }
        queue[rear++] = car;
        size++;
        System.out.println(car + " added to queue");
    }

    static String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return null;
        }
        size--;
        return queue[front++];
    }

    public static void main(String[] args) {

        RoundAbout rb = new RoundAbout();

        enqueue("CAR-1");
        enqueue("CAR-2");
        enqueue("CAR-3");
        enqueue("CAR-4"); // overflow

        while (size > 0) {
            rb.addVehicle(dequeue());
        }

        rb.display();

        rb.removeVehicle("CAR-2");
        rb.display();
    }
}

