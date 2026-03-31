import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 class Student {

    private int id;
    private String name;
    private int age;
    private int marks;

    //constructor
    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // toString() method to print object details
    @Override
    public String toString() {
        return "Student [ID=" + id +", Name=" + name +", Age=" + age +", Marks=" + marks + "]";
    }
}


public class CsvToObjects {
    public static void main(String[] args) {
        String filePath = "E:\\CSV Files(java)\\student.csv";

        //list to store Student objects
        List<Student> studentList = new ArrayList<>();

        boolean isHeader = true;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
            	
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                //split csv line
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                int marks = Integer.parseInt(data[3].trim());

                //create Student object
                Student s = new Student(id, name, age, marks);
                //add object to list
                studentList.add(s);
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }

        //print all Student objects
        System.out.println("Student Records:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}

