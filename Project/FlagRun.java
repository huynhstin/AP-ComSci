
/**
 * Write a description of class FlagRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   import javax.swing.JFrame;
public class FlagRun
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("Italian Flag");
        
        MyFlag flag = new MyFlag();
        frame.add(flag);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

