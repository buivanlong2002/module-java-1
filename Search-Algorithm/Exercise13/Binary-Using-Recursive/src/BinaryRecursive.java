import java.util.Scanner;

public class BinaryRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int result = binarySearch(arr, 0, length -1, 11);
        if (result == -1) {
            System.out.println("No binary search");
        } else {
            System.out.println("Binary search in position: " + result + " in a binary array");
        }
    }
    public static int binarySearch(int[] arr, int left, int right, int value) {
        int mid = (left + right) / 2;
        while (left <= right) {
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySearch(arr, left, mid - 1, value);
            } else {
                return binarySearch(arr, mid + 1, right, value);
            }
        }
        return -1;
    }
}
