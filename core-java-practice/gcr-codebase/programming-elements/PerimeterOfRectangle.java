import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        double l = sc.nextDouble();//input length
        System.out.println("Enter breadth of the rectangle:");
        double b = sc.nextDouble();//input breadth
        double p = 2 * (l + b);//perimeter calculation formula
        System.out.println("Perimeter of the rectangle  is: " + p);//output
    }
}
