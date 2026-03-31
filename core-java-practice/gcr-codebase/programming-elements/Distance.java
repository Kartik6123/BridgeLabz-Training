import java.util.*;

class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feet = sc.nextInt();
        // input distance in feet
        double yards = feet / 3.0;
        // conversion to yards
        double miles = yards / 1760.0;
        // conversion to miles
        System.out.println("Distance in yards is"+ yards +" while in miles is "+ miles);
    }
}


