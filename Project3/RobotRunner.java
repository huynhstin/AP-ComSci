/**
 * Runs Robot class
 * 
 * @author (Justin Huynh) 
 * @version (Dec 1 2016)
 */
import java.util.Scanner;
public class RobotRunner
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of tiles for robot:");
        int newItems = input.nextInt();
        System.out.println("Enter initial position of robot:");
        int newPos = input.nextInt();
        Robot robo = new Robot (newPos, newItems);
        
        for(int i = 0; i < newItems; i++)
        {
            System.out.println("Enter number of toys for robot at " + (i) + ":");
            int num = input.nextInt();
            robo.modHall(num, i);
        }
        
        while(true)
        {
            System.out.println(robo.retArray());
            System.out.println("Currently at " + robo.getPos() + " (" + (robo.getPos()+1) + " in array above).");
            if(robo. isRight()) System.out.println("Facing right.");
            else System.out.println("Facing left.");
            System.out.println("Press [1] to move.");
            System.out.println("Press [2] to clear hall.");
            System.out.println("Or press [3] to exit.");
            System.out.print("Enter selection: ");
            int select = input.nextInt();
            System.out.println(" " );
            
            if(select == 1)
            {
                robo.move();
            }
            else if(select == 2)
            {
                System.out.println("Hall cleared. ");
                System.out.println("Took " +robo.clearHall() + " moves.");
            }
            else
            {
                return;
            }
        }
    }


}
