import javax.swing.*;

public class MainDashboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton insertButton = new JButton("Insert Student");
        JButton updateButton = new JButton("Update Student");
        JButton deleteButton = new JButton("Delete Student");
        JButton viewButton = new JButton("View Students");

        insertButton.setBounds(100, 30, 200, 40);
        updateButton.setBounds(100, 80, 200, 40);
        deleteButton.setBounds(100, 130, 200, 40);
        viewButton.setBounds(100, 180, 200, 40);

        frame.add(insertButton);
        frame.add(updateButton);
        frame.add(deleteButton);
        frame.add(viewButton);

        frame.setVisible(true);

        // Hook all buttons to their respective GUI classes
        insertButton.addActionListener(e -> StudentInsertGUI.main(null));
        updateButton.addActionListener(e -> StudentUpdateGUI.main(null));
        deleteButton.addActionListener(e -> StudentDeleteGUI.main(null));
        viewButton.addActionListener(e -> StudentViewGUI.main(null));
    }
}
