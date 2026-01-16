
class NoDriverAvailableException extends Exception {
    NoDriverAvailableException(String msg) {
        super(msg);
    }
}
public class Driver {
    String DriverName;
    String DriverID;
    int r = (int)(Math.random() * 2);
    Driver(String driverName, String driverID) throws NoDriverAvailableException {
        if(r==0){
        this.DriverName = driverName;
        this.DriverID = driverID;
    }
    else{
        throw new NoDriverAvailableException("Driver not available currently. Please try again later.");
    }
}
    User user;
     void displayDetails(){
        System.out.println("Driver Name: " + DriverName);
        System.out.println("Driver ID: " + DriverID);
        System.out.println("Booked by User :"+user.UserName);
    }
}
