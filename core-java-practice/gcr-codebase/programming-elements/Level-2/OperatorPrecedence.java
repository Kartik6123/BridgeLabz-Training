import java.util.*;

class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // first input
        int b = sc.nextInt();
        // second input
        int c = sc.nextInt();
        // third input
        int operation1 = a + b * c;
        // first operation
        int operation2 = a * b + c;
        // second operation
        int operation3 = c + a / b;
        // third operation
        int operation4 = a % b + c;
        // fourth operation
        System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", and " + operation4);
    }
}

