import javax.swing.*;
import java.awt.*;

public class practiceTask {
    public static void main(String[] args){
        JFrame fr = new JFrame("phonebook1");
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setSize(400,400);
        fr.setVisible(true);
        fr.setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setName("File");
        p1.setBackground(Color.WHITE);
        fr.add(p1 , BorderLayout.NORTH);

        JLabel l1 = new JLabel("File");
        l1.setFont(new Font("Times New Roman",1,15));
        p1.add(l1);
        
        JLabel l2 = new JLabel("info");
        l2.setBounds(20, 30, 100, 40);
        fr.add(l2);
    }
}
