package service;

import config.DBConfig;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class StudentService {

    public boolean insertStudent(Student student) {
        String sql = "INSERT INTO students (name, email, phone, gender, birthday) VALUES (?, ?, ?, ?, ?)";
        return executeStudentUpdate(student, sql, false);
    }

    public boolean updateStudent(Student student) {
        String sql = "UPDATE students SET name = ?, phone = ?, gender = ?, birthday = ? WHERE email = ?";
        return executeStudentUpdate(student, sql, true);
    }

    public boolean deleteStudentByEmail(String email) {
        String sql = "DELETE FROM students WHERE email = ?";
        try (
                Connection connection = DBConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, email);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean executeStudentUpdate(Student student, String sql, boolean isUpdate) {
        try (
                Connection connection = DBConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, student.getName());

            if (isUpdate) {
                statement.setString(2, student.getPhone());
                statement.setString(3, student.getGender());

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date parsedDate = sdf.parse(student.getBirthday());
                java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

                statement.setDate(4, sqlDate);
                statement.setString(5, student.getEmail());
            } else {
                statement.setString(2, student.getEmail());
                statement.setString(3, student.getPhone());
                statement.setString(4, student.getGender());

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date parsedDate = sdf.parse(student.getBirthday());
                java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

                statement.setDate(5, sqlDate);
            }

            return statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
