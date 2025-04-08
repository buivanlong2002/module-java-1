public class Circle_ {
    private double radius = 1.0;
    private String color = "red";
    public Circle_() {
    }
    public Circle_(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

