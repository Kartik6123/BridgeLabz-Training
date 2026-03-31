package HotelManagementSystem;
public abstract class Room { 
    //Base class for different room types
    protected int roomNo;
    protected double basePrice;
    protected boolean available = true;

    public Room(int roomNo, double basePrice) {
        this.roomNo = roomNo;
        this.basePrice = basePrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {
        available = false;
    }

    public void release() {
        available = true;
    }

    public double getBasePrice() {
        return basePrice;
    }
}

