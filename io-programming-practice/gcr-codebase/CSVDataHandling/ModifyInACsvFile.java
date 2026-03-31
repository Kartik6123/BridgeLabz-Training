import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyInACsvFile {

    public static void main(String[] args) {

        // Path of input CSV file
        String inputFile = "E:\\CSV Files(java)\\employee.csv";

        // Path of output CSV file (new file)
        String outputFile = "E:\\CSV Files(java)\\employee_updated.csv";

        boolean isHeader = true;  // Used to identify header row

        // try-with-resources ensures both reader and writer are closed automatically
        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Read CSV file line by line
            while ((line = br.readLine()) != null) {

                // Write header row as it is
                if (isHeader) {
                    bw.write(line);
                    bw.newLine();
                    isHeader = false;
                    continue;
                }

                // Split the CSV row
                String[] data = line.split(",");

                String id = data[0].trim();
                String name = data[1].trim();
                String department = data[2].trim();
                double salary = Double.parseDouble(data[3].trim());

                // Increase salary by 10% if department is IT
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record to new CSV file
                bw.write(id + "," + name + "," + department + "," + (int) salary);
                bw.newLine();
            }

            System.out.println("Salary updated successfully for IT department employees.");

        } catch (IOException e) {
            // Handles file read/write errors
            System.out.println("Error processing the CSV file.");
            e.printStackTrace();
        }
    }
}

