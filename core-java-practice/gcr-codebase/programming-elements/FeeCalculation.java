public class FeeCalculation {
    public static void main(String[] args) {
         int fee=125000;//annual fee;
         int discountPercentage=10;//discount percentage
         int discount=(fee*discountPercentage)/100;//discount 
         int finalFee=fee-discount;//final fee after discount
         System.out.println("The discont amount is INR: "+discount+" and the final discounted is INR: "+finalFee);
    }
}
