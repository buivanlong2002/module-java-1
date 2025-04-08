import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int count = 0;
            while (count < 5) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                    count++;
                }
                number++;
            }
        }
    }

