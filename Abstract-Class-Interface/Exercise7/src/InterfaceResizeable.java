import java.util.Scanner;

public class InterfaceResizeable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive real number: ");
        double percent = sc.nextDouble();
        if (percent <= 0) {
            System.out.println("Invalid number. Please enter a positive real number!");
        } else {
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle(3.6);
            shapes[1] = new Rectangle(4.2, 5.6);
            shapes[2] = new Square(6.6);
            System.out.println("Pre-resize array: ");
            for (Shape shape : shapes) {
                System.out.println(shape);
            }
            for (Shape shape : shapes) {
                if (shape instanceof Resizeable) {
                    ((Resizeable) shape).resize(percent);
                }
            }
            System.out.println("After-resize array: ");
            for (Shape shape : shapes) {
                System.out.println(shape);
            }
        }
    }
}