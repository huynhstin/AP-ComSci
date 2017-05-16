/**
 * Animate Merge Sort
 * 
 * @author (Justin Huynh)
 * @version (Jan 10 2017)
 * 
 */
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MergeAnimate extends JComponent
{
    private int[] nums;
    private int[] nums2;
    private int size = 40;
    private Rectangle rect;
    private int b = 0;
    private int c = 0; 
    private int a = 0;
    private final int fwidth = 500;
    private final int fheight = 500;
    
    /**
     * Initialize new Rectangle with random values
     */
    public MergeAnimate()
    {  
        nums = new int[size];
        for(int i = 0; i < size; i++)
        {   
            Random g = new Random();
            nums[i] = g.nextInt(100) + 1;
        } 
        nums2 = nums.clone();
        rect = new Rectangle(50, 50, 50, 50);
    }
    
    /**
     * Return nums array
     * (Postcondition: nums returned)
     * @return nums
     * (Precondition: nums exists)
     */
    public int[] getNums()
    {
        return nums;
    }
    
    /**
     * Paintcomponent
     */
    public void paintComponent(Graphics g)
    {   
       int w = fwidth/size;
       Graphics2D g2 = (Graphics2D)g;
       for(int i = 0; i < size;i++)
       {
           Rectangle r = new Rectangle(0, w*i, nums2[i]*8, w);  
           g2.draw(r);
       }
    } 
    
    /**
     * Merge sort
     */
    public void merge(int[] arr, int p, int midpt, int r)
    {
        int leftSize = midpt - p  + 1;
        int rightSize = r - midpt;
        int[] left = new int [leftSize];
        int[] right = new int [rightSize];
 
        for (int i = 0; i < leftSize; ++i)
        {
            left[i] = arr[p + i];  
            nums2 = nums.clone();
            repaint();
        }
        
        for (int j = 0; j < rightSize; ++j)
        {
            right[j] = arr[midpt + 1 + j];   
            nums2 = nums.clone();
            repaint();
        }
        int i = 0;
        int j = 0;
        int k = p; 
        while(i < leftSize && j < rightSize)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++; 
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }      
        
        while (i < leftSize)
        {
            arr[k] = left[i];
            i++;
            k++;             
        }
        
        while (j < rightSize)
        {
            arr[k] = right[j];
            j++;
            k++;
        }          
    }
   
    /**
     * Recursively call merge sort
     */
    public void sort(int[] arr, int p, int r)
    { 
        if(p < r)
        {    
             int midpt = (int)Math.floor((p + r)/2);
             sort(arr, p, midpt);            
             sort(arr, midpt + 1, r);           
             merge(arr, p, midpt , r);
        }
    }

    public static void main(String[] args)
    {   
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        MergeAnimate r = new MergeAnimate();
        int [] nums3 = r.getNums();
        frame.add(r);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //inner clas
        class TimerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event) 
            {  
                r.sort(nums3, 0, nums3.length-1);  
            }
        }
        ActionListener l = new TimerListener();
        Timer t = new Timer(1000,l); // delays timer
        t.start();
    }   
}


