public class ValidateCreditCard {
    public static void main(String[] args) {

        String cardNumber = "4111111111111111";

        String regex = "^(4\\d{15}|5\\d{15})$";

        if (cardNumber.matches(regex)) {
            System.out.println("Valid Credit Card Number");
        } else {
            System.out.println("Invalid Credit Card Number");
        }
    }
}
