
/**
 * Write a description of class MovingRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MovingRectangle extends JComponent
{
    private Rectangle rect;
    public int frameWidth;
    public static SelectionSort s;
    public int arraySize;
    
    public MovingRectangle()
    {
        //rect = new Rectangle(0, 0, 50, 50); //start at 0,0; 50x50 size
        int frameWidth = 100;
        int arraySize = 30;
        s = new SelectionSort(arraySize);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        int width = frameWidth / s.getArray().length;
        
        for(int i = 0; i < s.getArray().length; i++)
        {
            Rectangle rect = new Rectangle(0, width * i, s.getArray()[i] * 8, width);
            g2.draw(rect);
        }
    }
    
    public void moveIt(int x, int y)
    {
        rect.translate(x, y);
        repaint(); //calling paintComponent method
    }
    
    public static void main (String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        frame.setName("Moving Rectangle");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //MovingRectangle r = new MovingRectangle();
        //frame.add(r);

        //inner class 
        class TimerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event) 
            {
                s.sort();
            }
        }
        
        ActionListener listener = new TimerListener();
        Timer t = new Timer(500, listener); //delay time of 1000 ms
        t.start(); //starts actionPerformed class every 1000 ms
    }
}

