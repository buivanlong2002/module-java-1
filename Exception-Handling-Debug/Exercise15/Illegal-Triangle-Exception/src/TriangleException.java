import java.util.Scanner;
import java.util.InputMismatchException;


public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        try {
            System.out.print("Enter first side a: ");
            a = scanner.nextDouble();

            System.out.print("Enter second side b: ");
            b = scanner.nextDouble();

            System.out.print("Enter third side c: ");
            c = scanner.nextDouble();

            validateTriangle(a, b, c);

            System.out.println("Valid triangle!");

        } catch (InputMismatchException e) {
            System.out.println("Error! Please enter a valid number!");
        } catch (IllegalTriangleException e) {
            System.out.println("Error invalid triangle: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("The side of the triangle must be greater than 0.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("The edges do not satisfy the conditions to form a triangle.");
        }
    }
}
