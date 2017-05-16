/**
 * Creates flag frame and runs
 * 
 * @author (Justin Huynh) 
 * @version (10/6/16)
 */

import javax.swing.JFrame;
public class FlagRun1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame(); // creates new JFrame
        frame.setSize(1000, 1000); // set size of frame to 1000x1000
        frame.setTitle("Guinea Flag"); // set title 
        
        MyFlag1 flag = new MyFlag1(); // creates new object flag in MyFlag1 class
        frame.add(flag); // add flag to frame 
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit program on close
        frame.setVisible(true); // make frame visible
    }
}
