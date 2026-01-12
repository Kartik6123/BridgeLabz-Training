package ECommerce;
public class Delivery {
    User user;
    Order order;
    Product product;
    Delivery(User user,Order order){
        this.user=user;
        this.order=order;
    }
    void delivery(){
     System.out.println("Delivery Successfull ");
     System.out.println("Order name "+ product.productName);
     System.out.println("Delivered to user "+ user.Username);
     System.out.println("User ID "+ user.userId);
     System.out.println("Delivery of amount "+ product.price);
    }
}
