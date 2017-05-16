/**
 * Write a description of class DriveCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DriveCar
{
    public static void main(String []args)
    {
        boolean user = true;
        while(user == true){
        Scanner input = new Scanner(System.in);
        Car myBeemer = new Car();
        
        System.out.print("What is the MPG? ");
        myBeemer.setMPG(input.nextDouble());
        System.out.print("Enter amount of gas to add to the tank: ");
        myBeemer.tank(input.nextDouble());
        System.out.print("How many miles do you want to drive? ");
        myBeemer.drive(input.nextDouble());
        
        System.out.println("Total fuel left: " +myBeemer.getFuelLevel());
        
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
