import java.util.*;

interface IRentable {
    double calculateRent(int days);
}

class VehicleRentalApp {

    static abstract class Vehicle implements IRentable {
        protected int id;
        protected String name;
        protected double rate;

        Vehicle(int id, String name, double rate) {
            this.id = id;
            this.name = name;
            this.rate = rate;
        }
    }

    static class Bike extends Vehicle {
        Bike(int id, String name, double rate) {
            super(id, name, rate);
        }
        public double calculateRent(int days) {
            return rate * days;
        }
    }

    static class Car extends Vehicle {
        Car(int id, String name, double rate) {
            super(id, name, rate);
        }
        public double calculateRent(int days) {
            return rate * days;
        }
    }

    static class Truck extends Vehicle {
        Truck(int id, String name, double rate) {
            super(id, name, rate);
        }
        public double calculateRent(int days) {
            return rate * days;
        }
    }

    static List<Vehicle> vehicles = new ArrayList<>();

    static void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    static void viewVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println(v.id + " " + v.name + " Rate:" + v.rate);
        }
    }

    static void updateRate(int id, double newRate) {
        for (Vehicle v : vehicles) {
            if (v.id == id) {
                v.rate = newRate;
            }
        }
    }

    static void deleteVehicle(int id) {
        vehicles.removeIf(v -> v.id == id);
    }

    public static void main(String[] args) {
        addVehicle(new Bike(1, "Honda", 300));
        addVehicle(new Car(2, "Swift", 1000));
        addVehicle(new Truck(3, "Tata", 2000));

        viewVehicles();
        updateRate(2, 1200);
        deleteVehicle(1);

        System.out.println("Rent for 3 days: " + vehicles.get(0).calculateRent(3));
    }
}
