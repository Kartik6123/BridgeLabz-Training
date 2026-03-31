package linkedlist;
public class TicketReservationSystem {

    // Node class representing each ticket
    class Node {
        int ticketId;
        String name;
        String movieName;
        String seatNumber;
        String bookingTime;
        Node next;

        // Constructor to initialize ticket details
        Node(int ticketId, String name, String movieName,
             String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.name = name;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = null;
        }
    }

    // Head pointer of circular linked list
    Node head;

    // Add a new ticket at the end
    void addTicket(int ticketId, String name,
                   String movieName, String seatNumber, String bookingTime) {

        Node newNode = new Node(ticketId, name, movieName, seatNumber, bookingTime);

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

    // Remove a ticket using Ticket ID
    void removeTicket(int ticketId) {
        if (head == null)
            return;

        if (head.ticketId == ticketId) {
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
        while (curr.next != head && curr.next.ticketId != ticketId)
            curr = curr.next;

        if (curr.next.ticketId == ticketId)
            curr.next = curr.next.next;
    }

    // Display all booked tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Node temp = head;
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search ticket by customer name or movie name
    void searchTicket(String key) {
        if (head == null)
            return;

        Node temp = head;
        boolean found = false;

        do {
            if (temp.name.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No matching ticket found");
    }

    // Count total booked tickets
    void countTickets() {
        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets: " + count);
    }

    // Display single ticket details
    void displayTicket(Node node) {
        System.out.println(
                node.ticketId + " " +
                node.name + " " +
                node.movieName + " " +
                node.seatNumber + " " +
                node.bookingTime
        );
    }

    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();

        trs.addTicket(1, "Amit", "Inception", "A12", "10:30 AM");
        trs.addTicket(2, "Riya", "Avatar", "B05", "11:00 AM");
        trs.addTicket(3, "Kunal", "Inception", "C08", "11:15 AM");

        trs.displayTickets();
        trs.searchTicket("Inception");
        trs.removeTicket(2);
        trs.countTickets();
    }
}

