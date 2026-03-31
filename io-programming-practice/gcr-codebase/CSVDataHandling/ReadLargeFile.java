import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {

    public static void main(String[] args) {

        String filePath = "E:\\heart_2020.csv";
        final int chunkSize = 100; //number of lines per batch
        int totalRecords = 0;       //total records processed
        int batchCount = 0;         //records in current batch
        boolean isHeader = true;   

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            //read file line by line
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                totalRecords++;
                batchCount++;

                //when 100 lines are processed
                if (batchCount == chunkSize) {
                    System.out.println("Processed records so far: " + totalRecords);
                    batchCount = 0; //reset batch counter
                }
            }

            //process remaining lines
            if (batchCount > 0) {
                System.out.println("Processed records so far: " + totalRecords);
            }

            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            System.out.println("Error reading large CSV file.");
            e.printStackTrace();
        }
    }
}

