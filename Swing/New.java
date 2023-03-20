import javax.swing.*;
import java.awt.*;

public class New{
    public static void main(String[] args){
        JFrame frame = new JFrame("New Project");
        frame.setResizable(false);      // resize feature is off
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the program
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.cyan);

        JTextArea a = new JTextArea("DD");
        a.setBorder(null);
        frame.add(a);
    }
}