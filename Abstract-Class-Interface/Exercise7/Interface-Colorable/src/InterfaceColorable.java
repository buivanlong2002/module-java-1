public class InterfaceColorable {
    public static void main(String[] args) {
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle(3.6);
            shapes[1] = new Rectangle(4.2, 5.6);
            shapes[2] = new Square(6.6);
            for (Shape shape : shapes) {
                if (shape instanceof Colorable) {
                    ((Colorable) shape).howToColor();
                }
                System.out.println(shape);
            }
    }
}