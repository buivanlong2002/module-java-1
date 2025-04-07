public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 100000);  // ép kiểu từ số thực thành số nguyên
        }
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();
        System.out.println("Elapsed time for sorting: " + stopwatch.getElapsedTime() + " milliseconds.");
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}