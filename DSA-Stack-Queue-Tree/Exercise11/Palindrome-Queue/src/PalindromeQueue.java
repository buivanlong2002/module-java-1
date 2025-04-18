import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = sc.nextLine();
        char[] words = input.trim().toCharArray();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (Character c : words) {
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println("String " + input + " is Palindrome");
        } else {
            System.out.println("String " + input + " is not Palindrome");
        }
    }
}
