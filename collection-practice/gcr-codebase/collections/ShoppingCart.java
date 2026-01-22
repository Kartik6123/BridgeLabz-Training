import java.util.*;

class ShoppingCart {
    Map<String, Integer> price = new HashMap<>();
    Map<String, Integer> cart = new LinkedHashMap<>();

    void addProduct(String p, int v) {
        price.put(p, v);
    }

    void addToCart(String p) {
        cart.put(p, price.get(p));
    }

    void showSortedByPrice() {
        TreeMap<Integer, List<String>> t = new TreeMap<>();
        for (String k : cart.keySet())
            t.computeIfAbsent(cart.get(k), x -> new ArrayList<>()).add(k);
        System.out.println(t);
    }
}
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart c = new ShoppingCart();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            c.addProduct(sc.next(), sc.nextInt());

        int k = sc.nextInt();
        for (int i = 0; i < k; i++)
            c.addToCart(sc.next());

        System.out.println(c.cart);
        c.showSortedByPrice();
    }
}
