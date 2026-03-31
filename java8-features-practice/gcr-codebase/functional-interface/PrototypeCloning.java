public class PrototypeCloning {
    static class Product implements Cloneable {
        String name;

        Product(String name) {
            this.name = name;
        }
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static void main(String[] args) throws Exception {
        Product p1 = new Product("Laptop");
        Product p2 = (Product) p1.clone();

        System.out.println("Original: " + p1.name);
        System.out.println("Cloned: " + p2.name);
    }
}
