import java.util.*;

public class TimeComplexityExample {

    // O(1): Độ phức tạp hằng số
    public static int constantTimeExample(int[] arr) {
        return arr[0];
    }

    // O(n): Độ phức tạp tuyến tính
    public static void linearTimeExample(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
    }

    // O(log n): Độ phức tạp logarit (tìm kiếm nhị phân)
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    // O(n log n): Độ phức tạp của thuật toán sắp xếp (Quick Sort) (trường hợp xấu là O(n2)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Hàm phân chia (partition) cho Quick Sort
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Đưa pivot về đúng vị trí
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // O(n^2): Độ phức tạp bình phương (sắp xếp nổi bọt - Bubble Sort)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int size = 111111;
        int[] originalArr = new Random().ints(size, 0, size).toArray();
        int[] arr;

        long start, end;

        // O(1)
        start = System.nanoTime();
        constantTimeExample(originalArr);
        end = System.nanoTime();
        System.out.println("O(1) - Element: ");
        System.out.println("Time: " + (end - start) + " ns\n");

        // O(n)
        start = System.nanoTime();
        linearTimeExample(originalArr);
        end = System.nanoTime();
        System.out.println("O(n) - Loop: ");
        System.out.println("Time: " + (end - start) + " ns\n");

        // O(log n)
        arr = Arrays.copyOf(originalArr, originalArr.length);
        Arrays.sort(arr);
        int target = arr[arr.length / 2];
        start = System.nanoTime();
        int result = binarySearch(arr, 0, arr.length - 1, target);
        end = System.nanoTime();
        System.out.println("O(log n) - Binary search found index: " + result);
        System.out.println("Time: " + (end - start) + " ns\n");

        // O(n log n) - Quick Sort
        arr = Arrays.copyOf(originalArr, originalArr.length);
        start = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        end = System.nanoTime();
        System.out.println("O(n log n) - Quick sort done.");
        System.out.println("Time: " + (end - start) + " ns\n");

        // O(n^2) - Bubble Sort
        arr = Arrays.copyOf(originalArr, 11111);
        start = System.nanoTime();
        bubbleSort(arr);
        end = System.nanoTime();
        System.out.println("O(n^2) - Bubble sort done.");
        System.out.println("Time: " + (end - start) + " ns\n");
    }
}