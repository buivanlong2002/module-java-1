import java.util.Scanner;

public class AlgorithmComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        int[] countChar = new int[255];
        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);
            countChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (countChar[i] > max) {
                max = countChar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}

