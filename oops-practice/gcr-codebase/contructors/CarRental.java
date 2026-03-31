package contructors;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    CarRental() {
        // Default constructor
        customerName = "Kartik";
        carModel = "Standard";
        rentalDays = 1;
    }
    CarRental(String customerName, String carModel, int rentalDays) {
        // Parameterized constructor
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    int totalCost() {
        // Calculate total rental cost
        int costPerDay;
        switch (carModel) {
            case "Economy":
                costPerDay = 50;
                break;
            case "Standard":
                costPerDay = 75;
                break;
            case "Luxury":
                costPerDay = 150;
                break;
            default:
                costPerDay = 0;
        }
        return costPerDay * rentalDays;
    }
    void display() {
        // Display rental details
        System.out.println("Customer: " + customerName +
                           ", Car Model: " + carModel +
                           ", Rental Days: " + rentalDays +
                           ", Total Cost: $" + totalCost());
    }
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Anita", "Luxury", 3);
        rental1.display();
        rental2.display();
    }
}
