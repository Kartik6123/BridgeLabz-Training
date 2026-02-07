public class SmartVehicleDashboard {

    interface Vehicle {
        void displaySpeed();

        // Optional feature
        default void displayBattery() {
            System.out.println("Battery feature not supported");
        }
    }
    static class Car implements Vehicle {
        public void displaySpeed() {
            System.out.println("Car speed: 80 km/h");
        }
    }

    static class ElectricCar implements Vehicle {
        public void displaySpeed() {
            System.out.println("Electric Car speed: 70 km/h");
        }

        // Override default method
        public void displayBattery() {
            System.out.println("Battery level: 85%");
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle eCar = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
