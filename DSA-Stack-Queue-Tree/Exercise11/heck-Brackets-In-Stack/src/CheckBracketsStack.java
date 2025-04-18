import java.util.Scanner;
import java.util.Stack;

public class CheckBracketsStack {
    public static boolean isWellBrackets(char[] words) {
        Stack<Character> leftBracket = new Stack<>();
        for(char c : words) {
            if (c == '{' || c == '(' || c == '[') {
                leftBracket.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (leftBracket.isEmpty()) {
                    return false;
                }
                char leftChar = leftBracket.pop();
                if (!isBrackets(leftChar, c)) {
                    return false;
                }
            }
        }
        return leftBracket.isEmpty();
    }

    public static boolean isBrackets(char leftBracket, char rightBracket) {
        return (leftBracket == '(' && rightBracket == ')') ||
                (leftBracket == '[' && rightBracket == ']') ||
                (leftBracket == '{' && rightBracket == '}');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        char[] words = input.trim().toCharArray();
        isWellBrackets(words);
        System.out.println(input + " → " + (isWellBrackets(words) ? "Well" : "Not Well"));
    }
}
