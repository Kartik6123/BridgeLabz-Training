package HotelManagementSystem;
public class Main {
    public static void main(String[] args) {

        HotelService service = new HotelService();

        Guest g1 = new Guest(1, "Kartik");
        Room room1 = new DeluxeRoom(101);

        PricingStrategy pricing = new SeasonalPricing();

        try {
            Reservation r =
                    service.bookRoom(g1, room1, 3);

            double bill = service.generateInvoice(r, pricing);
            System.out.println("Invoice Amount: " + bill);

            service.checkOut(r);
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

