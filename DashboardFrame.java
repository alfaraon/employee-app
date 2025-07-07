package motorph;

import javax.swing.*;

public class DashboardFrame extends JFrame {
    public DashboardFrame() {
        setTitle("MotorPH Dashboard");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new JLabel("Welcome to the Dashboard!", SwingConstants.CENTER));
        setVisible(true);
    }
}