public class Main {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();
        r.addTable(new Table(1, 4));
        r.addTable(new Table(2, 2));

        try {
            r.reserveTable(1, "7-9 PM", "Kartik");
            r.reserveTable(1, "7-9 PM", "Rahul"); // Exception
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        r.showAvailableTables("7-9 PM");
        r.cancelReservation(1, "7-9 PM");
        r.showAvailableTables("7-9 PM");
    }
}
