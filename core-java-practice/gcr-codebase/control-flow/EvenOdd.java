import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter an integer range: ");
        int no = sc.nextInt();
        for (int i = 1; i <= no; i++)
            //range of numbers from 1 to n 
            {
            if (i % 2 == 0) {
                //check even or odd
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        } 
    }
}
