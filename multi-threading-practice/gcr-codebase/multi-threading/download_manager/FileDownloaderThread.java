package download_manager;

import java.util.*;

class FileDownloaderThread extends Thread {
    private String fileName;

    public FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i <= 100; i += 10) {
            System.out.println("[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + i + "%");
            try {
                Thread.sleep(200 + random.nextInt(500));
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}

