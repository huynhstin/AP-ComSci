/**
 * Creates a new passenger
 * 
 * @author (Justin Huynh, Tri Tran) 
 * @version (Nov 10, 2016)
 */
public class Passenger
{
    private String fName; // first name of passenger
    private String lName; // last name 
    
    /**
     * Constructs a new passenger with given first and last names
     * @param first first name 
     * @param last last name
     */
    public Passenger(String first, String last)
    {
        fName = first;
        lName = last;
    }
    
    /**
     * Returns first name of passenger
     * (Postcondition: first name returned)
     * @return first name 
     * (Precondition: first name is a valid String)
     */
    public String getFirst()
    {
        return fName;
    }
    
    /**
     * Returns last name of passenger
     * (Postcondition: last name returned)
     * @return last name 
     * (Precondition: last name is a valid String)
     */
    public String getLast()
    {
        return lName;
    }
    
    /**
     * Returns first and last name of passenger
     * (Postcondition: full name returned)
     * @return full name 
     * (Precondition: first, last name is a valid String)
     */
    public String getFull()
    {
        return (fName + " " + lName);
    }
}
