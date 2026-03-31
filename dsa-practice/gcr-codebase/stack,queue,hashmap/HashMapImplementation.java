class HashMapImplementation {

    // Node for linked list
    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 16;
    private Node[] buckets;

    HashMapImplementation() {
        buckets = new Node[SIZE];
    }

    // Hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert or update key-value pair
    void put(int key, int value) {
        int idx = hash(key);
        Node head = buckets[idx];

        Node curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[idx] = newNode;
    }

    // Retrieve value by key
    int get(int key) {
        int idx = hash(key);
        Node curr = buckets[idx];

        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }

        return -1;
    }

    // Remove key-value pair
    void remove(int key) {
        int idx = hash(key);
        Node curr = buckets[idx];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[idx] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        HashMapImplementation map = new HashMapImplementation();

        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1)); // Output: 10
        System.out.println(map.get(2)); // Output: 20

        map.put(1, 15);
        System.out.println(map.get(1)); // Output: 15

        map.remove(2);
        System.out.println(map.get(2)); // Output: -1
    }
}
