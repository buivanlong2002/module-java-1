import java.util.Scanner;
import java.util.Arrays;

public class MaxElementArray2D {
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
        int max = array[0][0];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.printf("Max element is: %d", max);
    }
}
