package oceanFleet;

public class Vessel {
    private String vesselName;
    private String vesselId;
    private double averageSpeed;
    private String vesselType;

    public String getVesselId(){
        return this.vesselId;
    }
    public void setVesselId(String vesselId){
        this.vesselId=vesselId;
    }
    public String getVesselName(){
        return this.vesselName;
    }
    public void setVesselName(String vesselName){
        this.vesselName=vesselName;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
    Vessel(){
        this.vesselName="";
        this.vesselId="";
        this.vesselType="";
        this.averageSpeed=0.0;
    }

    public Vessel(String vesselName, String vesselId, double averageSpeed, String vesselType) {
        this.vesselName = vesselName;
        this.vesselId = vesselId;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }
}
