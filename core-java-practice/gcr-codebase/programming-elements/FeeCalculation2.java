import java.util.Scanner;
class FeeCalculation2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the annual fee:");
        int fee=sc.nextInt();//annual fee;
        System.out.println("Enter the discount percentage:");
        int discountPercentage=sc.nextInt();//discount percentage
        int discount=(fee*discountPercentage)/100;//discount
        int finalFee=fee-discount;//final fee after discount
        System.out.println("The discount amount is INR: "+discount+" and the final discounted fee is INR: "+finalFee);

    }
}