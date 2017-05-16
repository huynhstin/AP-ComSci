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

public class MyFlag extends JComponent // extends makes our class MyFlag a JComponent class; like copying. 
{
    /**
     * To complete all the drawing tasks 
     * Any painting must be done here
     * @param g the graphical tool to draw
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g; // uses newer version of Graphics, Graphics2D and casts object g to 2d. Must cast so method is called automatically 
        
        TuPham tutu = new TuPham(0, 0, 200, 400); // make changes in x y here
        tutu.illustrate(g2);
    }
}