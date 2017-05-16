

/**
 * Represents an employee paid on commission
 * 
 * @author (Justin Huynh) 
 * @version (Nov 30 2016)
 */
public class Commission extends Hourly
{
    public double totalSales;
    public double comRate;
    
    /**
     * Constructs an employee paid on comission
     * @param eName name of employee
     * @param eAddress address of employee
     * @param ePhone phone number of employee
     * @param socSecNumber social security number of employee
     * @param rate pay rate of employee
     * @param newRate commission rate of employee
     */
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double newRate)  
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        totalSales = 0;
        comRate = newRate;
    }
    
    /**
     * Sets sales for employee
     * (Postcondition: totalSales is changed to totlSales)
     * @param totlSales new total sales of employee 
     * (Precondition: totlSales is not a negative number)
     */
    public void addSales(double totlSales)
    {
        totalSales += totlSales;
    }
    
    /**
     * Returns pay of employee
     * (Postcondition: pay is returned)
     * @return pay of employee
     * (Precondition: totalSales is not negative)
     */
    public double pay()
    {
        double newTotSales = totalSales; 
        totalSales = 0;
        return super.pay() + (newTotSales * comRate);        
    }
    
    /**
     * Returns current hours and sales of employee
     * (Postcondition: hours and sales are returned)
     * @return total sales and hours of employee
     * (Precondition: sales is not negative)
     */
    public String toString()
    {
        return super.toString() + "\nTotal Sales: " +totalSales;
    }
}
