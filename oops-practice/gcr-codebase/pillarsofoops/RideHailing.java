package pillarsofoops;

// GPS interface for location handling
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideHailing {

    // Vehicle and driver details (encapsulated)
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Fare calculation differs for each vehicle type
    abstract double calculateFare(double distance);

    // Common vehicle details
    void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}

class Bike extends RideHailing implements GPS {

    private String location;

    Bike(String vehicleId, String driverName, double ratePerKm) {
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class CarRide extends RideHailing implements GPS {

    private String location;

    CarRide(String vehicleId, String driverName, double ratePerKm) {
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class AutoRide extends RideHailing implements GPS {

    private String location;

    AutoRide(String vehicleId, String driverName, double ratePerKm) {
        setVehicleId(vehicleId);
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class MainRideHailing {
    public static void main(String[] args) {

        Bike bike = new Bike("B123", "John", 5.0);
        bike.updateLocation("Sector 10");
        bike.displayDetails();
        System.out.println("Location: " + bike.getCurrentLocation());
        System.out.println("Fare for 10 km: " + bike.calculateFare(10));
        System.out.println();

        CarRide car = new CarRide("C456", "Alice", 10.0);
        car.updateLocation("City Center");
        car.displayDetails();
        System.out.println("Location: " + car.getCurrentLocation());
        System.out.println("Fare for 15 km: " + car.calculateFare(15));
        System.out.println();

        AutoRide auto = new AutoRide("A789", "Bob", 7.0);
        auto.updateLocation("Railway Station");
        auto.displayDetails();
        System.out.println("Location: " + auto.getCurrentLocation());
        System.out.println("Fare for 8 km: " + auto.calculateFare(8));
    }
}
