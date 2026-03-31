import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadACsvFile {
    public static void main(String[] args) {
        String filePath = "E:\\CSV Files(java)\\student.csv";  //source file path
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;   //read the line
            boolean isHeader = true;
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                //split the line using comma as delimiter
                String[] data = line.split(",");

                try {
                	
                	//trim used to remove extra spaces form csv file
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    int marks = Integer.parseInt(data[3].trim());

                    System.out.println("Student ID : " + id);
                    System.out.println("Name       : " + name);
                    System.out.println("Age        : " + age);
                    System.out.println("Marks      : " + marks);
                    System.out.println();
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in line: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
    }
}
