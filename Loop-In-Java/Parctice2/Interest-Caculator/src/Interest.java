import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        double money = scanner.nextDouble();
        System.out.println("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        double interestTotal = 0;
        for (int i = 1; i <= month; i++) {
            interestTotal += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Interest total = " + interestTotal);
    }
}
