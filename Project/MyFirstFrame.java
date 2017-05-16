
/**
 * Creates an empty frame
 * 
 * @author (Justin Huynh) 
 * @version (Oct 4 2016)
 * 
 * To show a frame 
 * 1) Construct an object of JFrame class and import JFrame method
 *      import javax.swing.JFrame;
 *      JFrame frame = new JFrame();
 *      
 * 2) Set the size of the frame 
 *      frame.setSize(300, 400)
 *      // 300 pixels wide, 400 pixels tall (height)
 *      // default size is (0, 0)
 *      
 * 3) (Optional) - Naming the frame. 
 *      frame.setTitle("My first love");
 *      
 * 4) Set the "default close operation"
 *      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *      // if omitted, the program continues running even after the frame is closed.
 *      // all caps because final
 *      // public instance variable (referred to by object name, not method)
 *      
 * 5) Make the frame visible
 *      frame.setVisible(true);
 */

import javax.swing.JFrame;
public class MyFirstFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("Mr. Kuang's fan club");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
