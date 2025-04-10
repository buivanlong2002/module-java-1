import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(3, 5);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(4,3, "red", false);
        Comparator<Rectangle> comparator = new RectangleComparator();
        // RectangleComparator comparator2 = new RectangleComparator();
        System.out.println("Pre-sorted array:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        Arrays.sort(rectangles, comparator);
        System.out.println("After-sorted array:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
