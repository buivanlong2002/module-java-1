

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentApp {
    public static void main(String[] args) {
        // 1. Tạo Student mới
        Student student1 = new Student("Bui van long", "levanc@example.com");
        Student student2 = new Student("Bui van", "levancsss@example.com");

        // 2. Thông tin database
        String jdbcURL = "jdbc:mysql://localhost:3306/test"; // thay đổi nếu DB của bạn khác
        String dbUser = "root"; // user MySQL của bạn
        String dbPassword = "123456"; // password MySQL của bạn

        // 3. Thêm vào database
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, student1.getName());
            statement.setString(2, student1.getEmail());
            statement.executeUpdate();
            statement.setString(1, student2.getName());
            statement.setString(2, student2.getEmail());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Thêm sinh viên thành công!");
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}