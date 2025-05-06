package app;

import downloader.Downloader;
import proxy.FileDownloaderProxy;

public class Client {
    private final Downloader downloader;

    public Client() {
        this.downloader = new FileDownloaderProxy();
    }

    public void downloadFile(String url, String destination) {
        try {
            downloader.download(url, destination);
        } catch (Exception e) {
            System.err.println("Error downloading file: " + e.getMessage());
        }
    }
}
