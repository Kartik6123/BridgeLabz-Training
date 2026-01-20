public class HRApp {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 80000);
        System.out.printf("%.2f%n", manager.getBonus());
    }
}
