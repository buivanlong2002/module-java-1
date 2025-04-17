import java.util.Stack;

public class ReverseArray {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int num : array) {
            stack.push(num);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The original array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        reverseArray(array);
        System.out.println("\nThe reversed array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

