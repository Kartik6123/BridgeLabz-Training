package HotelManagementSystem;

public class NormalPricing implements PricingStrategy {

    public double calculatePrice(Room room, int days) {
        return room.getBasePrice() * days;
    }
}

