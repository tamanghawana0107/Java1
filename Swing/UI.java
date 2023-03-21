import javax.swing.*;
import java.awt.*;

public class UI {
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("UI Design");
        
        fr.setSize(500,600);
        fr.setResizable(false);
        fr.setVisible(true);
        fr.setLayout(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label l = new Label("!!! This is my new UI design !!!");
        l.setBounds(100, 20, 200, 30);
        fr.add(l);

        Label l1 = new Label("Enter your name:");
        l1.setBounds(100, 50, 250, 40);
        fr.add(l1);

        JTextField tf = new JTextField("Name Please");
        tf.setBackground(Color.black);
        tf.setBounds(100, 100, 250, 40);
        tf.setForeground(Color.WHITE);
        fr.add(tf);

        Label l2 = new Label("Enter your Password:");
        l2.setBounds(100, 145, 250, 40);
        fr.add(l2);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(100, 175, 250, 60);
        fr.add(pf);

        JButton btn = new JButton("Submit");
        btn.setBackground(Color.ORANGE);
        btn.setBounds(100, 250, 100, 50);
        fr.add(btn);

        String[] arr = {"One Piece","Jujutsu Kaisen"};
        JComboBox cb = new JComboBox<String>(arr);
        cb.setBounds(100,350,200,40);
        fr.add(cb);
    }

}
