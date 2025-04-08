public class Student {
    private final int numericalOrder;
    private final String name;
    private final int age;
    private final String gender;
    private static String college = "GymCode";
    Student(int numericalOrder, String name, int age, String gender) {
        this.numericalOrder = numericalOrder;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static void change() {
        college = "CodeGym";
    }

    void display() {
        System.out.println(numericalOrder + " " + name + " " + age + " " + gender + " " + college);
    }



}
