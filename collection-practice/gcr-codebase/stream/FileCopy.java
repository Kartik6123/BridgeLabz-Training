import java.io.*;

class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File src = new File("source.txt");

            if (!src.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            fis = new FileInputStream(src);
            fos = new FileOutputStream("destination.txt");

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("IOException occurred");
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}

