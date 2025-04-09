import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        int[] arr = {-11, -1, 0, 1, 11};
        int[] newArr = Change(arr);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] Change(int[] arr) {
        if (arr != null && arr.length > 0) {
            arr[0] = 100;
        }
        return arr;
    }
}
