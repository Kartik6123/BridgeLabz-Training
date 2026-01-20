import java.util.*;

public class ProductCatalog {
	private ArrayList<Product<? extends ProductCategory>> catalog = new ArrayList<>();
	
	public void addProduct(Product<? extends ProductCategory> product) {
		catalog.add(product);
	}
	
	public void showCatalog() {
        for (Product<? extends ProductCategory> product : catalog) {System.out.println(product.getName() + 
        		" | " +product.getCategory().getCategoryName() +
                " | Price: " + product.getPrice()
            );
        }
    }
}