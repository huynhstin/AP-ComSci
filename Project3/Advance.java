
/**
 * Write a description of class Advance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Advance extends Ticket
{
    public int days; // days in advance
    public int price;
    public Advance(int nDays)
    {
        super();
        days = nDays;
        price = 0;
    }

    public void price()
    {
        if(days >= 10)
        {
            price = 30;
        }
        else if(days <= 9)
        {
            price = 40;
        }
    }

    public double getPrice()
    {
        return price;
    }
}
