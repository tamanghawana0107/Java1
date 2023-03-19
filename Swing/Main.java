import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame ("Hawana Tamang");
        JButton button = new JButton("Click!");
        JTextField txt = new JTextField("WELCOME");
        JToggleButton tb = new JToggleButton("toogleee");


        tb.setBounds(200,200,100,50);
        tb.setLayout(null);
        //tb.setVisible(true);
        frame.add(tb);


        txt.setSize(100,50);
        txt.setVisible(true);
        frame.add(txt);

        //button.setSize(100,200);
        button.setBounds(100,100,100,50);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.GREEN);
        //button.setVisible();
        frame.add(button);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
