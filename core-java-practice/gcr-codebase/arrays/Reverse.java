import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        //  Count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int[] digits = new int[count];
        int[] reverse = new int[count];
        temp = num;
        //  Store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        //  Reverse the array
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }
        //  Display reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
    }
}

