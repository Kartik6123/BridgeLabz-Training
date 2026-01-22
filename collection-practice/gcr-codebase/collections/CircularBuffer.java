class CircularBuffer {
    int[] buffer;
    int capacity;
    int front;
    int size;

    CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        front = 0;
        size = 0;
    }

    // Insert element (overwrite if full)
    void insert(int value) {
        int rear = (front + size) % capacity;

        buffer[rear] = value;

        if (size < capacity) {
            size++;
        } else {
            // buffer is full, move front forward
            front = (front + 1) % capacity;
        }
    }

    // Display buffer content
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        cb.display();  // Output: 2 3 4
    }
}
