
/**
 * Write a description of class LCM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeastComMult
{
    public static int LCM(int a, int b)
    {
        return Math.abs(a * b) / gcd(a, b);
    }
    
    public static int gcd(int a, int b)
    {
        if(a == 0 || b == 0) 
        {
            return a + b; 
        }
        return gcd(b, a % b);
    }
    
    public static int LMC(int a, int b)
    {
        for(int i = 1; i <= a*b; i++)
        {
            if(i % a == 0 && i % b == 0 && i >= a && i >= b)
            {
                return i;
            }
        }
        return 1;
    }
    
    public static int LUC(int a, int b)
    {
        for(int i = 1; i < Math.max(a,b); i++)
        {
            if((a * i) % b == 0)
            {
                return a * i;
            }
        }
        return a*b;
    }
}