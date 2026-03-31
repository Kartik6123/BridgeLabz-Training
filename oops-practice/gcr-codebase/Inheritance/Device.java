package inheritance;
public class Device {
    //parent class
    String deviceId;
    String status;
    Device(String deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    void displayDetails(){
     System.out.println("Device ID :"+deviceId);
     System.out.println("Status :"+status);
    }
}
class Thermostat extends Device{
    //subclass
    double tempratureSetting;
    Thermostat(String deviceId, String status, double tempratureSetting){
        super(deviceId, status);
        this.tempratureSetting=tempratureSetting;
    }
    void display(){
     System.out.println("Device ID :"+deviceId);
     System.out.println("Status :"+status);
     System.out.println("Temperature :"+tempratureSetting);
    }
}
class Main{
    public static void main(String[] args) {
        Device dev=new Device("D1001","Active");
        dev.displayDetails();
        Thermostat ther=new Thermostat("T2001","Active",22.5);
        ther.display();
}
}