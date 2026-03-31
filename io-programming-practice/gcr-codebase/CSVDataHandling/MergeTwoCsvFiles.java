import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MergeTwoCsvFiles {

    public static void main(String[] args) {
        //file path
        String file1 = "E:\\CSV Files(java)\\file1.csv";
        String file2 = "E:\\CSV Files(java)\\file2.csv";
        String outputFile = "E:\\CSV Files(java)\\files_merged.csv";

        //map to store student1 data
        HashMap<Integer, String[]> studentMap = new HashMap<>();
        //read first CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            boolean isHeader = true;
            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false; 
                    continue;
                }

                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String age = data[2].trim();

                studentMap.put(id, new String[]{name, age});
            }

        } catch (IOException e) {
            System.out.println("Error reading " + file1);
            e.printStackTrace();
        }

        //read second CSV and merge data
        try (BufferedReader br2 = new BufferedReader(new FileReader(file2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            boolean isHeader = true;

            //write header row to output file
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            while ((line = br2.readLine()) != null) {

                if (isHeader) {
                    isHeader = false; 
                    continue;
                }

                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String marks = data[1].trim();
                String grade = data[2].trim();

                //check if ID exists in first file
                if (studentMap.containsKey(id)) {
                    String name = studentMap.get(id)[0];
                    String age = studentMap.get(id)[1];

                    //write merged row
                    bw.write(id + "," + name + "," + age + "," + marks + "," + grade);
                    bw.newLine();
                }
            }

            System.out.println("CSV files merged successfully!");

        } catch (IOException e) {
            System.out.println("Error processing CSV files.");
            e.printStackTrace();
        }
    }
}
