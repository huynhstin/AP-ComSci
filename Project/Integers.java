/**
 * Performs various operations with two integers
 * 
 * @author (Justin Huynh) 
 * @version (Aug 18 , 2016)
 */
import java.util.Scanner;
import java.lang.Math;
public class Integers
{
    public static void main (String[]args)
    {Scanner input = new Scanner(System.in); 
     
     System.out.print("What is the first integer? ");
     int valA = input.nextInt();
     System.out.print("What is the second integer? "); 
     int valB = input.nextInt();
     
     System.out.println("Sum = " + (valA + valB) + "");
     System.out.println("Difference = " + (valA - valB) + "");
     System.out.println("Product = " + (valA * valB) + "");
     System.out.println("Average = " + ((double)(valA + valB) / 2.0)+ "");
     System.out.println("Distance = " + (Math.abs(valA - valB)) + "");
     if(valA > valB)
       {System.out.println("Maximum = " + (valA) + "");
        System.out.println("Minimum = " + (valB) + "");
        }
        else 
        {
            if(valA == valB)
            {System.out.println("The values are equal. No maximum or minimum.");
            }
            else
            {
            System.out.println("Maximum = " + (valB) + "");
            System.out.println("Minimum = " + (valA) + "");
        }           
    }
}
}
