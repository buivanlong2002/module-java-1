package controller;

import model.Student;
import service.StudentService;

public class StudentController {
    private final StudentService studentService = new StudentService();

    public void addStudent(Student student) {
        if (studentService.insertStudent(student)) {
            System.out.println("Đã thêm sinh viên: " + student.getName());
        } else {
            System.out.println("Thêm sinh viên thất bại: " + student.getName());
        }
    }

    public void updateStudent(Student student) {
        if (studentService.updateStudent(student)) {
            System.out.println("Đã cập nhật sinh viên: " + student.getEmail());
        } else {
            System.out.println("Cập nhật sinh viên thất bại: " + student.getEmail());
        }
    }

    public void deleteStudentByEmail(String email) {
        if (studentService.deleteStudentByEmail(email)) {
            System.out.println("Đã xóa sinh viên với email: " + email);
        } else {
            System.out.println("Xóa thất bại hoặc không tìm thấy sinh viên với email: " + email);
        }
    }
}
