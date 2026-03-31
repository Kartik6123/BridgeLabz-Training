public class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    @Override
    public String vehicleSelection() {

        double area = 2 * 3.147 * timberRadius * timberLength;

        if (area < 250)
            return "Truck";
        else if (area <= 400)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    @Override
    public float calculateTotalCharge() {

        double volume = 3.147 * timberRadius * timberRadius * timberLength;

        double rate = timberType.equalsIgnoreCase("Premium") ? 0.25 : 0.15;
        double price = volume * timberPrice * rate;
        double tax = price * 0.3;

        double discount = 0;
        if (transportRating == 5)
            discount = price * 0.20;
        else if (transportRating == 3 || transportRating == 4)
            discount = price * 0.10;

        double vehicleCost;
        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("Truck"))
            vehicleCost = 1000;
        else if (vehicle.equalsIgnoreCase("Lorry"))
            vehicleCost = 1700;
        else
            vehicleCost = 3000;

        return (float) ((price + tax + vehicleCost) - discount);
    }
}
