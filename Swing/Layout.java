//layout in java 
import java.awt.*;

import javax.swing.*;
public class Layout{


    public static void main(String[] args){
        JFrame fr = new JFrame();
        fr.setSize(500, 500);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        fr.setVisible(true);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.black);
        fr.add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        fr.add(p2, BorderLayout.EAST);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.red);
        //p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        fr.add(p3, BorderLayout.WEST);

        JPanel p4 = new JPanel();
        p4.setBackground(Color.blue);
        fr.add(p4, BorderLayout.SOUTH);
        //p4.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JPanel p5 = new JPanel();
        p5.setBackground(Color.orange);
        fr.add(p5, BorderLayout.CENTER);

        /*JButton btn = new JButton("Click me !");
        btn.setBackground(Color.WHITE);
        btn.setForeground(Color.black);
        btn.setBounds(10, 10, 120, 50);
        p1.add(btn);*/
        
        //p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p5.setLayout(new GridLayout(2,2));
        p5.add(new JButton("Dont click"));
        p5.add(new JButton("Dont click"));
        p5.add(new JButton("Dont click"));
        //p1.add(new JButton("Click me !"));
    }
}