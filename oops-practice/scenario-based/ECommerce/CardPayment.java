package ECommerce;

public class CardPayment implements Payment{
    public void paymentType(int amount) throws PaymentFailedException{
        if(amount>200000){
            throw new PaymentFailedException("Limit Exceeded");
        }
        else{
            System.out.println("Payment made of amount"+amount);
        }
    }
}
