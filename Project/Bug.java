
/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug
{
   public int finalPosition;
   public int direction;
   
   public Bug(int position)
   {
       finalPosition = position;
       direction = 1;
    }
   
   public void turn()
   {
       direction = direction * -1;
    }
    
   public void move()
   {
       finalPosition = finalPosition + direction;
    }
    
   public int getPosition()
   {
       return finalPosition;
    }
}
