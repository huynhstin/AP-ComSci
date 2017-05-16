/**
 * Simulates bank account with interest and withdraw penalty
 * 
 * @author (Justin Huynh) 
 * @version (11/21/16)
 */
public class TimeDepositAccount extends BankAccount
{
    public int penalty;
    public int months;
    public double interest;
    
    /**
     * Construct a new TimeDepositAccount
     * @param newAmt balance
     * @param newMonths number of months until no penalty 
     * @param newInterest interest rate
     */
    public TimeDepositAccount(double newAmt, int newMonths, double newInterest)
    {
        super(newAmt);
        penalty = 10; 
        months = newMonths;
        interest = newInterest;
    }
    
    /**
     * Add interest to the account
     * (Postcondition: 1 month passes, balance increases by interest rate)
     * (Precondition: months > 0)
     */
    public void addInterest()
    {
        double newAmt = (getBalance() * interest);
        deposit(newAmt);
        months--;
    }
    
    /**
     * Withdraw money from account
     * (Postcondition: withdr is taken out of account)
     * @param withdr amount to remove
     * (Precondition: withdr is positive)
     */
    public void withdraw(double withdr)
    {
        if(months > 0)
        {
            if(withdr <= getBalance())
            {
                double newBalance = getBalance() - penalty - withdr;
                setBalance(newBalance);
            }
            else System.out.println("Cannot take out more than you have.");
        }
        else
        {
            if(withdr <= getBalance())
            {
                double newBalance = getBalance() - withdr;
                setBalance(newBalance);
            }
            else System.out.println("Cannot take out more than you have.");
        }
    }
    
    /**
     * Return months left 
     * (Postcondition: months returned)
     * @return number of months
     * (Precondition: months exists)
     */
    public int getMonths()
    {
        return months;
    }
}


