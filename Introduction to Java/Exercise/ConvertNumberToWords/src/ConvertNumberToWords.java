import java.util.Scanner;

public class ConvertNumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tys = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String result;
        if (number < 0 || number >= 1000) {
            result = "Only numbers from 0 to 999 are supported.";
        } else if (number <= 9) {
            result = ones[number];
        } else if (number < 20) {
            result = teens[number - 10];
        } else if (number < 100) {
            result = tys[number / 10];
            if (number % 10 != 0) {
                result += "-" + ones[number % 10];
            }
        } else {
            result = ones[number / 100] + " hundred";
            int hundreds = number % 100;
            if (hundreds != 0) {
                result += " and";
                if (hundreds < 10) {
                    result += " " + ones[hundreds];
                } else if (hundreds < 20) {
                    result += " " + teens[hundreds - 10];
                } else {
                    result += " " + tys[hundreds / 10];
                    if (hundreds % 10 != 0) {
                        result += "-" + ones[hundreds % 10];
                    }
                }
            }
        }
        System.out.println(result);
    }
}
