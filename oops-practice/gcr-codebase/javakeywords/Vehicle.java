package javakeywords;

public class Vehicle {
     static int registrationFee;
     String ownerName;
     String vehicleType;
     final int registrationNumber;

     static int updateRegistrationFee(int fee) {
        // static method to set registration fee
        registrationFee = fee;
        return registrationFee;
}
    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        // constructor
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    void displayVehicleDetails() {
        // instance method
        if(this instanceof Vehicle){
            // using 'this' keyword
            System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType +
                               ", Registration Number: " + registrationNumber +
                               ", Registration Fee: " + registrationFee);
        }
    }
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150);
        Vehicle vehicle1 = new Vehicle("David", "Car", 5001);
        vehicle1.displayVehicleDetails();
    }
}
