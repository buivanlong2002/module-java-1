import java.util.Scanner;

public class CharacterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String chain = scanner.nextLine();
        chain = chain.toLowerCase();
        System.out.println("Enter a character: ");
        String character = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == character.charAt(0)) {
                count++;
            }
        }
        System.out.println("The number of character occurrences is: " + count);
    }
}
