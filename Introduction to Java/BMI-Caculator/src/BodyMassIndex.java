import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in m: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
