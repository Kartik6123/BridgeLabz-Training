package restaurant_order_processing;

public class RestaurantManagerThread {
    public static void main(String[] args) throws InterruptedException {

        ChefThread chef1 = new ChefThread("Chef-1", "Pizza", 3);
        ChefThread chef2 = new ChefThread("Chef-2", "Pasta", 2);
        ChefThread chef3 = new ChefThread("Chef-3", "Salad", 1);
        ChefThread chef4 = new ChefThread("Chef-4", "Burger", 2); // 2.5s approximated to 2s

        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();

        chef1.join();
        chef2.join();
        chef3.join();
        chef4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}

