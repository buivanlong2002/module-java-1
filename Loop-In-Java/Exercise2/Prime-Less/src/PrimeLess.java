import java.util.Scanner;

public class PrimeLess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int targetNumber = scanner.nextInt();
        int number = 2;

        while (number < targetNumber) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}