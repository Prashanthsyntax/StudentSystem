import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class StudentUpdateGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Update Student");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JLabel idLabel = new JLabel("Student ID:");
        idLabel.setBounds(30, 30, 100, 25);
        JTextField idField = new JTextField();
        idField.setBounds(140, 30, 200, 25);

        JLabel nameLabel = new JLabel("New Name:");
        nameLabel.setBounds(30, 70, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(140, 70, 200, 25);

        JLabel emailLabel = new JLabel("New Email:");
        emailLabel.setBounds(30, 110, 100, 25);
        JTextField emailField = new JTextField();
        emailField.setBounds(140, 110, 200, 25);

        JLabel courseLabel = new JLabel("New Course:");
        courseLabel.setBounds(30, 150, 100, 25);
        JTextField courseField = new JTextField();
        courseField.setBounds(140, 150, 200, 25);

        JButton updateButton = new JButton("Update");
        updateButton.setBounds(130, 190, 120, 30);

        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(30, 230, 300, 25);

        frame.add(idLabel);
        frame.add(idField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(updateButton);
        frame.add(statusLabel);

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(idField.getText());
                    String name = nameField.getText();
                    String email = emailField.getText();
                    String course = courseField.getText();

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
                        statusLabel.setText("✅ Student updated successfully!");
                    } else {
                        statusLabel.setText("❌ Student ID not found.");
                    }

                    conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    statusLabel.setText("❌ Error updating student.");
                }
            }
        });

        frame.setVisible(true);
    }
}
