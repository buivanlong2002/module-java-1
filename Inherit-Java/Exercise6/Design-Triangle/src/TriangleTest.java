public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);
        Triangle triangle2 = new Triangle(8, 9, 10);
        System.out.println(triangle2);
        Triangle triangle3 = new Triangle(5, 6, 7, "black", false);
        System.out.println(triangle3);
    }
}
