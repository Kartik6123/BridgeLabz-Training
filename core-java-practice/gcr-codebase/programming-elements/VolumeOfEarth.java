public class VolumeOfEarth {
    public static void main(String[] args) {
        int r_km = 6378; // Radius of the Earth in kilometers
        double vol = (4.0 / 3.0) * 3.14 * Math.pow(r_km, 3); // Volume formula
        double r_miles=6378 * 0.621371; // Radius in miles
        double vol_miles=(4.0 / 3.0) * 3.14 * Math.pow(r_miles, 3); // Volume in  miles
        System.out.println("The volume of the Earth in cubic kilometers is: " + vol +"and  cubic miles is: " + vol_miles);
    }
}
