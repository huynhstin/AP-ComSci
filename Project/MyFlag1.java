/**
 * Draws a flag of the country of choice
 * 
 * @author (Justin Huynh) 
 * @version (Oct 6 2016)
 *
 */
import javax.swing.JFrame;
import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class MyFlag1 extends JComponent // extends makes our class MyFlag1 a JComponent class; like copying. 
{
    /**
     * To complete all the drawing tasks 
     * Any painting must be done here
     * @param g the graphical tool to draw
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g; // uses newer version of Graphics, Graphics2D and casts object g to 2d. Must cast so method is called automatically 
        GraphicIllustration tutu = new GraphicIllustration(50, 50, 75, 150); // make changes in x y here
        tutu.illustrate(g2); //illustrates g2
    }
}