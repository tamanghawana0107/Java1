/* Build the counter application using java swing. It should contain 2 buttons to increase / decrease counter
 and one label to view the current counter number. Initial number must be 1. */
import java.lang.Thread;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter extends Thread implements ActionListener
{
    JFrame frame;
    JLabel label, label2;
    JTextField textF;
    JButton btn , btn2;
    int clicked;
    Counter()
    {
            frame = new JFrame("Counter Application");
            frame.setSize(400, 300);
            frame.setVisible(true);
            frame.setLocation(500, 100);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLayout(null);

            label = new JLabel();
            label.setText("Counter numbers");
            label.setBounds(10, 10, 120, 40);
            frame.add(label);

            label2 = new JLabel();
            label2.setBounds(10,50,350,40);
            frame.add(label2);
            
            btn = new JButton("Increase");
            btn.setBounds(10,100,100,30);
            frame.add(btn);
            btn.addActionListener(this);
            
            btn2 = new JButton("Decrease");
            btn2.setBounds(200,100,100,30);
            frame.add(btn2);
            btn2.addActionListener(this);
            
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn)
        {
            clicked++;
            label2.setText("Number of times the button is clicked " + clicked);
        }
        else if (e.getSource() == btn2)
        {
            clicked --;
            label2.setText("Number of times the button is clicked " + clicked);
        }
        else
        {
            System.out.println("no button clicked");
        }
       
    }
    
    
}
public class Application {
    public static void main(String[] args)
    {
        Counter obj = new Counter();
        obj.start();
        
    }
}