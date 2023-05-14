import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Notepad {
    static JFrame fr = new JFrame("Notepad");
    static JButton btn = new JButton("Submit");
    static JPanel pnl1 = new JPanel();
    static JPanel pnl2 = new JPanel();
    static JPanel pnl3 = new JPanel();
    static JLabel lbl = new JLabel();
    static JTextField txtF = new JTextField();
    static File file = new File("Note.txt");
    public static void main(String[] args) throws IOException{
        //frame
        fr.setSize(400,400);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        fr.setVisible(true);

        //panel 1
        pnl1.setBackground(Color.DARK_GRAY);
        pnl2.setBackground(Color.lightGray);
        pnl3.setBackground(Color.DARK_GRAY);
        fr.add(pnl1, BorderLayout.NORTH);
        fr.add(pnl2, BorderLayout.CENTER);
        fr.add(pnl3, BorderLayout.SOUTH);

        //label
        lbl.setText(" !!! WELCOME TO THE NOTEPAD !!!");
        lbl.setSize(200, 60);
        lbl.setForeground(Color.white);
        pnl1.add(lbl);

        //Text Field
        txtF.setBounds(20, 20, 350, 250);
        pnl2.setLayout(null);
        pnl2.add(txtF);

        //button
        btn.setBackground(Color.white);
        btn.setBounds(175, 375, 100, 50);
        btn.setText("Submit");
        btn.setForeground(Color.black);
        pnl3.add(btn);

        //create a new file
        file.createNewFile();

        FileWriter pen = new FileWriter("Note.txt");
        int value;
        pen.write();
        System.out.println("New File Created");
        pen.close();
        
    }
    public void actionPerformed(ActionEvent e){

    }
}
