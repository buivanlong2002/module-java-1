import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Marco", 20, "Germany");
        Student student2 = new Student("Reus", 36, "Germany");
        Student student3 = new Student("Hoang", 22, "VietNam");
        Map<Integer, Student> studentMap = new HashMap<>();
//        studentMap.put(student1, "Marco");
//        studentMap.put(student2, "Reus");
//        studentMap.put(student3, "Hoang");
//        studentMap.put(student1, "Kwang");

        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println(studentMap.get(1));

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.toString() + "\n");
        }

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student : studentSet) {
            System.out.println(student.toString());
        }
    }
}