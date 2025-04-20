import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class StudentDeleteGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Delete Student");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JLabel idLabel = new JLabel("Enter Student ID:");
        idLabel.setBounds(30, 30, 120, 25);
        JTextField idField = new JTextField();
        idField.setBounds(160, 30, 150, 25);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(100, 80, 120, 30);

        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(30, 120, 280, 25);

        frame.add(idLabel);
        frame.add(idField);
        frame.add(deleteButton);
        frame.add(statusLabel);

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id;
                try {
                    id = Integer.parseInt(idField.getText());
                } catch (NumberFormatException ex) {
                    statusLabel.setText("❌ Invalid ID format!");
                    return;
                }

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
                        statusLabel.setText("✅ Student deleted successfully!");
                    } else {
                        statusLabel.setText("❌ Student ID not found.");
                    }

                    conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    statusLabel.setText("❌ Error deleting student.");
                }
            }
        });

        frame.setVisible(true);
    }
}
