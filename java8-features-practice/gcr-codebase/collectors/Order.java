import java.util.*;
import java.util.stream.*;

public class Order {
    String c;
    double a;
    Order(String c, double a) { this.c = c; this.a = a; }
    String getCustomer() { return c; }
    double getAmount() { return a; }
}

  class Main {
    public static void main(String[] args) {

        List<Order> l = Arrays.asList(
            new Order("Kartik", 2000),
            new Order("Aman", 1500),
            new Order("Kartik", 2500)
        );

        Map<String, Double> m =
            l.stream().collect(
                Collectors.groupingBy(
                    Order::getCustomer,
                    Collectors.summingDouble(Order::getAmount)
                )
            );

        System.out.println(m);
    }
}
