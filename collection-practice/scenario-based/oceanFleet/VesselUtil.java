package oceanFleet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VesselUtil {
    private List<Vessel> vesselList=new ArrayList<>();

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void addVesselPerformance(Vessel vessel){
        vesselList.add(vessel);
    }
    public Vessel getVesselById(String id){
        for(Vessel v:vesselList){
            if(v.getVesselId().equals(id)){
                return v;
            }
        }
        return null;
    }
    public List<Vessel> getHighPerformanceVessel(){
        List<Vessel> v=new ArrayList<>();
        double maxAvgSpeed=0.0;
        for(Vessel i:vesselList){
            if(i.getAverageSpeed()>maxAvgSpeed){
                maxAvgSpeed= i.getAverageSpeed();
            }
        }
        for(Vessel i:vesselList){
            if(i.getAverageSpeed()==maxAvgSpeed){
                v.add(i);
            }
        }
        return v;
    }
}
