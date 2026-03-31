import java.util.Scanner;
public class KilometersToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers:");
        int km=sc.nextInt();//input distance in kilometers
        double mile=km*0.621371;//conversion formula from kilometers to miles
        System.out.println("Distance in miles:" + mile);//output
    }
}
