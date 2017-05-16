/**
 * Insertion Sorting algorithm of an array with randomly generated integers
 * 
 * @author (Justin Huynh) 
 * @version (Jan 4, 2017)
 */
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InsertionAnimation extends JComponent
{
    public int[] nums; // array to sort
    public Random rand; // random number generator 
    public static int frameWidth;
    
    /**
     * Constructs a new InsertionSort with given size
     * @param arraySize how many numbers to generate and sort 
     */
    public InsertionAnimation(int arraySize)
    {
        nums = new int[arraySize];
        rand = new Random();
        frameWidth = 600;
        fillArray(nums);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        int width = frameWidth /nums.length;
        
        for(int i = 0; i < nums.length; i++)
        {
            Rectangle rect = new Rectangle(0, width * i, nums[i] * 8, width);
            g2.draw(rect);
        }
    }
    
    /**
     * Fills array with randomly generated integers
     * (Postcondition: array filled with randomly generated integers)
     * @param nums array to fill
     * (Precondition: nums has at least 1 integer)
     */
    public void fillArray(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
           nums[i] =  rand.nextInt(100) + 1;
        }
    }
    
    /**
     * Insertion Sort algorithim 
     * (Postcondition: array is returned sorted)
     * @return sorted array
     * (Precondition: nums has at least 2 elements)
     */
    public void sort()
    {
        for(int i = 0; i < nums.length; i++)
        {
            int afterI = i;
            while(afterI > 0 && nums[afterI - 1] > nums[afterI])
            {
                swap(afterI , afterI-1, nums);
			    afterI--;
			    return;
            }
        }
        //return nums;
    }
    
    /**
     * Swaps variables in an array
     * (Postcondition: the variable at index i becomes the variable at index j and vice versa)
     * @param i first index to swap
     * @param j second index to swap
     * @param arr array to swap from
     * (Precondition: there are at least two variables in arr)
     */
    public void swap(int i, int j, int[] arr) 
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        repaint();
    }
    
    /**
     * Prints out array 
     * (Postcondition: array is printed)
     * (Precondition: nums exists)
     */
    public void printArray()
    {
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
   
   public static void main (String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        frame.setName("Moving Rectangle");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        InsertionAnimation s = new InsertionAnimation(40);
        frame.add(s);

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

   public int[] getArray()
   {
       return nums;
   }
}