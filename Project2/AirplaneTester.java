/**
 * Runs Airplane class
 * 
 * @author (Tri Tran and Justin Huynh) 
 * @version (Nov 10 2016)
 */
import java.util.*;
public class AirplaneTester
{
    public static void main(String []args)
    {
       Scanner input = new Scanner(System.in); // create new Scanner called input
       Airplane boeing = new Airplane(); // create new Airplane
       boeing.randomFill(15); //randomly fill 
       boolean b = false; // for group seats
       boolean a = false; // for group seats
       int count = 0; //counter 
       System.out.println("Welcome to Boeing");
       boeing.printSeats(); // inital printing of seats
       
       while(true)
       {
           
           System.out.println("Press [0] to display available seats. "); 
           System.out.println("Press [1] to manually reserve a seat. ");
           System.out.println("Press [2] to automatically reserve available seats. "); // can be multiple. how many seats? enter name of passenger. automatically fills without preference, dont need to sit together
           System.out.println("Press [3] for preferential seat reservation. "); //preference
           System.out.println("Press [4] to cancel your reservation. "); //remove passenger
           System.out.println("Press [5] to print all passenger info. "); 
           System.out.println("Press [6] to print all reserved seat info. ");
           System.out.println("Or press [7] to exit. "); //exit program
           System.out.println("Enter selection: ");
           int selection = Integer.parseInt(input.nextLine()); //parseInt to use nextLine
            
           if(selection == 0)
           {
               boeing.printSeats();
            }
          else if(selection == 1)
           {
               
               System.out.println("What section [A-D]  do you want to sit in?");
               String section = input.nextLine();
               System.out.println("What row [1-12] do you want to sit in?" );
               int row = Integer.parseInt(input.nextLine());
                             
               if(boeing.checkAvail(section, row) == true)
               {
                   System.out.println("Enter first name: ");
                   String fName = input.nextLine();
                   System.out.println("Enter last name: ");
                   String lName = input.nextLine();
                   Passenger bob = new Passenger(fName, lName);
                   boeing.manuallyReserve(section, row, bob);
                   System.out.println("Seat reserved. ");
               }
               else
               {
                   System.out.println("Sorry, that seat is already taken. ");
               }
           }
           
           else if(selection == 2)
           {
               System.out.println("Enter number of passengers: ");
               int numPass = Integer.parseInt(input.nextLine());
              if(numPass>=1&boeing.capacityLeft() <= (boeing.getRow() * boeing.getSec()) - numPass)
               {
               for(int i = 0; i < numPass; i++)
               {
                   System.out.println("Enter first name of passenger: ");
                   String first = input.nextLine();
                   System.out.println("Enter last name of passenger: ");
                   String last = input.nextLine();
                   Passenger bob = new Passenger(first, last);
                   boeing.autoFill(bob);
                }
                System.out.println("Seats reserved. ");
           }
           else
           {
               System.out.println("Sorry, cannot seat that many passengers. ");
            }
           }           
           /*else if(selection == 3)
           {
               System.out.println("Enter number of passengers: ");
               int numPass = Integer.parseInt(input.nextLine());
                              Passenger[] p = new Passenger[numPass];
             if(numPass>=1&&boeing.capacityLeft() <= (boeing.getRow() * boeing.getSec()) - numPass)
               {
                   System.out.println("Do you have a preference of window/aisle? Enter 1 for window, 2 for aisle, or 0 for no preference. ");
                   int select = Integer.parseInt(input.nextLine());
                   if(select == 0)
                   {
                   
                      
                        for (int j = 0; j <boeing.getRow(); j++)
                          {


                          for (int i = 0; i <  boeing.getSec(); i++)
                          {
                              boolean inBounds = (numPass >= 0) && (numPass < array.length);
                              if()
                          if(boeing.FindBlock(i, j, numPass) == true){
                       
              
                          boeing.GSadd(i,j,numPass);
                         System.out.println("Seats reserved. ");
                        
                           
                            i=boeing.getSec();
                            j=boeing.getRow();
                          break;
                          }  
        
                       }
                         }   
                         }
               else
               {
                   System.out.println("Sorry, not enough seats available. ");
                }
            */
        else if(selection == 3)
           {
               System.out.println("Enter number of passengers: ");
               int numPass = Integer.parseInt(input.nextLine());
               Passenger[] p = new Passenger[numPass];
               if(numPass>=1&&boeing.capacityLeft() <= (boeing.getRow() * boeing.getSec()) - numPass)
               {
                   for (int j = 0; j < boeing.getRow(); j++)
                      {
                       for (int i = 0; i <  boeing.getSec(); i++)
                          {
                               boolean inBounds = ((numPass >= 0) && (i*j + numPass )<(boeing.getRow()* boeing.getSec()));
                               if(  (4*(j+1) - boeing.NumToNum(i) + numPass )<(boeing.getRow()* boeing.getSec()))
                               {
                              if(boeing.FindBlock(i, j, numPass) == true)
                              {
                                  for(int k = 0; k < numPass; k++)
                                  {
                                      System.out.println("Enter first name of passenger: ");
                                      String first = input.nextLine();
                                      System.out.println("Enter last name of passenger: ");
                                      String last = input.nextLine();
                                      Passenger bob = new Passenger(first, last);
                                      p[k] = bob;
                                  }
                                  boeing.GSadd(i, j, numPass, p);
                                  System.out.println("Seats reserved. ");
                                  i=boeing.getSec();
                                  j=boeing.getRow();
                                  break;
                              }  
                            }
                            else
                            {
                                  i=boeing.getSec();
                                  j=boeing.getRow();
                                  System.out.println("Sorry, can not reserve.");
                            }
                          }
                     }   
               }
               else
               {
                   System.out.println("Sorry, not enough seats available. ");
                }
        }
            
            else if(selection == 4)
            {
                 System.out.println("Enter first name of passenger who wishes to cancel: ");
                 String first = input.nextLine();
                 System.out.println("Enter last name of the passenger: ");
                 String last = input.nextLine();
                 Passenger bob = new Passenger(first, last);
                 boeing.cancel(bob);
            }
            else if(selection == 5)
            {
                boeing.printNameAndSeat();
            }
            else if(selection == 6)
            {
                boeing.printReservedInfo();
            }
            else{
                System.out.println("Program exited. ");
                return; //kill loop
            }
       }
       }
}
