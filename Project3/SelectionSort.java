
/**
 * Selection Sorting algorithm of an array with randomly generated integers
 * 
 * @author (Justin Huynh) 
 * @version (Jan 4, 2017)
 */
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SelectionSort extends JComponent
{
    public int[] nums; // array to sort
    public Random rand; // random number generator 
    public static int frameWidth;
    
    /**
     * Constructs a new SelectionSort with given size
     * @param arraySize how many numbers to generate and sort 
     */
    public SelectionSort(int arraySize)
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
     * Sorts an array of integers
     * (Postcondition: array is sorted from low to high)
     * @return sorted array
     * (Precondition: nums has at least 1 integer)
     */
    public void sort() throws InterruptedException
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                int index = i;
                if(nums[j] < nums[i]) 
                {
                    index = j;
                }
                if(index != i)
                {
                    swap(index, i, nums);
                    Thread.sleep(500);
                }
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
       // repaint();
       paintImmediately(0, 0, 1000, 700);
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
    
    /**
     * Use selection sort method
     
    public static void main(String [] args)
    {
        System.out.println("How many values?");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        SelectionSort s = new SelectionSort(size);
        s.sort();
        s.printArray();
    }
    */
   
    /**
    public static void main (String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        frame.setName("Moving Rectangle");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        SelectionSort s = new SelectionSort(10);
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
    */
  
    
    public static void main(String [] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        frame.setName("Moving Rectangle");
        SelectionSort s = new SelectionSort(20);
        frame.add(s);
        frame.setVisible(true);
        s.sort();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public int[] getArray()
    {
        return nums;
    }
}




