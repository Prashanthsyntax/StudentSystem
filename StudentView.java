import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentView {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentsdb?useSSL=false&serverTimezone=UTC",
                "root", ""
            );

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("📋 Student List:");
            System.out.println("---------------------------------------------");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("---------------------------------------------");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
