import java.util.Scanner;

public class LineComparison{

    public static void main(String[] args) {
        //USE CASE 1 TAKING INPUTS AND CALCULATING LENGTH
        Scanner sc = new Scanner(System.in);
        // Taking coordinates of first point
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        // Taking coordinates of second point
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        // Calculating length using distance formula
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // Displaying result
        System.out.println("Length of the line = " + length1);
        //USE CASE 2 CHECKING EQUALITY OF TWO LINES
        // Taking coordinates for second line
        System.out.println("Enter coordinates for second line:");
        int a1= sc.nextInt();
        int b1= sc.nextInt();
        int a2= sc.nextInt();
        int b2= sc.nextInt();
        // Calculating length1 of second line
        double length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        // Checking equality
        if(String.valueOf(length1).equals(String.valueOf(length2))) {
            System.out.println("Both lines are equal in length1.");
        } else {
            System.out.println("Lines are not equal in length1.");
        }
        //USE CASE 3 COMPARING TWO LINES
         if(String.valueOf(length1).compareTo(String.valueOf(length2)) > 0) {
            System.out.println("First line is longer than second line.");
        } 
        else if(String.valueOf(length1).compareTo(String.valueOf(length2)) < 0) {
            System.out.println("First line is shorter than second line.");
        } 
        else {
            System.out.println("Both lines are equal in length1.");
    }
}
}

