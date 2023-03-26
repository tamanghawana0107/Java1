// GUI calculator
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator implements ActionListener{
    public static JFrame fr = new JFrame("MY CALCULATOR");
    public static JTextField tf = new JTextField();
    public static JTextField tf1 = new JTextField();
    public static JTextField tf2 = new JTextField();
    public static JButton btn = new JButton();
    public static Calculator c = new Calculator();
    
    
    public void frame(){
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setSize(500, 500);
        fr.setResizable(false);
        fr.setLayout(null);
        fr.setVisible(true);
    
    
        //for upper textfield
        tf.setBackground(Color.gray);
        tf.setForeground(Color.WHITE);
        tf.setBounds(10, 10, 200, 40);
        //tf.setText("Enter the first number");
        fr.add(tf);

        //for lower textfield
        tf1.setBackground(Color.gray);
        tf1.setForeground(Color.WHITE);
        tf1.setBounds(10, 70, 200, 40);
        //tf1.setText("Enter the second number");
        fr.add(tf1);

 
        tf2.setBackground(Color.ORANGE);
        tf2.setBounds(10,120,200,40);
        fr.add(tf2);
   
        btn.setBackground(Color.GREEN);
        btn.setBounds(20,170,100,50);
        btn.setText("Calculate");
        btn.addActionListener(this);
        fr.add(btn);
    }
    public void actionPerformed(ActionEvent e){
        
        int num1 = Integer.parseInt(tf.getText());
        int num2 = Integer.parseInt(tf1.getText());
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
        tf2.setText(" " + sum);
       
    }
    public static void main(String[] args){
        c.frame();
    }
    
}