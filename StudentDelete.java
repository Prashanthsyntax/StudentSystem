import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentsdb?useSSL=false&serverTimezone=UTC",
                "root", ""
            );

            String sql = "DELETE FROM students WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("✅ Student deleted successfully!");
            } else {
                System.out.println("❌ Student ID not found.");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
