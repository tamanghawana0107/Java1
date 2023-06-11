import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {

    public void paint(Graphics g) {
        g.drawRect(10,10,200,300);
        g.drawString("Hello World",40,50);
        String message = getParameter("message");
        g.drawString(message,100,200);
    }
}
