import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file path input: ");
        String sourcePath = scanner.nextLine();
        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("File input does not exist!");
            return;
        }

        System.out.print("Enter file path output: ");
        String targetPath = scanner.nextLine();
        File targetFile = new File(targetPath);

        int charCount = 0;
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile), "UTF-8"));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetFile), "UTF-8"))
        ) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
                charCount++;
            }

            writer.write("\nTotal characters of file: " + charCount);
            System.out.println("Copy completed.");
            System.out.println("Total characters copied: " + charCount);
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
