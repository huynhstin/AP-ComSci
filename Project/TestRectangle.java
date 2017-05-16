/**
 * Write a description of class TestRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestRectangle
{
    public static void main(String []args)
    {
        boolean user = true;
        while(user == true){
        Scanner input = new Scanner(System.in);
        Rectangle a = new Rectangle();
        System.out.println("Enter rectangle width");
        a.setWidth(input.nextDouble());
        System.out.println("Enter rectangle length");
        a.setLength(input.nextDouble());
        
        System.out.println("Area = " +a.calculateArea());
        System.out.println("Perimeter = " +a.calculatePerim());
        
          //to ask the user to continue
            System.out.print("Continue (y/n)? ");
            Scanner input2 = new Scanner (System.in);
            
            String userInput = input2.nextLine();
            if (!userInput.equals("y"))
                user = false;
    }
    System.out.println("Finished");
}
}
