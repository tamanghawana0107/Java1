import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;



public class Game extends JPanel {
    public Game g1 = new Game();

    int boxX = 10;
    int boxY = 10;
    Game(){
        //jkjdkj
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Click bhayo");
        boxX +=10;
        repaint();
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(10,10,100,100);

        g.setColor(Color.RED);
        g.fillRect(200,10,100,100);
    }
    
    public void render(){
        JFrame fr = new JFrame();
        fr.setLayout(null);
        fr.setSize(500, 300);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.add(g1);
    }
    
    
    public void main(String[] args){
        render();
    }
}
