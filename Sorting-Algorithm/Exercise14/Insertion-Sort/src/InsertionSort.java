import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter list size:");
            int size = scanner.nextInt();
            int[] list = new int[size];
            System.out.println("Enter " + list.length + " values:");
            for (int i = 0; i < list.length; i++) {
                list[i] = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.print("Your input list: ");
            for (int element : list) {
                System.out.print(element + " ");
            }
            System.out.println("\nBegin sort processing: ");
            insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            pos = i;
            x = list[i];
            boolean found = false;
            while (pos > 0 && list[pos - 1] > x) {
                System.out.print("Insert " + x + " into position " + list[pos -1] + "\n");
                list[pos] = list[pos - 1];
                pos--;
                found = true;
                System.out.println("Assign new value to x: " + list[pos]);
                list[pos] = x;
            }
            if (!found) {
                System.out.println("Array may be sorted and next pass not needed");
            }

            System.out.print("List after the  " + i + " sort: ");
            for (int element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
