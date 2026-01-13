import java.util.*;

class FlightBookingSystem {

    static String[] flights = {
        "AI101-Delhi-Mumbai",
        "AI202-Mumbai-Chennai",
        "AI303-Delhi-Bangalore"
    };

    static List<String> bookings = new ArrayList<>();

    static void searchFlight(String city) {
        for (String f : flights) {
            if (f.toLowerCase().contains(city.toLowerCase())) {
                System.out.println("Found: " + f);
            }
        }
    }

    static void bookFlight(String flightCode) {
        for (String f : flights) {
            if (f.startsWith(flightCode)) {
                bookings.add(f);
                System.out.println("Booked: " + f);
                return;
            }
        }
        System.out.println("Flight not found");
    }

    static void viewBookings() {
        for (String b : bookings) {
            System.out.println("Booking: " + b);
        }
    }

    public static void main(String[] args) {
        searchFlight("delhi");
        bookFlight("AI101");
        viewBookings();
    }
}
