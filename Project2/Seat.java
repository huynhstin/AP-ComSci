/**
 * Creates new seat 
 * 
 * @author (Tri Tran and Justin Huynh) 
 * @version (Nov 10 2016)
 */
public class Seat
{
    private int row; // number of rows
    private String section; // section: A, B, C or D
    private boolean vacancy; // whether or not seat is available 
    private Passenger passenger; // new object of Passenger class
    private boolean window; // window seating 
    
    /**
     * Initalizes Seat class
     * @param aRow row number 
     * @param aSection section A-D
     */
    public Seat(int aRow, String aSection)
    {
        row = aRow;
        section = aSection;
        vacancy = true;
        passenger = new Passenger("John" , "Doe");
        window = true;
    }
    
    /**
     * Sets vacancy of seat
     * (Postcondition: vacancy is set to vac)
     * @param vac whether or not seat is vacant
     * (Precondition: vac is a boolean true or false)
     */
    public void setVacant(boolean vac)
    {
        vacancy = vac;
    }
    
    /**
     * Sets passenger
     * (Postcondition: passenger gets p)
     * @param p object of type Passenger
     * (Precondition: p is a Passenger)
     */
    public void setPassenger(Passenger p)
    {
        passenger = p;
    }
    
    /**
     * Sets window view of seat
     * (Postcondition: window gets wind)
     * @param wind whether or not the seat is a window view
     * (Precondition: wind is a boolean)
     */
    public void setWindowView(boolean wind)
    {
        window = wind;
    }
    
    /**
     * Returns row of seat 
     * (Postcondition: int from 1-12 is returned)
     * @return row of given seat
     * (Preconditon: seat exists)
     */
    public int getRow()
    {
        return row;
    }
    
    /**
     * Returns section of seat
     * (Postcondition: returns String, A-D)
     * @return section of seat
     * (Precondition: seat exists)
     */
    public String getSection()
    {
        return section;
    }
    
    /**
     * Returns vacancy of seat
     * (Postcondition: returns vacancy of seat)
     * @return vacancy boolean; whether or not seat is vacant
     * (Precondition: seat exists)
     */
    public boolean getVacancy()
    {
        return vacancy;
    }
    
    /**
     * Returns passenger in given seat
     * (Postcondition: returns passenger in given seat)
     * @return passenger passenger in given seat
     * (Precondition: there is a passenger in given seat)
     */
    public Passenger getPassenger()
    {
        return passenger;
    }
    
    /**
     * Returns whether or not the seat is a window 
     * (Postcondition: returns boolean of whether or not seat is a window)
     * @return window window view of seat; true or false
     * (Precondition: seat exists and is within A-D)
     */
    public boolean getWindow()
    {
        return window;
    }
    
    /**
     * Clears seat 
     * (Postcondition: seat is vacant and no passenger)
     * (Precondition: seat exists)
     */
    public void clearSeat()
    {
        vacancy = true;
        passenger = null;
    }
}
