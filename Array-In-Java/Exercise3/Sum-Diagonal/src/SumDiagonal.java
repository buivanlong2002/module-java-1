import java.util.Scanner;
import java.util.Arrays;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the edge of the square matrix: ");
        int size = scanner.nextInt();

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter element %d,%d: ", i + 1, j + 1);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum1 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += array[i][i];
        }
        System.out.println("The sum is: " + sum1);

        int sum2 = 0;
        for (int i = size - 1; i >= 0; i--) {
            sum2 += array[i][size - i - 1];
        }
        System.out.println("The sum is: " + sum2);
    }
}
