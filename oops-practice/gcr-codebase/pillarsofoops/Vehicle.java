package pillarsofoops;

interface Insurable {
    // Interface
    double calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle {
    // Abstract Class

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    abstract double calculateRentalCost(int days);

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable { 
    // Concrete Class

    private String insurancePolicyNo;

    Car(String vehicleNumber, double rentalRate, String insurancePolicyNo) {
        setVehicleNumber(vehicleNumber);
        setType("Car");
        setRentalRate(rentalRate);
        this.insurancePolicyNo = insurancePolicyNo;
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public void getInsuranceDetails() {
        System.out.println("Car Insurance Policy: " + insurancePolicyNo);
    }
}

class Bike extends Vehicle implements Insurable {
    // Concrete Class

    private String insurancePolicyNo;

    Bike(String vehicleNumber, double rentalRate, String insurancePolicyNo) {
        setVehicleNumber(vehicleNumber);
        setType("Bike");
        setRentalRate(rentalRate);
        this.insurancePolicyNo = insurancePolicyNo;
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 200;
    }

    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Policy: " + insurancePolicyNo);
    }
}

class Main {
    public static void main(String[] args) {

        Car car = new Car("CAR123", 1500, "CAR-INS-001");
        Bike bike = new Bike("BIKE456", 500, "BIKE-INS-002");

        int days = 3;

        car.displayDetails();
        System.out.println("Rental Cost: " + car.calculateRentalCost(days));
        System.out.println("Insurance Cost: " + car.calculateInsurance());
        car.getInsuranceDetails();

        System.out.println();

        bike.displayDetails();
        System.out.println("Rental Cost: " + bike.calculateRentalCost(days));
        System.out.println("Insurance Cost: " + bike.calculateInsurance());
        bike.getInsuranceDetails();
    }
}

