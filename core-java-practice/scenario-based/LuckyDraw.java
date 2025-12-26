import java.util.Scanner;

public class LuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter lucky draw number 0 to exit: ");
            int number = sc.nextInt();

            if (number == 0) {
                break; 
                // exit the draw
            }

            if (number < 0) {
                continue; 
                // skip invalid input
            }
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won the lucky draw");
            } else {
                System.out.println("Better luck next time");
            }
        }
    }
}

