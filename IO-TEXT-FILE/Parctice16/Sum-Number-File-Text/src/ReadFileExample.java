import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.printf("The sum of the numbers is: %d", sum);
        } catch (Exception e) {
            System.err.println("File does not exist or content error!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter file path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample reader = new ReadFileExample();
        reader.readFile(path);
    }
}