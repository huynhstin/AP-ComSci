/**
 * Creates new JFrame to display overlapping rectangles
 * 
 * @author (Justin Huynh) 
 * @version (10/7/16)
 */
import javax.swing.JFrame;
public class RectangleRunner
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("Rectangle");
        
        IntersectionRectangle rect = new IntersectionRectangle();
        frame.add(rect);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

