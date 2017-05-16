/**
 * Contains information about an employee
 * 
 * @author (Lucy) 
 * @version (6/6/06)
 */
public class Employee
{
    private String name;
    private double hoursWorked;
    private double wage;
    
    /*
     * Create an employee with given name and wage.Initializes hoursWorked to 0.
     * @param aName name of employee
     * @param aWage starting wage of employee
     */
    public Employee(String aName, double aWage)
    {
       name = aName;
       wage = aWage;
       hoursWorked = 0;
    }
    
    /*
     * Set working hours.
     * (Postcondition: hours >= 0)
     * @param hours working hours of employee
     * (Precondition: hours >= 0)
     */
    public void setHours(double hours)
    {
        hoursWorked = hours;
    }
    
    /*
     * Retrieves the total numbers of hours worked.
     * (Postcondition: hours >= 0)
     * @return how many hours worked
     * (Precondition: hours >= 0)
     */
    public double getHours()
    {
       return hoursWorked;
    }
    
    /*
     * Sets new wage.
     * (Postcondition: wage >= 0)
     * @param aWage new wage
     * (Precondition: wage >= 0)
     */
    public void setWage(double aWage)
    {
        wage = aWage;
    }
    
    /*
     * Returns employee name.
     * (Postcondition: name is a valid string)
     * @return name of employee
     * (Precondition: name is a valid string)
     */
    public String getName()
    {
       return name;
    }
    
    /*
     * Returns employee wage (pay per hour).
     * (Postcondition: wage >= 0)
     * @return wage of employee
     * (Precondition: wage  >= 0)
     */
    public double getWage()
    {
       return wage;
    }
}
