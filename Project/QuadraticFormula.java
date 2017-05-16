/**
 * Computes the Quadratic Formula
 * 
 * 
 * @author (Justin Huynh) 
 * @version (Aug 18 2016)
 */
import java.util.Scanner;
import java.lang.Math; 
public class QuadraticFormula
{
    public static void main (String[]args)
    {Scanner input = new Scanner(System.in);
        
     System.out.print("What is the value of A? "); 
     double valueA = input.nextDouble();
     System.out.print("What is the value of B? "); 
     double valueB = input.nextDouble();
     System.out.print("What is the value of C? "); 
     double valueC = input.nextDouble();
     
     double determinant = (valueB * valueB) - (4 * valueA * valueC );
     double squareRoot = (double) Math.sqrt(determinant);
     double plus = (-1 * valueB + squareRoot) / 2 * valueA;
     double neg = (-1 * valueB - squareRoot) / 2 * valueA;  
     
     if(plus == neg)
        {System.out.println("x= " + plus + ".");
    }
     else
    {
     System.out.println("x= " + plus + " or " + neg + ".");
     
}
}
}