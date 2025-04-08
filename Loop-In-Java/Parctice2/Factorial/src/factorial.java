import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a positive number: ");
        int n = scanner.nextInt();
        int factorial = 1;
        if (n < 0) {
            System.out.println("Please enter a positive number");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        }
        System.out.printf("The factorial of %d is %d", n, factorial);
    }
}
