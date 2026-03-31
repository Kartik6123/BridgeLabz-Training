package classandobject;

class MovieTicket {

    String movieName;
    String seatNumber;
    double price;
    boolean isBooked = false;

    // Method to book ticket
    void bookTicket(String movieName, String seatNumber, double price) {
        if (isBooked) {
            System.out.println("House full!!! sorry..... Ticket already booked");
        } else {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            isBooked = true;

            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    // Method to display ticket details
    void displayTicket() {
        if (!isBooked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Price: $" + price);
            System.out.println();
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.displayTicket();
        ticket.bookTicket("Dragon", "A10", 120.0);
        ticket.bookTicket("Dragon", "A10", 120.0);
    }
}

