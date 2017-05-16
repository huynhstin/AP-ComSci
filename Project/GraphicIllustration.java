/**
 * Does all the dirty graphic illustration
 * 
 * @author (Justin Huynh) 
 * @version (10/6/16)
 */
import javax.swing.JFrame;
import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class GraphicIllustration
{
    private int xTop, yLeft, width, height; // parameters for rectangle
    
    /**
     * Constructs new rectangle with given paramters
     * @param x x coordinate of rectangle
     * @param y y coordinate of rectangle
     * @param aWidth width of rectangle
     * @param aHeight height of rectangle 
     */
    public GraphicIllustration(int x, int y, int aWidth, int aHeight)
    {
        xTop = x;
        yLeft = y;
        width = aWidth;
        height = aHeight;
    }
    
    /**
     * Creates new flag
     * @g2 new object of type Graphics2D
     */

    public void illustrate(Graphics2D g2)
    {
        Rectangle redRect = new Rectangle(xTop, yLeft, width, height); // initialize rectangle redRect
        g2.setColor(Color.RED); // set color to red
        g2.draw(redRect); // draw outline of redRect
        g2.fill(redRect); // fill redRect with red
       
        Rectangle yellowRect = new Rectangle (xTop + width, yLeft, width, height);
        g2.setColor(Color.YELLOW);
        g2.draw(yellowRect);
        g2.fill(yellowRect);
        
        Rectangle greenRect = new Rectangle (xTop + width + width, yLeft, width, height);
        g2.setColor(Color.GREEN);
        g2.draw(greenRect);
        g2.fill(greenRect);
    }
}
