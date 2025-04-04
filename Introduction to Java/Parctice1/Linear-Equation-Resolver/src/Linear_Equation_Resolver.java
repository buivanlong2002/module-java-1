import java.util.Scanner;

public class Linear_Equation_Resolver {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver");
        System.out.println("Give a equation as 'a * x + b = c', please enter a, b, c: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.println("This equation has no solution");
        } else {
            double x = (c - b) / a;
            System.out.println("x = " + x);
        }
    }
}
