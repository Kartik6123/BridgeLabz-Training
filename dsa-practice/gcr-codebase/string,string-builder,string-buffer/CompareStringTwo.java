import java.io.*;

public class CompareStringTwo {

    public static void main(String[] args) {

        int n = 1_000_000;
        String data = "hello";

        long start, end;

        
        // StringBuilder
        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(data);
        }
        end = System.nanoTime();
        System.out.println("StringBuilder time (ns): " + (end - start));

        // StringBuffer
        StringBuffer sbuf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbuf.append(data);
        }
        end = System.nanoTime();
        System.out.println("StringBuffer time (ns): " + (end - start));

        
        String fileName = "large.txt"; // use a large text file (~100MB)

        try {
            // FileReader
            start = System.nanoTime();
            int wordsFR = countWordsUsingFileReader(fileName);
            end = System.nanoTime();
            System.out.println("FileReader word count: " + wordsFR);
            System.out.println("FileReader time (ns): " + (end - start));

            // InputStreamReader
            start = System.nanoTime();
            int wordsISR = countWordsUsingInputStreamReader(fileName);
            end = System.nanoTime();
            System.out.println("InputStreamReader word count: " + wordsISR);
            System.out.println("InputStreamReader time (ns): " + (end - start));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int countWordsUsingFileReader(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            if (!line.isEmpty())
                count += line.split("\\s+").length;
        }

        br.close();
        return count;
    }

    static int countWordsUsingInputStreamReader(String file) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "UTF-8")
        );

        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            if (!line.isEmpty())
                count += line.split("\\s+").length;
        }

        br.close();
        return count;
    }
}
