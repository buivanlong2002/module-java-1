import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dollar amount: ");
        double dollar = scanner.nextDouble();
        double vnd = dollar * 25000;
        System.out.printf("Dollar = " + dollar + " Dollar\n");
        System.out.printf("VND = " + vnd + " VND");
    }
}
