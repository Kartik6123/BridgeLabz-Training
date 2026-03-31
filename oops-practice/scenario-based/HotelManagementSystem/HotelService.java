package HotelManagementSystem;

import java.util.*;

public class HotelService {

    private List<Reservation> reservations = new ArrayList<>();

    public Reservation bookRoom(Guest g, Room r, int days)
            throws RoomNotAvailableException {

        if (!r.isAvailable())
            throw new RoomNotAvailableException("Room not available");

        r.book();
        Reservation res = new Reservation(g, r, days);
        reservations.add(res);
        return res;
    }

    public void checkOut(Reservation r) {
        r.getRoom().release();
        reservations.remove(r);
    }

    public double generateInvoice(Reservation r, PricingStrategy strategy) {
        return strategy.calculatePrice(r.getRoom(), r.getDays());
    }
}

