public class VehicleRentalSystem {

    //  Interface
    interface Vehicle {
        void rent();
        void returnVehicle();
    }

    //  Car implementation
    static class Car implements Vehicle {
        public void rent() {
            System.out.println("Car has been rented");
        }

        public void returnVehicle() {
            System.out.println("Car has been returned");
        }
    }

    //  Bike implementation
    static class Bike implements Vehicle {
        public void rent() {
            System.out.println("Bike has been rented");
        }

        public void returnVehicle() {
            System.out.println("Bike has been returned");
        }
    }

    //  Bus implementation
    static class Bus implements Vehicle {
        public void rent() {
            System.out.println("Bus has been rented");
        }

        public void returnVehicle() {
            System.out.println("Bus has been returned");
        }
    }
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        car.returnVehicle();

        bike.rent();
        bike.returnVehicle();

        bus.rent();
        bus.returnVehicle();
    }
}
