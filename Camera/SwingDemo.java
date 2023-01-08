package Camera;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SwingDemo extends JPanel {
   @Override
   public void paint(Graphics g) {
      Graphics2D graphic2d = (Graphics2D) g;
      graphic2d.setColor(Color.BLUE);
      graphic2d.fillRect(100, 50, 60, 80);
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame("Demo");
      frame.add(new SwingDemo());
      frame.setSize(550, 250);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}