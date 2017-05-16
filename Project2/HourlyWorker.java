
/**
 * Worker that makes 1.5x the salary if they work over 40 hours
 * 
 * @author (Justin Huynh) 
 * @version (Nov 28 2016)
 */
public class HourlyWorker extends Worker
{
    /**
     * Construct a new HourlyWorker
     * @param newName name of the worker
     * @param newSalRate salary rate of the worker
     */
    public HourlyWorker(String newName, double newSalRate)
    {
        super(newName, newSalRate);
    }
    
    /**
     * Return the salary of a worker depending on the hours worked. 
     * (Postcondition: salary is returned)
     * @param hours hours worked
     * @return salary of worker for that week 
     * (Precondition: hours is not negative) 
     */
    public double computePay(int hours)
    {
        if(hours <= 40)
        {
            salary += (salaryRate * hours);
        }
        else
        {
            int newHours = hours - 40;
            salary += (salaryRate * 40) + (salaryRate * 1.5 * newHours);
        }
        return salary;
    }
}
