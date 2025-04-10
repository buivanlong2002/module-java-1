import java.util.Arrays;

public class CompareCircleTest {
    public static void main(String[] args) {
        CompareCircle[] circles = new CompareCircle[3];
        circles[0] = new CompareCircle();
        circles[1] = new CompareCircle(5.0);
        circles[2] = new CompareCircle(3.3, "green", false);
        System.out.println("Pre-sorted array: ");
        for (CompareCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted array: ");
        for (CompareCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
