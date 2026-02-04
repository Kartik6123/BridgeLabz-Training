import java.util.*;

class Product {
    private String name;
    private double price;
    private double rating;
    private double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price +
               " | Rating: " + rating +
               " | Discount: " + discount + "%";
    }
}

public class EcommerceSorting {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Laptop", 70000, 4.5, 10),
            new Product("Phone", 40000, 4.7, 15),
            new Product("Headphones", 3000, 4.2, 25),
            new Product("Smart Watch", 15000, 4.0, 20)
        );

        // Sort by Price (Low to High)
        products.sort(Comparator.comparing(p -> p.getPrice()));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        System.out.println();

        // Sort by Rating (High to Low)
        products.sort(Comparator.comparing(p -> p.getRating()).reversed());
        System.out.println("Sorted by Rating:");
        products.forEach(System.out::println);

        System.out.println();

        // Sort by Discount (High to Low)
        products.sort(Comparator.comparing(p -> p.getDiscount()).reversed());
        System.out.println("Sorted by Discount:");
        products.forEach(System.out::println);
    }
}
