import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of rows: ");
                    int a = input.nextInt();
                    System.out.println("Enter the number of columns: ");
                    int b = input.nextInt();
                    for ( int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the number 1 - 4: ");
                    int square = input.nextInt();
                    System.out.println("Enter the number of rows: ");
                    int c = input.nextInt();
                    switch (square) {
                        case 1:
                            System.out.println("Print a triangle with a right angle on the upper left");
                            for (int i = c; i > 0; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Print a triangle with a right angle on the upper right");
                            for (int i = c; i > 0; i--) {
                                for (int j = 0; j < c - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = 0; k < i; k++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("Print a triangle with a right angle on the bottom left");
                            for (int i = c; i > 0; i--) {
                                for (int j = 0; j < c - i + 1; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("Print a triangle with a right angle on the bottom right");
                            for (int i = 0; i < c; i++) {
                                for (int j = 0; j < c - i - 1; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = 0; k < i + 1; k++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Invalid input!");
                    }
                case 3:
                    System.out.println("Enter the number of rows: ");
                    int n = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < 2 * i + 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
