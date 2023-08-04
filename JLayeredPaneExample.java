import javax.swing.*;
import java.awt.*;

public class JLayeredPaneExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("JLayeredPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the main content panel (container)
        JPanel container = new JPanel();
        container.setLayout(null); // We will use absolute positioning
        frame.setContentPane(container);

        // Create a JLayeredPane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(100, 20, 200, 45);

        // User Name Panel
        RoundedPanel userPnl = new RoundedPanel(10);
        userPnl.setBackground(Color.RED);
        userPnl.setBounds(0, 0, 200, 45);
        layeredPane.add(userPnl, Integer.valueOf(1));

        // User Image Panel
        RoundedPanel userimgPnl = new RoundedPanel(10);
        userimgPnl.setBackground(Color.BLUE);
        userimgPnl.setBounds(100, 0, 100, 45);
        layeredPane.add(userimgPnl, Integer.valueOf(2));

        // Add the layeredPane to the container
        container.add(layeredPane);

        frame.setVisible(true);
    }
}
