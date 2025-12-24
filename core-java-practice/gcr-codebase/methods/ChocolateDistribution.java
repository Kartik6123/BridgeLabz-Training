import java.util.*;
class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total chocolates: ");
        int totalChocolates = sc.nextInt();
        System.out.print("Enter total children: ");
        int totalChildren = sc.nextInt();
        //input total children
        int[] result = chocolates(totalChocolates, totalChildren);
        //method call
        System.out.println("Chocolates per child: " + result[0]);
        System.out.println("Chocolates left: " + result[1]);
    }
    public static int[] chocolates(int chocolates, int children) {
        int child = chocolates / children;
        int leftOver = chocolates % children;
        int[] resultArray = new int[2];
        resultArray[0] = child;
        resultArray[1] = leftOver;
        return resultArray;
    }
}

