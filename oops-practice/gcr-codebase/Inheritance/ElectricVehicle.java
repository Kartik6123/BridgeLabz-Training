package inheritance;

// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

// Interface for refueling behavior
interface Refuelable {
    void refuel();
}

// Subclass 1
public class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}

// Subclass 2 implementing interface
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}

 class Main {
    public static void main(String[] args) {

        Vehicle v1 = new ElectricVehicle(150, "Tesla Model 3");
        Vehicle v2 = new PetrolVehicle(180, "Honda City");

        ((ElectricVehicle) v1).charge();
        ((PetrolVehicle) v2).refuel();
    }
}

