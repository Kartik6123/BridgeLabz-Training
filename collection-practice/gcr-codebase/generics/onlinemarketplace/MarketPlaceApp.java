public class MarketPlaceApp {

	public static void main(String[] args) {
		Product<BookCategory> book =new Product<>("Java Basics", 500, new BookCategory());

        Product<ClothingCategory> shirt =new Product<>("T-Shirt", 1200, new ClothingCategory());
        Product<ClothingCategory> pant =new Product<>("Pant", 600, new ClothingCategory());

        Product<GadgetCategory> phone =new Product<>("Smartphone", 25000, new GadgetCategory());

        DiscountUtil.calculateDiscount(book, 10);
        DiscountUtil.calculateDiscount(shirt, 20);
        DiscountUtil.calculateDiscount(phone, 5);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(pant);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        catalog.showCatalog();
    }

	

}