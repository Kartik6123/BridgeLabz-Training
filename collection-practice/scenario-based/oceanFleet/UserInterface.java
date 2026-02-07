package oceanFleet;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("Enter number of vessels");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        sc.nextLine();
        VesselUtil n=new VesselUtil();
        for(int i=0;i<no;i++){

            String details=sc.nextLine();
            String arr[]=details.split(":");
            Vessel v=new Vessel(arr[1],arr[0],Double.parseDouble(arr[2]),arr[3]);
            n.addVesselPerformance(v);
        }
        System.out.println("Enter id to be searched");
        String str=sc.next();
        if(n.getVesselById(str)!=null){
            Vessel l=n.getVesselById(str);
            System.out.print(l.getVesselId()+"|"+l.getVesselName()+"|"+l.getVesselType()+"|"+l.getAverageSpeed()+"knots");
        }
        System.out.println("High Performance Vehicles are:");
        List<Vessel> list=n.getHighPerformanceVessel();
        for(Vessel l:list){
            System.out.print(l.getVesselId()+"|"+l.getVesselName()+"|"+l.getVesselType()+"|"+l.getAverageSpeed()+"knots");
            System.out.println();
        }
    }
}
