
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    public int value;
    public String name;
    public Card(int val, String nam, )
    {
        value = val;
        name = nam;
    }
    
    public enum Rank
    {
        TWO("2"),    
        THREE("3"),    
        FOUR("4"),    
        FIVE("5"),    
        SIX("6"),    
        SEVEN("7"),    
        EIGHT("8"),    
        NINE("9"),    
        TEN("10"),    
        JACK("11"),    
        QUEEN("12"),    
        KING("13"),    
        ACE("14"); 
    }
    
    
}
