package contructors;

public class Product {
 String ProductName;
 int prince;   
 static int totalProducts=0;
    Product(){
        // Default constructor
        ProductName="";
        prince=0;
    }
    Product(String ProductName,int prince){
        // Parameterized constructor
        this.ProductName=ProductName;
        this.prince=prince;
        totalProducts++;
    }
    void display(){
        // Display product details
        System.out.println("Product Name: "+ProductName);
        System.out.println("Product Price: "+prince);
    }
    void totalProducts(){
        // Display total products
        System.out.println("Total Products: "+totalProducts);
    }
    public static void main(String[] args) {
        Product p1=new Product();
        p1.display();
        p1.totalProducts();
    }
}
