public class FizzBuzzTranslate {
    public static String translate(int number) {
        return divisibleNumber(number);
    }

    private static String divisibleNumber(int number) {
        if (number <= 0 || number >= 100) {
            return "Enter a number between 0-100: ";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0 || existNumber(number) == 1) {
            return "Fizz";
        } else if (number % 5 == 0 || existNumber(number) == 2) {
            return "Buzz";
        } else {
            return numberToWords(number);
        }
    }
    private static String numberToWords(int number) {
        String[] units = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi",
                "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        if (number < 10) {
            return units[number];
        } else if (number < 20) {
            if (number == 10) return "mười";
            if (number == 15) return "mười lăm";
            return "mười " + units[number % 10];
        } else {
            int a = number / 10;
            int b = number % 10;
            String result = tens[a];
            if (b == 0) return result;
            if (b == 5) return result + " lăm";
            return result + " " + units[b];
        }
    }
    private static int existNumber(int number) {
        if (number % 10 == 3 || number / 10 == 3) return 1;
        if (number % 10 == 5 || number / 10 == 5) return 2;
        return 0;
    }
}
