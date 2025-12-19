import java.util.*;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        //input for base number
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        //input for exponent
        int result = 1;
        int counter = 0;
        // storing result of power calculation
        while (counter <= power) {
            //multiplying number 'power' times
            result = result * number;
            counter++;
        }
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}

