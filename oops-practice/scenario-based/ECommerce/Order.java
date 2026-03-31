package ECommerce;
import java.util.Scanner;
class ProductNotAvailableException extends Exception{
  ProductNotAvailableException(String msg){
    super(msg);
  }
}
public class Order {
 Product product;
 int quantity;
 boolean status;
 Order(Product product,int quantity){
    this.product=product;
    this.quantity=quantity;
 }
    Scanner sc=new Scanner(System.in);
 void placeOrder(int quantityToOrder) throws ProductNotAvailableException, PaymentFailedException{
  if(quantity<quantityToOrder){
    throw new ProductNotAvailableException("This much quantity is not availabe");
  }
  else{
    this.quantity=quantity-quantityToOrder; 
    System.out.println("Enter your payment method : 1.Cash 2.Card 3.UPI");
    int a=sc.nextInt();
    if(a==1){
        CashPayment cashPayment=new CashPayment();
        cashPayment.paymentType((int)product.price*quantityToOrder);
    }
    else if(a==2){
        CardPayment cardPayment=new CardPayment();
        try{
        cardPayment.paymentType((int)product.price*quantityToOrder);
        }
        catch(PaymentFailedException e){
            System.out.println(e.getMessage());
             throw e;
        }
    }
    else{
        OnlinePayment upi=new OnlinePayment();
        try{    
        upi.paymentType((int)product.price*quantityToOrder);
        }
        catch(PaymentFailedException e){
            System.out.println(e.getMessage());
           throw e;
        }
    }
    System.out.println("Order placed of product:+ "+product.productName+" quantity "+quantityToOrder);
  }
 }
 void CancelOrder(){
   System.out.println("Order Cancelled");
   return;
 }
}
