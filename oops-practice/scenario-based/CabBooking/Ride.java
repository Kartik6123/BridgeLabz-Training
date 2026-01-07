package CabBooking;
public class Ride{
    String RideID;
    User user;
    Driver driver;
    String source;
    String destination;
    double fare; 
    // "Requested", "Ongoing", "Completed"
    Ride(String rideID, User user, Driver driver, String source, String destination, double fare){
        this.RideID = rideID;
        this.user = user;
        this.driver = driver;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }
    void displayRideDetails(){
        System.out.println("Ride ID: " + RideID);
        System.out.println("User: " + user.UserName + " (ID: " + user.UserID + ")");
        System.out.println("Driver: " + driver.DriverName + " (ID: " + driver.DriverID + ")");
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: $" + fare);
    }
}