package contructors;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registraionFee;
    Vehicle(){
        // Default constructor
        ownerName="";
        vehicleType="";
    }
    Vehicle(String ownerName,String vehicleType){
        // Parameterized constructor
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    static void updateRegistrationFee(int fee){
        registraionFee=fee;
        }
    void display(){
        // Display vehicle details
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Registration Fee: "+registraionFee);
    }
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(5000);
        Vehicle v=new Vehicle("Kartik","CAR");
        v.display();
    }
}
