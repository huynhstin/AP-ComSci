
/**
 * Counts coins.
 * 
 * @author (Justin) 
 * @version (Aug 15 2016)
 */
import java.util.Scanner;
public class CoinStar
{
    public static void main(String[] args)
   {
       final double QUARTER = 0.25;
       final double DIME = 0.10;
       final double NICKEL = 0.05;
       final double PENNY = 0.01;
       final double FEE = 0.08;
       final double BRITISH = 0.77;
       
       Scanner input = new Scanner(System.in);
      
       System.out.print("How many quarters? "); 
       double numberOfQuarters = input.nextDouble(); 
       
       System.out.print("How many dimes? "); 
       double numberOfDimes = input.nextDouble(); 
       
       System.out.print("How many nickels? "); 
       double numberOfNickels = input.nextDouble(); 
       
       System.out.print("How many pennies? "); 
       double numberOfPennies = input.nextDouble();
       
       numberOfQuarters = numberOfQuarters * QUARTER;
       numberOfDimes = numberOfDimes * DIME;
       numberOfNickels = numberOfNickels * NICKEL;
       numberOfPennies = numberOfPennies * PENNY; 
       
       double total = numberOfQuarters + numberOfDimes + numberOfNickels + numberOfPennies;
       double roundedTotal = (double) Math.round(total * 100) / 100;
       System.out.println("You have $" + roundedTotal + ".");
       
       double fee = roundedTotal * FEE;
       double roundedFee = (double) Math.round(fee * 100) / 100;
       System.out.println("Total fee: $" + roundedFee + ".");
	   
	   double pay = roundedTotal - fee; 
	   double roundedPay = (double) Math.round(pay * 100) / 100;
	   System.out.println("You will receive $" + roundedPay + ".");
	   
	   System.out.println("Would you like to convert your currency to GBP? ");
	   String answer = input.nextLine();
	   if(answer == "Yes" )
	    { double converted = roundedPay * BRITISH;
	      double roundedConverted = (double) Math.round(converted * 100) / 100;
	        System.out.println ("You will receive £" + roundedConverted + ".");
	       }
	    else System.out.println ("Finished."); 
	   }
	  
	   
    }   

