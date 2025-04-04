import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = 1;
        if (a == 0 || b == 0) {
            System.out.println("No greater common factor");
            return;
        } else {
            for (int i = 1; i <= a / 2 && i <= b / 2; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
        }
        System.out.println("Greatest common factor is " + gcd);
    }
}
