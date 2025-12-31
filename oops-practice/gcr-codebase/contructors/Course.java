package contructors;

public class Course {
 String courseName;
int duration;
int fees;
static String instituteName="GLA";
   Course(){
    // Default constructor
    courseName="";
    duration=0;
    fees=0;
}
    Course(String courseName,int duration,int fees){
     // Parameterized constructor
     this.courseName=courseName;
     this.duration=duration;
     this.fees=fees;
    }
    void display(){
     // Display course details
     System.out.println("Course Name: "+courseName);
     System.out.println("Duration: "+duration+" months");
     System.out.println("Fees: "+fees);
     System.out.println("Institute Name: "+instituteName);
    }
    public static void main(String[] args) {
     Course c1=new Course();
     c1.display();
    }
}
