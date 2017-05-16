
/**
 * Write a description of class WinsLosses here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WinsLosses
{
   public static void main (String[]args)
   {int current = 0;
    int longest = 0;
   {Scanner input = new Scanner(System.in);
       System.out.println("Streak: ");
       String streak = input.nextLine();
       for(int i = 0; i < streak.length(); i++){
           if(streak.charAt(i) == 'L'){
      current = 0;
}
           if(streak.charAt(i) == 'W'){
               current++;
               if(current > longest)
               {
                   longest++;
                   }
 
}
}
 System.out.println(longest);
}
}
}