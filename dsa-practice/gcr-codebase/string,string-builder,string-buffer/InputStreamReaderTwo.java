import java.io.*;

public class InputStreamReaderTwo {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            FileWriter fw = new FileWriter("output.txt", true);

            String input;
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input);
                fw.write(System.lineSeparator());
            }

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
