import java.io.*;

class UpperToLower {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            bw = new BufferedWriter(new FileWriter("output.txt"));

            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("Conversion completed.");

        } catch (IOException e) {
            System.out.println("IOException occurred");
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.out.println("Error closing streams");
            }
        }
    }
}
