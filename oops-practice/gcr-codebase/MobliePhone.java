public class MobliePhone {
    String brand;
    String model;
    double price;
    MobliePhone(String brand, String model, double price){
        //constructor to initialize mobile phone details
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display(){
        //method to display mobile phone details
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MobliePhone phone = new MobliePhone("VIVO", "VIVO V29", 15999.0);
        phone.display();
    }
}
