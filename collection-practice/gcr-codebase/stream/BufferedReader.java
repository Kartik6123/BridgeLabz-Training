import java.io.*;

class BufferedReader {
    public BufferedReader(InputStreamReader inputStreamReader) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        File src = new File("source.txt");

        if (!src.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        byte[] buffer = new byte[4096];

        // -------- Unbuffered Streams --------
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream("unbuffered_copy.txt");

            long start = System.nanoTime();

            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long end = System.nanoTime();
            System.out.println("Unbuffered Time (ns): " + (end - start));

            fis.close();
            fos.close();

        } catch (IOException e) {
            System.out.println("Error in unbuffered streams");
        }

        // -------- Buffered Streams --------
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffered_copy.txt"));

            long start = System.nanoTime();

            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long end = System.nanoTime();
            System.out.println("Buffered Time (ns): " + (end - start));

            bis.close();
            bos.close();

        } catch (IOException e) {
            System.out.println("Error in buffered streams");
        }
    }

    public String readLine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readLine'");
    }

    public void close() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
}
