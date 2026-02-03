package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

//create a class with getters and setters
class Student2{
	private int rollNo;
	private String name;
	private int age;
	
	Student2(){}//default constructor ,required by jackson
	
	//parameterized constructor
	Student2(int rollNo,String name,int age){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
}
public class ConvertJavaObjectsIntoJsonArray {
	public static void main(String []args) {
		
		//list of students
		List<Student2> student=new ArrayList<>();
		
		//add the elements
		student.add(new Student2(1,"Abhinav",22));
		student.add(new Student2(2,"Abhay",21));
		student.add(new Student2(4,"Bharat",25));
		
		//create a object mapper
		ObjectMapper mapper=new ObjectMapper();
		
		try {
			String jsonArray=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
			
			System.out.println(jsonArray);
		}catch(Exception e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}

}
