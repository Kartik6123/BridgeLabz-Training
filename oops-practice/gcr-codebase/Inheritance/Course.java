package inheritance;

public class Course {
    //parent class
 String courseName;
 int duration;
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }   
}
class OnlineCourse extends Course{
    //subclass
 String platform;
 boolean isRecorded;
 OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){
     super(courseName,duration);
     this.platform=platform;
     this.isRecorded=isRecorded;
 }

}
class paidOnlineCourse extends OnlineCourse{
    //subclass
    int fee;
    double discount;
    paidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,int fee,double discount){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;
    }
}
class Main{
    //main method
    public static void main(String[] args) {
        Course course=new Course("Java Programming",6);
        System.out.println("Course Name :"+course.courseName);
        System.out.println("Duration :"+course.duration+" months");
        System.out.println("--------------");
        OnlineCourse onlineCourse=new OnlineCourse("Web Development",4,"Udemy",true);
        System.out.println("Course Name :"+onlineCourse.courseName);
        System.out.println("Duration :"+onlineCourse.duration+" months");
        System.out.println("Platform :"+onlineCourse.platform);
        System.out.println("Is Recorded :"+onlineCourse.isRecorded);
        System.out.println("--------------");
        paidOnlineCourse paidCourse=new paidOnlineCourse("Data Science",5,"Coursera",false,500,10.0);
        System.out.println("Course Name :"+paidCourse.courseName);
        System.out.println("Duration :"+paidCourse.duration+" months");
        System.out.println("Platform :"+paidCourse.platform);
        System.out.println("Is Recorded :"+paidCourse.isRecorded);
        System.out.println("Fee :"+paidCourse.fee);
        System.out.println("Discount :"+paidCourse.discount+" %");
    }
}



