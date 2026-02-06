import java.util.Arrays;



import java.util.*;
//import java.util.stream.Collector;

public class DoctorAvailability {
    static class Doctor{
        private String name;
        private boolean isAvailable;
        private String speciality;

        public Doctor(String name,boolean isAvailable,String speciality){
            this.name=name;
            this.speciality=speciality;
            this.isAvailable=isAvailable;
        }

        public String getName(){
            return name;
        }
        public String getSpeciality(){
            return speciality;
        }

        public boolean getIsAvailable(){
               return isAvailable;
        }
    }
    public static void main(String[] args){

        List<Doctor> list=Arrays.asList(
            new Doctor("kartik",true,"gynacologist"),
            new Doctor("abhinav",true,"radiologist"),
            new Doctor("bharat",false,"neuro"),
            new Doctor("kartik",true,"physician")
            );

            List<Doctor>  availableDoctor=list.stream() 
                                          .filter(m->m.getIsAvailable())
                                          .sorted((a,b)->a.getSpeciality().compareTo(b.getSpeciality()))
                                          .toList();
             
            availableDoctor.forEach((d)->System.out.println(d.getName()));                            
                                          

    }
    
}
