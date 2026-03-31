package HotelManagementSystem;
public class SeasonalPricing implements PricingStrategy {

    public double calculatePrice(Room room, int days) {
        return room.getBasePrice() * days * 1.5;
    }
}

