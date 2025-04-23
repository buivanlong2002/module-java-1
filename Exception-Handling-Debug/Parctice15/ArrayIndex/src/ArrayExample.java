import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arr = new ArrayExample();
        Integer[] newArr = arr.createArray();
        System.out.println("Enter index element: " );
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        try {
            System.out.println("Array element value at index: " + index + " is: " + newArr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index exceeds the length of the array!");
        }
    }

    public Integer[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        sc.nextLine();
        Integer[] arr = new Integer[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        return arr;
    }
}
