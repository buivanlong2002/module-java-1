package app;

import calculator.Calculator;
import proxy.MathCalculatorProxy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new MathCalculatorProxy();

        double result = calculator.add(1, 2);
        System.out.println("1 + 2 = " + result);

        // Gây lỗi (Out of range)
        result = calculator.add(2, Double.MAX_VALUE);
        System.out.println("2 + Double.MAX_VALUE = " + result);
    }
}
