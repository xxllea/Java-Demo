package test4;

import java.awt.*;
import javax.swing.*;

public class ShowColors extends JFrame {

   public ShowColors() {
        super("颜色的使用");     
        setSize(400, 130);
        setVisible(true);
   }

   public void paint( Graphics g ) {
      super.paint(g);

      g.setColor(new Color( 255, 0, 0 ));
      g.fillRect(25, 25, 100, 20);
      g.drawString("Current RGB: " + g.getColor(), 130, 40 );

      g.setColor(new Color( 0.0f, 1.0f, 0.0f ));
      g.fillRect(25, 50, 100, 20);
      g.drawString("Current RGB: " + g.getColor(), 130, 65);

      g.setColor(Color.blue);
      g.fillRect(25, 75, 100, 20);
      g.drawString("Current RGB: " + g.getColor(), 130, 90);
  
   }
} 

