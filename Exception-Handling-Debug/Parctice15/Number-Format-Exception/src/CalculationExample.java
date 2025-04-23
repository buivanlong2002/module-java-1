import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number x: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter number y: ");
        int y = sc.nextInt();
        CalculationExample cal = new CalculationExample();
        cal.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum x + y is: " + a);
            System.out.println("Difference x - y is: " + b);
            System.out.println("Product x * y is: " + c);
            System.out.println("Quotient x / y is: " + d);
        } catch (Exception e) {
            System.out.println("Arithmetic Exception " + e.getMessage());
        }
    }
}
