package inheritance;

public class Vehicle {
    //parent class
    int maxSpeed;
    int fuelType;

    Vehicle(int maxSpeed, int fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    //subclass
    int seatCapacity;

    Car(int maxSpeed, int fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Motorcycle extends Vehicle {
    //subclass

    Motorcycle(int maxSpeed, int fuelType) {
        super(maxSpeed, fuelType);
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Truck extends Vehicle {
    //subclass
    int loadCapacity;

    Truck(int maxSpeed, int fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

 class Main {
    public static void main(String[] args) {

        // Polymorphism using parent reference
        Vehicle[] vehicles = {
            new Vehicle(120, 1),
            new Car(150, 1, 5),
            new Motorcycle(100, 1),
            new Truck(80, 2, 10000)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
