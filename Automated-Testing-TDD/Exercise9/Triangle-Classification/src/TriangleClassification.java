public class TriangleClassification {
    public static String triangleType(double a, double b, double c) {
            if (a == b && b == c) {
                return "Equilateral Triangle";
            } else if (b == a || c == a || b == c) {
                return "Isosceles Triangle";
            } else if (a + b > c && a + c > b && b + c > a) {
                return "Regular Triangle";
            } else {
                return "Not a Triangle";
            }
    }
}