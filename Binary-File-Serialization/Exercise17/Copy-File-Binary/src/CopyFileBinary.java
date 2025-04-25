import java.io.*;

public class CopyFileBinary {
    public static void main(String[] args) {

        File sourceFile = new File("C:\\Users\\minht\\Desktop\\CodeGym Module2\\Binary-File-Serialization\\Exercise17\\Copy-File-Binary\\source.txt");

        if (!sourceFile.exists()) {
            System.out.println("File input does not exist!");
            return;
        }

        File targetFile = new File("C:\\Users\\minht\\Desktop\\CodeGym " +
                "Module2\\Binary-File-Serialization\\Exercise17\\Copy-File-Binary\\target.txt");

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalBytesCopied = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytesCopied += bytesRead;
            }

            System.out.println("Copy completed.");
            System.out.println("Total byte copied: " + totalBytesCopied);
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
