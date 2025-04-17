import java.util.Stack;

public class ReverseString {
    public static String reverseWords(String input) {
        Stack<String> wStack = new Stack<String>();
        String[] words = input.trim().split("\\s+");
        for (String word : words) {
            wStack.push(word);
        }

        StringBuilder output = new StringBuilder();
        while (!wStack.isEmpty()) {
            output.append(wStack.pop());
            if (!wStack.isEmpty()) {
                output.append(" ");
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String input = "Hello AS ajsdh ahsgdj LASKDALDS";

        System.out.println("The original string is: " + input);
        String reversed = reverseWords(input);
        System.out.println("The reverse string is: " + reversed);
    }
}
