import java.util.Scanner;
public class DigitCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = sc.nextInt();
    int count = 0;
    if (number == 0) {
      count = 1; 
      // Special case for 0
    } else {
      while (number != 0) {
        number /= 10;
         // Remove last digit
        count++;
      }
    }
    System.out.println("Number of digits: " + count);
  }    
}
