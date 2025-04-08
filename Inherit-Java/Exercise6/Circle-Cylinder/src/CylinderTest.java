public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(11);
        System.out.println(cylinder);
        cylinder = new Cylinder(5, 6, "green");
        System.out.println(cylinder);
    }
}
