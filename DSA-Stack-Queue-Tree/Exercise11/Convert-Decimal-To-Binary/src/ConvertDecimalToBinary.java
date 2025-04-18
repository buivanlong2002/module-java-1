import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void convertDecimalToBinary(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number: ");
        int num = sc.nextInt();
        int original = num;
        int size = (num == 0) ? 1 : (int) Math.ceil(Math.log(num + 1) / Math.log(2));
        array = new int[size];
        int i = 0;

        while (num > 0) {
            array[i++] = num % 2;
            num = num / 2;
        }

        if (original == 0) {
            array[0] = 0;
        }
        if (num < 0) {
            System.out.println("Negative number");
        } else {
            convertDecimalToBinary(array);
            System.out.println("Binary converted to " + original + " is: ");
            for (int element : array) {
                System.out.print(element);
            }
        }
    }
}
