import java.util.Scanner;
import java.util.Arrays;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows of the array: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter the columns of the array: ");
        int size2 = scanner.nextInt();
        int[][] array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.printf("Enter element %d,%d: ", i + 1, j + 1);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Enter the column you want to sum: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < size1) {
            int sum = 0;
            for (int i = 0; i < size1; i++) {
                sum = sum + array[i][index + 1];
            }
            System.out.println(sum);
        } else {
            System.out.println("Invalid input! Please re-enter the number from 0 to " + size1);
            index = scanner.nextInt();
        }
    }
}
