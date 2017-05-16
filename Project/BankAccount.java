
/**
 * Write a description of class BankAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankAccount
{
   private double balance;
   private String name;
   private String accountNumber;
   
   public BankAccount()
   {
       balance = 0;
       name = "Trump";
       accountNumber = "12345678";
   }
   
   //mutator method -- changes value of instance variable (balance)
   public void deposit(double amount)
   {
       balance = balance + amount;
   }
   
   //accessor method -- displays balance without changing it 
   public void printBalance()
   {
       System.out.println(balance);
   }
   
   //accessor method
   public double getBalance()
   {
       return balance;
   }
   
   public void withdraw(double amount)
   {
       if(balance >= amount){
       balance = balance - amount;
    }
    else 
        System.out.println("Can't withdraw");
   }
}
