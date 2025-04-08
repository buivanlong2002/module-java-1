public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(1.1);
        System.out.println(circle);
        circle = new Circle(2.2, "white", true);
        System.out.println(circle);
    }
}
