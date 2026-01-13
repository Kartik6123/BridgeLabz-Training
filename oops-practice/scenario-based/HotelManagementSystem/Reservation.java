package HotelManagementSystem;
public class Reservation {
    private Guest guest;
    private Room room;
    private int days;

    public Reservation(Guest guest, Room room, int days) {
        this.guest = guest;
        this.room = room;
        this.days = days;
    }

    public Room getRoom() {
        return room;
    }

    public int getDays() {
        return days;
    }
}

