/**
 * Simulates bank account
 * 
 * @author (Justin Huynh) 
 * @version (11/21/16)
 */
public class BankAccount
{
   private double balance;
   
   /**
    * Construct new BankAccount
    * @param amount initial balance
    */
   public BankAccount(double amount)
   {
       balance = amount;  
    }
   
   /**
    * Return balance left
    * (Postcondition: balance returned)
    * @return balance left
    * (Precondition: balance exists)
    */
   public double getBalance()
   {
       return balance;
    }
   
   /**
    * Deposit money in account
    * (Postcondition: amount is deposited)
    * @param amount amount to deposit
    * (Precondition: balance exists)
    */
   public void deposit(double amount)
   {
       balance += amount;
    }
    
   /**
    * Set new balance
    * (Postcondition: balance set)
    * @param newBalance the new balance of the account
    * (Precondition: newBalance is positive)
    */
   public void setBalance(double newBalance)
   {
       balance = newBalance;
    }
}
