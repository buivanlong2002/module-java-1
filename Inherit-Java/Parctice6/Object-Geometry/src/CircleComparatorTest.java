import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(5.6);
        circles[2] = new Circle(3.6, "red", false);
        System.out.println("Pre-sorted array: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        // CircleComparator circleComparator = new CircleComparator();  // dùng khi cần truy cập vào các phương thức cụ thể của lớp
        Comparator<Circle> circleComparator1 = new CircleComparator();  // chỉ cần sử dụng đối tượng để so sánh
        Arrays.sort(circles, circleComparator1);
        System.out.println("After-sorted array: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
