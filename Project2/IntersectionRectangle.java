/**
 * Checks to see if two rectangles overlap, and if true, returns area and fills with color
 * 
 * @author (Justin Huynh) 
 * @version (10/7/16)
 */

import javax.swing.JFrame;
import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class IntersectionRectangle extends JComponent
{  
   /**
    * Creates 2 rectangles, draws, checks for overlap 
    * @param g new object of graphics class
    */
   public void paintComponent (Graphics g){
   Graphics2D g2 = (Graphics2D)g; 
   
   Rectangle r1 = new Rectangle(0 , 0 , 400 , 300);
   Rectangle r2 = new Rectangle(200, 150 , 500 , 500);
   
   g2.draw(r1);
   g2.draw(r2);
   
   Rectangle r3 = r1.intersection(r2);
   g2.setColor(Color.PINK);
   g2.fill(r3);
   g2.setColor(Color.BLACK);
   
   double area = r3.getWidth() * r3.getHeight();
   
   g2.drawString(area + "", (int)r3.getCenterX() , (int)r3.getCenterY());
     
}
}

