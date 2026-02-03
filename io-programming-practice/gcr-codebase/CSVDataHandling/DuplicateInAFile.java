import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DuplicateInAFile {
    public static void main(String[] args) {
    	//file path
        String filePath = "E:\\CSV Files(java)\\duplicate.csv";
        //map to store ID
        HashMap<Integer, String[]> map = new HashMap<>();
        boolean isHeader = true; 
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; 
                    continue;
                }
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String age = data[2].trim();

                //check if ID already exists in the map
                if (map.containsKey(id)) {
                    //duplicate found
                    System.out.println("Duplicate ID: " + id + " - " + name + ", " + age);
                } else {
                    //store first occurrence
                    map.put(id, new String[]{name, age});
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in CSV.");
            e.printStackTrace();
        }
    }
}
