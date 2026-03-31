package TrafficManager;

public class RoundAbout {
    Vehicle head = null;

    // Add vehicle
    void addVehicle(String number) {
        Vehicle v = new Vehicle(number);

        if (head == null) {
            head = v;
            v.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = v;
            v.next = head;
        }
        System.out.println(number + " entered roundabout");
    }

    // Remove vehicle
    void removeVehicle(String number) {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.number.equals(number)) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        Vehicle last = head;
                        while (last.next != head)
                            last = last.next;
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                System.out.println(number + " exited roundabout");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    // Print state
    void display() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("START");
    }
}

 
