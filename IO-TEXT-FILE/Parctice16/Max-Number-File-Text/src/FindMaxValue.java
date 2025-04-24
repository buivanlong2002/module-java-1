import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
//        System.out.println("Enter filePath numbers: ");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
        List<Integer> numbers = readWriteFile.readFile("C:\\Users\\minht\\Desktop\\CodeGym " +
                "Module2\\IO-TEXT-FILE\\Parctice16\\Max-Number-File-Text\\numbers.txt");
        if (numbers.isEmpty()) {
            System.out.println("No numbers found");
            return;
        }
        int maxValue = findMax(numbers);
//        System.out.println("Enter file path output: ");
//        String output = scanner.nextLine();
        readWriteFile.writeFile("C:\\Users\\minht\\Desktop\\CodeGym Module2\\IO-TEXT-FILE\\Parctice16\\Max-Number-File-Text\\result.txt", maxValue);
    }
}
