public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(11, "Hoang", 18, "Female");
        Student s2 = new Student(22, "Marco", 19, "Female");
        Student s3 = new Student(33, "Juan", 20, "Male");

        s1.display();
        s2.display();
        s3.display();
    }
}