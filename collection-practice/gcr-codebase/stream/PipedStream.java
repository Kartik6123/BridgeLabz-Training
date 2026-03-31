import java.io.*;

class PipedStream {

    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writer = new Thread(() -> {
                try {
                    String msg = "Hello from Writer Thread";
                    pos.write(msg.getBytes());
                    pos.close();
                } catch (IOException e) {
                    System.out.println("Writer error");
                }
            });

            Thread reader = new Thread(() -> {
                try {
                    int ch;
                    while ((ch = pis.read()) != -1) {
                        System.out.print((char) ch);
                    }
                    pis.close();
                } catch (IOException e) {
                    System.out.println("Reader error");
                }
            });

            writer.start();
            reader.start();

            writer.join();
            reader.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error occurred");
        }
    }
}
