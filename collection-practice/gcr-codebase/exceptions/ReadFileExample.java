import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            if (line == null) {
                throw new IOException("File is empty");
            }

            do {
                System.out.println(line);
            } while ((line = br.readLine()) != null);

            br.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }  
    }
}
