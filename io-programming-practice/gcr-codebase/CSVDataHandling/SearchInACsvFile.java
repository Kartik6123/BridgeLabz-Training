import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SearchInACsvFile {
    public static void main(String[] args) {
        //path of the CSV file
        String filePath = "E:\\CSV Files(java)\\employee.csv";
        Scanner s = new Scanner(System.in);

        //taking employee name as input
        System.out.print("Enter employee name to search: ");
        String empName = s.nextLine().trim();

        boolean isHeader = true;   //to skip header row
        boolean isFound = false;   //to track search result
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            //read file line by line
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                //split CSV line using comma
                String[] data = line.split(",");
                String name = data[1].trim();
                //compare names
                if (name.equalsIgnoreCase(empName)) {
                    String department = data[2].trim();
                    String salary = data[3].trim();
                    System.out.println("Employee Found!");
                    System.out.println("Name      : " + name);
                    System.out.println("Department: " + department);
                    System.out.println("Salary    : " + salary);
                    isFound = true;
                    break; //stop searching after finding record
                }
            }

            //if employee is not found
            if (!isFound) {
                System.out.println("Employee not found.");
            }

        } catch (IOException e) {
            //handles file read errors
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }

    }
}
