import java.util.Arrays;
import java.util.Scanner;

public class MegreArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter the length of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }
        int[] array3 = new int[size1 + size2];
        for (int k =0; k < size1; k++) {
            array3[k] = array1[k];
        }
        for (int k = size1; k < size1 + size2; k++) {
            array3[k] = array2[k - size1];
        }
        System.out.println(Arrays.toString(array3));
    }
}
