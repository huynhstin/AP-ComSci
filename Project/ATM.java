
/**
 * Write a description of class ATM here.
 * 
 * @author (Justin Huynh) 
 * @version (a version number or a date)
 */
public class ATM
{
    public static void main(String []args)
    {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        a.deposit(2000);
        System.out.println(a.getBalance());
        a.deposit(1000);
        b.deposit(5000);
        b.withdraw(100);
        b.printBalance();
        a.withdraw(.50);
        a.deposit(.50);
        a.printBalance();
    }
}
