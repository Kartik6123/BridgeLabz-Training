package CabBooking;
interface FareCalculator{
    double calculateFare(String source, String destination);
}
 class NormalPricing implements FareCalculator{
    int distance; // in kilometers
    NormalPricing(int distance){
        this.distance = distance;
    }
    public double calculateFare(String source, String destination){
        return 10.0*distance; // Flat fare
    }
}
class PeakHourPricing implements FareCalculator{
    int distance; // in kilometers
    PeakHourPricing(int distance){
        this.distance = distance;
    }
    public double calculateFare(String source, String destination){
        return 15.0*distance; // Higher fare during peak hours
    }
}
