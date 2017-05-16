
/**
 * To test your RoachPopulation class
 * 
 * @author (Lucy) 
 * @version (10/4)
 */
import java.util.*;
public class Terminix
{
   public static void main(String[] args)
   {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial population of roach colony: ");
        int initialPop = input.nextInt();
        RoachPopulation lucy = new RoachPopulation(initialPop);
        boolean cont = true;
        while (cont == true)
        {
            System.out.println("Enter -1- to naturally breed the roaches.");
            System.out.println("Enter -2- to scientifically breed the roaches.");
            System.out.println("Enter -3- to spray the roaches.");
            System.out.println("Enter -4- to carpet bomb the roaches.");
            System.out.println("Enter -5- to check on population size.");
            System.out.println("--------------------------------");
            String action = input.next();
            if (action.equalsIgnoreCase("1"))
                lucy.breed();
            else if (action.equalsIgnoreCase("2"))
            {
                System.out.print("Enter the ratio.");
                double ratio = input.nextDouble();
                lucy.labBreed(ratio);
            }
            else if (action.equalsIgnoreCase("3"))
                lucy.spray();
            else if (action.equalsIgnoreCase("4"))
                lucy.wipeOut();
            else
                cont = false;
 
           
       
         }
         
         System.out.println("Surviving roach population: " + lucy.getRoaches());
         
        
    }
}
