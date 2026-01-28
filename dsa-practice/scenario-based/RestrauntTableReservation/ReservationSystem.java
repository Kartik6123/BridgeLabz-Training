import java.util.*;

class ReservationSystem {

    Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();

    ReservationSystem() {
        tables.put(1, new Table(1, 4));
        tables.put(2, new Table(2, 2));
        tables.put(3, new Table(3, 6));
    }

    void reserveTable(int tableNo, String name, String timeSlot)
            throws TableAlreadyReservedException {

        Table table = tables.get(tableNo);

        if (table.isReserved)
            throw new TableAlreadyReservedException("Table already reserved");

        table.isReserved = true;
        reservations.add(new Reservation(tableNo, name, timeSlot));
        System.out.println("Table " + tableNo + " reserved for " + name);
    }

    void cancelReservation(int tableNo) {
        Table table = tables.get(tableNo);
        table.isReserved = false;

        reservations.removeIf(r -> r.tableNo == tableNo);
        System.out.println("Reservation cancelled for table " + tableNo);
    }

    void showAvailableTables() {
        for (Table t : tables.values()) {
            if (!t.isReserved)
                System.out.println("Table " + t.tableNo + " available");
        }
    }
}
