package test1;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Rectangle extends JApplet {

    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("这是一个矩形", 100, 90);
        g.drawRect(100, 100, 800, 400);

    }


}