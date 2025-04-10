public class Circle extends Shape implements Colorable {
    private double radius;
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all sides of a circle");
    }
    @Override
    public String toString() {
        return "A Circle with area= " + getArea();
    }
}
