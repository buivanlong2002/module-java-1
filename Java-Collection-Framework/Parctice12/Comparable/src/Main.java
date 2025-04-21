import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Marco", 30, "Germany");
        Student student2 = new Student("Reus", 36, "Germany");
        Student student3 = new Student("Hoang", 22, "VietNam" );
        Student student4 = new Student("Tran", 18, "VietNam" );
        Student student5 = new Student("Huy", 24, "Ha Nam");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.sort(new NameComparator());
        for (Student student : students) {
            System.out.println(student.toString());
        }
        students.sort(new AgeComparator());
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}