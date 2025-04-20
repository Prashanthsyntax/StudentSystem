import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentInsertGUI {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Student Insert Form");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels
        JLabel idLabel = new JLabel("Student ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel courseLabel = new JLabel("Course:");

        // Text fields
        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField courseField = new JTextField();

        // Button
        JButton submitButton = new JButton("Insert");

        // Set bounds (x, y, width, height)
        idLabel.setBounds(50, 30, 100, 25);
        idField.setBounds(150, 30, 180, 25);

        nameLabel.setBounds(50, 70, 100, 25);
        nameField.setBounds(150, 70, 180, 25);

        emailLabel.setBounds(50, 110, 100, 25);
        emailField.setBounds(150, 110, 180, 25);

        courseLabel.setBounds(50, 150, 100, 25);
        courseField.setBounds(150, 150, 180, 25);

        submitButton.setBounds(130, 210, 100, 30);

        // Add components to frame
        frame.add(idLabel); frame.add(idField);
        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(courseLabel); frame.add(courseField);
        frame.add(submitButton);

        frame.setVisible(true);

        // Button action
        submitButton.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String email = emailField.getText();
                String course = courseField.getText();

                // JDBC logic
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentsdb?useSSL=false&serverTimezone=UTC",
                    "root", ""
                );

                String sql = "INSERT INTO students (id, name, email, course) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, id);
                stmt.setString(2, name);
                stmt.setString(3, email);
                stmt.setString(4, course);

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(frame, "✅ Student inserted successfully!");
                }

                conn.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "❌ Error: " + ex.getMessage());
            }
        });
    }
}
