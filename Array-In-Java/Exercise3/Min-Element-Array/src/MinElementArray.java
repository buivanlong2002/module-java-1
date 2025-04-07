import java.util.Arrays;
import java.util.Scanner;

public class MinElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at position " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.printf("Min element is: %d", min);
    }
}
