package core;

import downloader.Downloader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloader implements Downloader {
    private final String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String urlStr, String destinationPath) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent", userAgent);

        try (
                InputStream in = connection.getInputStream();
                FileOutputStream out = new FileOutputStream(destinationPath)
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Downloaded to: " + destinationPath);
        } finally {
            connection.disconnect();
        }
    }
}
