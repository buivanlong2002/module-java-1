import java.util.Scanner;
import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {
        int[] arr = {-1111, -111, -11, 0, 1, 11, 111, 1111};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an add element: ");
        int add_element = scanner.nextInt();
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Invalid index");
        } else {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = add_element;
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            System.out.println(Arrays.toString(newArr));
        }
    }
}