public class CalculatorTest {
    public static void main(String[] args) {
        testCalculateAdd();
        testCalculateSub();
        testCalculateMul();
        testCalculateDiv();
        testCalculateDivByZero();
        testCalculateWrongOperator();
    }

    public static void testCalculateAdd() {
        int result = Calculator.calculate(1, 1, '+');
        if (result == 2) {
            System.out.println("testCalculateAdd PASSED");
        } else {
            System.out.println("testCalculateAdd FAILED");
        }
    }

    public static void testCalculateSub() {
        int result = Calculator.calculate(2, 1, '-');
        if (result == 1) {
            System.out.println("testCalculateSub PASSED");
        } else {
            System.out.println("testCalculateSub FAILED");
        }
    }

    public static void testCalculateMul() {
        int result = Calculator.calculate(2, 2, '*');
        if (result == 4) {
            System.out.println("testCalculateMul PASSED");
        } else {
            System.out.println("testCalculateMul FAILED");
        }
    }

    public static void testCalculateDiv() {
        int result = Calculator.calculate(6, 3, '/');
        if (result == 2) {
            System.out.println("testCalculateDiv PASSED");
        } else {
            System.out.println("testCalculateDiv FAILED");
        }
    }

    public static void testCalculateDivByZero() {
        try {
            Calculator.calculate(2, 0, '/');
            System.out.println("testCalculateDivByZero FAILED");
        } catch (RuntimeException e) {
            System.out.println("testCalculateDivByZero PASSED");
        }
    }

    public static void testCalculateWrongOperator() {
        try {
            Calculator.calculate(2, 2, '=');
            System.out.println("testCalculateWrongOperator FAILED");
        } catch (RuntimeException e) {
            System.out.println("testCalculateWrongOperator PASSED");
        }
    }
}
