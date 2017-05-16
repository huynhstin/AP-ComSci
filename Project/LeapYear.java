
/**
 * Write a description of class LeapYear here.
 * 
 * @author (Justin Huynh) 
 * @version (Aug 22, 2016)
 */
import java.util.Scanner;
public class LeapYear
{
  public static void main (String[] args)
  {
      Scanner input = new Scanner(System.in); 
      System.out.print("Enter year: ");
      int year = input.nextInt();
      if(year % 4 == 0)
      {
          if(year % 100 == 0 && year >= 1582)
          {
              if(year % 400 ==0)
              { System.out.println("Is a leap year");
                return;
              }
          }
          else
          {
          System.out.println("Is a leap year");
          return;
        }
      }
          System.out.println("Not a leap year");
}
}



