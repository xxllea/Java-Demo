package test1;

import java.awt.Graphics;
import javax.swing.JApplet;

public class WelcomeApplet extends JApplet {

    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("欢迎进入applet程序设计", 25, 25);
    }

}