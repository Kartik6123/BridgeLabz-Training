import java.io.*;

public class InputStreamReaderOne {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");

            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // closes br → isr → fis (chain close)

        } catch (UnsupportedEncodingException e) {
            System.out.println("Encoding not supported");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
