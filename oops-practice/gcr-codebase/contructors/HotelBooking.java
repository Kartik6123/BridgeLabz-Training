package contructors;
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
     // Default constructor
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        // Parameterized constructor
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking hb) {
        // Copy constructor
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName +
                           ", Room: " + roomType +
                           ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Kartik", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);
        b1.display();
        b2.display();
        b3.display();
    }
}

