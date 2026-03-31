public class Main {
    public static void main(String[] args) {

        ReservationSystem rs = new ReservationSystem();

        try {
            rs.reserveTable(1, "Kartik", "7-9 PM");
            rs.reserveTable(1, "Rahul", "9-11 PM");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        rs.showAvailableTables();
        rs.cancelReservation(1);
        rs.showAvailableTables();
    }
}
