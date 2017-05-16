/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Rectangle
{
   public double length;
   public double width;
   
   public Rectangle()
   {
       length = 1;
       width = 1;
    }
   
   public double getLength()
   {
       return length;
    }
    
   public double getWidth()
   {
       return width;
    }
   
   public void setLength(double newLength)
   {
       if(newLength >= 0)
        length = newLength;
    }
   
   public void setWidth(double newWidth)
   {
       if(newWidth >= 0)
        width = newWidth;
    }
    
   public double calculateArea()
   {
       return length * width;
    }
    
   public double calculatePerim()
   {
       return (length + width)*2;
    }
}
