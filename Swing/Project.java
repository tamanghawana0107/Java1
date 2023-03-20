import javax.swing.*;
import java.awt.*;



public class Project {
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("Language");
        fr.setSize(500, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setLayout(null);

        fr.getContentPane().setBackground(Color.CYAN);
        Label lab = new Label("Enter your name: ");
        lab.setBounds(50,50, 120, 50);
        fr.add(lab);

        JTextField tf = new JTextField();
        tf.setBounds(200, 60, 120, 30);
        fr.add(tf);

        Label lab1 = new Label("Choose an option");
        lab1.setBounds(100, 100, 120, 80);
        fr.add(lab1);

        Checkbox cb = new Checkbox("One piece");
        cb.setBounds(100, 200, 100, 50);
        fr.add(cb);

        Checkbox cb1 = new Checkbox("jujutsu kaisen");
        cb1.setBounds(100,250,100,50);
        fr.add(cb1);

        JButton button = new JButton("Submit");
        button.setBackground(Color.BLUE);
        button.setBounds(100, 325, 100, 40);
        fr.add(button);

    }
    

   
    
    
}
