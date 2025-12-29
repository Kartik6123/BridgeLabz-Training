import java.util.*;

public class MovieTicketBooking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to book a movie ticket? yes/no:");
        String ch = sc.next();
        while (ch.equalsIgnoreCase("yes")){ 
            int price = 0;
            System.out.println("Enter movie type 1.Action  2.Comedy  3.Drama: ");
            int movieType = sc.nextInt();
            switch (movieType) {
                // switch for movie type
                case 1:
                    price = 200;
                    break;
                case 2:
                    price = 180;
                    break;
                case 3:
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    break;
            }
            System.out.println("Enter seat type (gold/silver): ");
            // Input for seat type
            String seatType = sc.next();
            if (seatType.equalsIgnoreCase("gold")) {
                price += 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                price += 50;
            } else {
                System.out.println("Invalid seat type");
            }
            System.out.println("Do you want snacks? yes/no:");
            String snacks = sc.next();
            if (snacks.equalsIgnoreCase("yes")) {
                price += 70;
            }
            System.out.println("Total Ticket Price:" + price);
            System.out.print("Next customer? yes/no: ");
            ch = sc.next();
        }
        System.out.println("Thank you! Visit again.");
    }
}

