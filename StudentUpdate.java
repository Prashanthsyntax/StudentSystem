import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new name: ");
        String name = sc.nextLine();

        System.out.print("Enter new email: ");
        String email = sc.nextLine();

        System.out.print("Enter new course: ");
        String course = sc.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentsdb?useSSL=false&serverTimezone=UTC",
                "root", ""
            );

            String sql = "UPDATE students SET name = ?, email = ?, course = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, course);
            stmt.setInt(4, id);

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("✅ Student updated successfully!");
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
