public class FizzBuzzTest {
    public static void main(String[] args) {

        test(3, "Fizz");
        test(5, "Buzz");
        test(15, "FizzBuzz");
        test(6, "Fizz");
        test(10, "Buzz");
        test(30, "FizzBuzz");
        test(7, "7");
    }

    public static void test(int number, String expected) {
        String result = FizzBuzz.fizzBuzz(number);
        if (result.equals(expected)) {
            System.out.println("Test passed for input: " + number);
        } else {
            System.out.println("Test failed for input: " + number);
            System.out.println("Expected: " + expected);
            System.out.println("Got: " + result);
        }
    }
}
