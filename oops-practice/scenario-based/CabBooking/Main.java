package CabBooking;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NoDriverAvailableException {
        try{
         Driver driver1 = new Driver("Bob", "D001");
        System.out.println("Welcome to Cab Booking System");
        User user1 = new User("Alice", "U001");
        driver1.user = user1;
        driver1.displayDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source:");
        String source=sc.nextLine();
        System.out.println("Enter destination:");
        String destination=sc.nextLine();
        int distance =sc.nextInt();
        if(distance <= 0){
            System.out.println("Invalid distance");
            return;
        }
        if(distance<10){
        NormalPricing normalFare = new NormalPricing(distance);
        double fare = normalFare.calculateFare(source, destination);
        Ride ride1 = new Ride("R001", user1, driver1, source, destination, fare);
        ride1.displayRideDetails();
        }else{
            PeakHourPricing peakFare = new PeakHourPricing(distance);
            double fare = peakFare.calculateFare(source, destination);
            Ride ride1 = new Ride("R001", user1, driver1, source, destination, fare);
            ride1.displayRideDetails();
        }
    }
    catch(NoDriverAvailableException e){
        System.out.println(e.getMessage());
    }
}
    }

