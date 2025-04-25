import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ", "Hà Nội"));
        students.add(new Student(2, "Quân", "Hà Nam"));
        students.add(new Student(3, "Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Tùng", "Ninh Bình"));
        students.add(new Student(5, "Nhật", "Nam Định"));

        writeDataToFile("C:\\Users\\minht\\Desktop\\CodeGym " +
                "Module2\\Binary-File-Serialization\\Parctice17\\List-Student-Binary-File\\student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("C:\\Users\\minht\\Desktop\\CodeGym " +
                "Module2\\Binary-File-Serialization\\Parctice17\\List-Student-Binary-File\\student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
                students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return students;
    }
}
