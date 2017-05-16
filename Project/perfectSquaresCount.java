
/**
 * Write a description of class perfectSquaresCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class perfectSquaresCount
{
    public int perfectSquaresCount(int a)
    {int counter = 0;
     int i = 1;
        while(i*i <= a){
            counter++;
            i++;
        }
    return counter;
    }
}
