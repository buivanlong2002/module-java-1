public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint();
        System.out.println(p1);
        MovablePoint p2 = new MovablePoint(4, 2, 3, 5);
        p2.move().move();
        System.out.println(p2);
    }
}
