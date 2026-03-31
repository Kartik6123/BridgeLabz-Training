package pillarsofoops;
interface Taxable {
  // Interface
  abstract double calculateTax();
  abstract void getTaxDetails();
  abstract double finalPrice();
 }
 public abstract class Product{
  //Abstract Class
  private String productId;
  private String name;
  private int price;
    public String getProductId() {
     return productId;
    }
    public void setProductId(String productId) {
     this.productId = productId;
    }
    public String getName() {
     return name;
    }
    public void setName(String name) {
     this.name = name;
    }
    public int getPrice() {
     return price;
    }
    public void setPrice(int price) {
     this.price = price;
    }
  abstract double ClaculateDiscount();
 }
 class Electronics extends Product implements Taxable{
  //Concrete Class
 
    double discount;
    Electronics(String productId, String name, int price,double discount){
      super.setProductId(productId);
      super.setName(name);
      super.setPrice(price);
      this.discount = discount;
    }
    double ClaculateDiscount(){
      return (getPrice()*discount)/100;
    }
    public double calculateTax() {
      return (getPrice()*5)/100;
    }
    public void getTaxDetails() {
      System.out.println("The tax for clothing is 5%");
    }
    public double finalPrice() {
      return getPrice() + calculateTax() - ClaculateDiscount();
    }
 }
 class Clothing extends Product implements Taxable {
  //Concrete Class
     
    double discount;
    Clothing(String productId, String name, int price,double discount){
      super.setProductId(productId);
      super.setName(name);
      super.setPrice(price);
      this.discount = discount;
    }
  double ClaculateDiscount(){
      return (getPrice()*discount)/100;
    }
    public double calculateTax() {
      return (getPrice()*5)/100;
    }
    public void getTaxDetails() {
      System.out.println("The tax for clothing is 5%");
    }
    public double finalPrice() {
      return getPrice() + calculateTax() - ClaculateDiscount();
    }
 }

class Groceries extends Product implements Taxable{
  //Concrete Class
    double discount;
    Groceries(String productId, String name, int price,double discount){
      super.setProductId(productId);
      super.setName(name);
      super.setPrice(getPrice());
      this.discount = discount;
    }
    double ClaculateDiscount(){
      return (getPrice()*discount)/100;
    }
    public double calculateTax() {
      return (getPrice()*5)/100;
    }
    public void getTaxDetails() {
      System.out.println("The tax for clothing is 5%");
    }
    public double finalPrice() {
      return  getPrice() + calculateTax() - ClaculateDiscount();
    }
}
  class Main {
  public static void main(String[] args) {
    Electronics e1 = new Electronics("E101","Laptop",50000,10);
    System.out.println("Final Price of Electronics: "+e1.finalPrice());
    Clothing c1 = new Clothing("C101","T-Shirt",1000,5);
    System.out.println("Final Price of Clothing: "+c1.finalPrice());
    Groceries g1 = new Groceries("G101","Rice",2000,2);
    System.out.println("Final Price of Groceries: "+g1.finalPrice());
  }
}