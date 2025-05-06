package proxy;

import core.FileDownloader;
import downloader.Downloader;

import java.io.IOException;

public class FileDownloaderProxy implements Downloader {
    private static final String FIREFOX_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:113.0) Gecko/20100101 Firefox/113.0";

    @Override
    public void download(String url, String destinationPath) throws IOException {
        FileDownloader realDownloader = new FileDownloader(FIREFOX_UA);
        realDownloader.download(url, destinationPath);
    }
}
