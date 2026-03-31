import java.io.*;

class ImageByteArray {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ByteArrayOutputStream baos = null;

        try {
            File img = new File("input.jpg");

            if (!img.exists()) {
                System.out.println("Image file does not exist.");
                return;
            }

            fis = new FileInputStream(img);
            baos = new ByteArrayOutputStream();

            int b;
            while ((b = fis.read()) != -1) {
                baos.write(b);
            }

            byte[] imageBytes = baos.toByteArray();

            ByteArrayInputStream bais =
                new ByteArrayInputStream(imageBytes);

            fos = new FileOutputStream("output.jpg");

            while ((b = bais.read()) != -1) {
                fos.write(b);
            }

            System.out.println("Image converted successfully.");

        } catch (IOException e) {
            System.out.println("IOException occurred");
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
                if (baos != null) baos.close();
            } catch (IOException e) {
                System.out.println("Error closing streams");
            }
        }
    }
}
