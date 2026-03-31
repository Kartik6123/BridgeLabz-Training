package ECommerce;
public class OnlinePayment implements Payment {
    public void paymentType(int amount) throws PaymentFailedException{
          if(amount>100000){
            throw new PaymentFailedException("Limit Exceeded");
          }
    }
}
