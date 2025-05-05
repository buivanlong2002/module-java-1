import controller.StudentController;
import model.Student;

public class StudentApp {
    public static void main(String[] args) {
        StudentController controller = new StudentController();

        Student student1 = new Student("Bui Van Long", "long@example.com", "0912383888", "male", "2000-09-09");
        Student student2 = new Student("Nguyen Van A", "a@example.com", "0912783722", "male", "1996-01-01");

        controller.addStudent(student1);
        controller.addStudent(student2);

        Student updatedStudent = new Student("Nguyen Van A Updated", "a@example.com", "0988888888", "male", "1996-01-02");
        controller.updateStudent(updatedStudent);

        controller.deleteStudentByEmail("long@example.com");
    }
}
