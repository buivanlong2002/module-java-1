import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        try (
                InputStream is = new FileInputStream(source);
                OutputStream os = new FileOutputStream(dest, true)
        ) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) > 0) {
                os.write(buf, 0, len);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file path: ");
        String src = sc.nextLine();
        System.out.println("Enter destination file path: ");
        String dest = sc.nextLine();

        File srcFile = new File(src);
        File destFile = new File(dest);

        try {
            copyFile(srcFile, destFile);
            // copyFileUsingStream(srcFile, destFile);
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("File could not be copied");
            System.out.println(e.getMessage());
        }
    }
}
