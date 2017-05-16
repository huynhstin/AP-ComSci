
/**
 * Write a description of class Interaction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Interaction
{
    public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Hello. What is your name?  "); 
       String name = input.nextLine(); 
       
       System.out.print("How old are you?"); 
       int age = input.nextInt(); 
       
       System.out.print("Would you like some candy?");
       String candy = input.nextLine(); 
    }   
}