/**
 * Finds difference between two times
 * 
 * @author (Justin Huynh) 
 * @version (Aug 18, 2016)
 */
import java.util.Scanner;
public class TimeElapsed
{
   public static void main (String[]args) //second time - first time
   {Scanner input = new Scanner(System.in);
       
       System.out.print("Please enter the first time: ");
       int firstTime = input.nextInt();
       int firstHour = firstTime / 100;
       int firstMin = firstTime % 100;
       System.out.print("Please enter the second time: ");
       int secondTime = input.nextInt();
       int secondHour = secondTime / 100;
       int secondMin = secondTime % 100;
       
       if(secondTime > firstTime)
       { 
           if(secondMin < firstMin)
           {
           secondHour = secondHour - 1;
           secondMin = secondMin + 60;
        }
           int newHour = secondHour - firstHour;
           int newMin = secondMin - firstMin;
           System.out.println("" + newHour + " Hours " + newMin + " Minutes ");
       }
       else
       {
          firstMin = 60 - firstMin;
          firstHour = firstHour + 1;
          firstHour = 24 - firstHour;
          int finalHour = firstHour + secondHour; 
          int finalMin = firstMin + secondMin; 
          if(finalMin>=60)
          {
              finalMin = finalMin - 60; 
              finalHour = finalHour + 1; 
       }
          System.out.println("" + finalHour + " Hours " + finalMin + " Minutes ");   
}
}
}
