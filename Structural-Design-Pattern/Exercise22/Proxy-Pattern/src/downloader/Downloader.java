package downloader;

import java.io.IOException;

public interface Downloader {
    void download(String url, String destinationPath) throws IOException;
}
