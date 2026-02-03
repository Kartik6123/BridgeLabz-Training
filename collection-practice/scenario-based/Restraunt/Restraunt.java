import java.util.*;

class Restaurant {
    Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();

    void addTable(Table t) {
        tables.put(t.tableNumber, t);
    }

    void reserveTable(int tableNumber, String timeSlot, String customer)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                    "Table " + tableNumber + " already reserved for " + timeSlot
                );
            }
        }

        reservations.add(new Reservation(tableNumber, timeSlot, customer));
        System.out.println("Reservation successful for " + customer);
    }

    void cancelReservation(int tableNumber, String timeSlot) {
        reservations.removeIf(r ->
            r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)
        );
        System.out.println("Reservation cancelled");
    }

    void showAvailableTables(String timeSlot) {
        for (Table t : tables.values()) {
            boolean booked = false;

            for (Reservation r : reservations) {
                if (r.tableNumber == t.tableNumber &&
                    r.timeSlot.equals(timeSlot)) {
                    booked = true;
                    break;
                }
            }

            if (!booked) {
                System.out.println("Table " + t.tableNumber + " is available");
            }
        }
    }
}
