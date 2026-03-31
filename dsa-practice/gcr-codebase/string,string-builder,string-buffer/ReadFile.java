import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{
    public static void main(String[] args) {

        String filePath = "sample.txt";

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // closes BufferedReader and FileReader

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}