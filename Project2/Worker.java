
/**
 * Creates a new worker with given name and salary rate
 * 
 * @author (Justin Huynh) 
 * @version (Nov 28 2016)
 */
public class Worker
{
    public String name;
    public double salaryRate;
    public double salary;
    
    /**
     * Construct a new SalariedWorker
     * @param newName name of the worker
     * @param newSalRate salary rate of the worker
     */
    public Worker(String newName, double newSalRate)
    {
        name = newName;
        salaryRate = newSalRate;
        salary = 0;
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
        salary += hours * salaryRate;
        return salary;
    }
    
    /**
     * Gets name of worker
     * (Postcondition: name of worker returned)
     * @return name of worker
     * (Precondition: worker exists)
     */
    public String getName()
    {
        return name;
    }
}
