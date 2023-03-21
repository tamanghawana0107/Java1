import java.awt.Label;

import javax.swing.*;
import java.awt.*;
public class Task {
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("Task");
        fr.setSize(750,550);
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setLayout(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label l = new Label("!!! Welcome !!!");
        l.setBounds(350, 20, 200, 40);
        fr.add(l);
        Label l1 = new Label("Enter your college name:");
        l1.setBounds(50, 50, 200, 40);
        fr.add(l1);

        JTextField tf = new JTextField();
        tf.setBounds(50, 100, 200, 40);
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setForeground(Color.BLACK);
        fr.add(tf);

        Label l2 = new Label("Enter your name:");
        l2.setBounds(50, 135, 200, 40);
        fr.add(l2);

        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 175, 200, 40);
        tf1.setBackground(Color.LIGHT_GRAY);
        tf1.setForeground(Color.BLACK);
        fr.add(tf1);

        Label l3 = new Label("Choose your faculty:");
        l3.setBounds(50, 200, 200, 40);
        fr.add(l3);
        String[] arr = {"BIT","BIM","BBA","BBM","BBS"};
        JComboBox cb = new JComboBox<String>(arr);
        cb.setBounds(50,250,200,30);
        fr.add(cb);

        Label l4 = new Label("Choose gender:");
        l4.setBounds(300, 100, 200, 40);
        fr.add(l4);

        Checkbox chB = new Checkbox("Male");
        chB.setBounds(300, 150, 200, 40);
        fr.add(chB);

        Checkbox chB1 = new Checkbox("Female");
        chB1.setBounds(300, 175, 200, 40);
        fr.add(chB1);

        JButton btn = new JButton("Submit");
        btn.setBounds(300, 400, 200, 40);
        fr.add(btn);
    }
}
