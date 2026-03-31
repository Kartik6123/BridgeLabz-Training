import java.util.Scanner;
public class Perimeter {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of the square ");
    int length = sc.nextInt();
    // length of square input
    int perimeter = 4 * length;
    // perimeter calculation
    System.out.println("The length of the side is " + length + " whose perimeter is " + perimeter);
    
   } 
}
