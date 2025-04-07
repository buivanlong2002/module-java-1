import java.util.Scanner;
import java.util.Arrays;

public class DeleteElement {

    public static void main(String[] args) {
        int[] arr = {-1111, -111, -11, 0, 1, 11, 111, 1111};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an delete element: ");
        int delete_element = scanner.nextInt();
        int[] newArr = new int[arr.length];
        boolean exist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delete_element) {
                exist = true;
                for (int j = 0; j < i; j++) {
                    newArr[j] = arr[j];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
                newArr[arr.length - 1] = 0;
            break;
            }
        }
        if (exist) {
            System.out.println("Array after: " + Arrays.toString(newArr));
        } else {
            System.out.println("Element not exist in array.");
        }
    }
}