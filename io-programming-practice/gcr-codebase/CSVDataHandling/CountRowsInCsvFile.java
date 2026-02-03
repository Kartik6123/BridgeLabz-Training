import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRowsInCsvFile {
    public static void main(String[] args) {

        //path of the csv file
        String filePath = "E:\\CSV Files(java)\\student.csv";
        int count = 0;      //stores number of data rows
        boolean isHeader = true;  //used to skip header row
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            //read file line by line
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                //count only data rows
                count++;
            }

            //print total number of records
            System.out.println("Total number of records: " + count);

        } catch (IOException e) {
            //handles file-related exceptions
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
    }
}
