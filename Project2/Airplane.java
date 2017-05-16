/**
 * Simulates airplane seating - level 1 
 * 
 * @author (Tri Tran and Justin Huynh) 
 * @version (Nov 10 2016)
 */
import java.util.*;
public class Airplane
{

    private final int ROW = 12; // number of rows 
    private final int SECTION = 4; // number of sections: A-D
    private Seat [][] seats; // matrix for displaying seats
    Scanner input = new Scanner(System.in); //probably useless
    private int y = 0; // for selection 3
    
    /**
     * Initializes airplane: seats and array
     */
    public Airplane()
    {
        seats = new Seat[SECTION][ROW];
        initializeSeats();
    }
    
    /**
     * Returns rows of airplane
     * (Postcondition: row is returned)
     * @return ROW number of rows
     * (Precondition: ROW exists)
     */
    public int getRow()
    {
        return ROW;
    }
    
    /**
     * Returns section of airplane
     * (Postcondition: section is returned)
     * @return SECTION number of sections
     * (Precondition: SECTION exists)
     */
    public int getSec()
    {
        return SECTION;
    }
    
    /**
     * Returns availability of seat at section and row 
     * (Postcondition: returns boolean of availability)
     * @param section section to check availability at
     * @param row row to check availability at
     * @return availability of seat 
     * (Precondition: seat exists)
     */
    public boolean checkAvail(String section, int row)
    {
        return (seats[sectionToNum(section)][row-1].getVacancy());
    }

    /**
     * Returns remaining capacity of airplane
     * (Postcondition: returns number that is at most 42, at least 0)
     * @return remaining capacity 
     * (Precondition: seats exist)
     */
    public int capacityLeft()
    {
        int counter = 0;
        for(int j = 0; j < SECTION; j++)
        {
           for(int i = 0; i < ROW; i++)
           {
               if(seats[j][i].getVacancy() == true)
               {
                   counter++;
                }
            }
        }
        return (ROW * SECTION) - counter;
    }
    
    /**
     * Converts section to a number (String A-D to numbers 0-3)
     * (Postcondition: returns number 0-3)
     * @param e String A-D that represents section
     * @return sect section: number from 0-3
     * (Precondition: String e is A-D)
     */
   public int sectionToNum(String e)
   {
       int sect = 0;
       if(e.equalsIgnoreCase("A"))
       {
           sect = 0;
        }
       else if(e.equalsIgnoreCase("B"))
       {
           sect = 1;
        }
         else if(e.equalsIgnoreCase("C"))
       {
           sect = 2;
        }
         else if(e.equalsIgnoreCase("D"))
       {
           sect = 3;
        }
        return sect;
    }
    
    /**
     * Converts section to next section
     * (Postcondition: returns number 0-3)
     * @param num number of section
     * @return number from 0-3
     * (Precondition: num is from 0-3)
     */
   public int NumToNum(int num)
   {
       int number = 0;
       if(num==0)
       {
           number = 3;
        }
       else if(num==1)
       {
           number = 2;
        }
         else if(number==2)
       {
           number = 1;
        }
         else if(number==3)
       {
           number = 0;
        }
        return number;
    }
    
   /**
    * Initializes seats
    * (Postcondition: seat array initialized)
    * (Precondition: seat array exists)
    */
    public void initializeSeats()
   {
       for(int j = 0; j < ROW; j++)
       {
           for(int i = 0; i < SECTION; i++)
           {
               String section = "E";
               boolean windowView = true;
               if(i==0) section = "A";
               else if(i==1)
               {
                   section = "B";
                   windowView = false;
                }
               else if(i==2)
               {
                   section = "C";
                   windowView = false;
                }
               else
               {
                   section = "D";
                   windowView = true;
                }
                   
               Seat temp = new Seat(j , section);
               temp.setWindowView(windowView);
               seats[i][j] = temp;   
                   
           }
       }
   }
  
   /**
    * Randomly fills number of seats given
    * (Postcondition: numOfSeats number of seats filled up)
    * @param numOfSeats number of seats to fill 
    * (Precondition: numOfSeats < number of seats in array)
    */
   public void randomFill(int numOfSeats)
   {
       Random generator = new Random();
       int counter = 1;
       while(counter <= numOfSeats)
       {
           int section = generator.nextInt(SECTION);
           int row = generator.nextInt(ROW);
           if(seats[section][row].getVacancy()==true)
        {
           seats[section][row].setVacant(false); 
           Passenger bob = new Passenger("Bob" + (counter) , "Saget");
           seats[section][row].setPassenger(bob);
           counter++;
        }
    }
   }
    
   /**
   * Assigns random seat for passenger
   * (Postcondition: passenger added in random seat from A-D, 1-12)
   * @param p Passenger to add
   * (Precondition: p is a valid passenger)
   */
  public void assignRandomSeat(Passenger p)
    {
        Random generator = new Random();
        boolean go = true;
        while(go == true)
        {
            int section = generator.nextInt(SECTION);
            int row = generator.nextInt(ROW);
            if(seats[section][row].getVacancy() == true && capacityLeft() < (ROW * SECTION))
            {
                seats[section][row].setVacant(false);
                seats[section][row].setPassenger(p);
                go = false;
            }
            else
            {
                System.out.println("No seats left. ");
            }
        }
    }
    
   /**
    * Selection 0: prints out seats, [ ] if vacant, [x] if taken
    * (Postcondition: seats printed out)
    * (Precondition: seats exist)
    */
    public void printSeats()
   {
       for(int j = 0; j < SECTION; j++)
       {
           for(int i = 0; i < ROW; i++)
           {
               if(seats[j][i].getVacancy() == true)
               {
                   System.out.print(" [ ] "); 
                }
               else 
               {
                   System.out.print(" [x] ");
                }
            }
        System.out.println();
    }
   }
   
   /**
    * Selection 1: manually reserves a seat
    * (Postcondition: seat is set vacant and bob is added)
    * @param section section to add passenger at 
    * @param row row to add passenger at 
    * @param bob passenger to add at seat
    * (Precondition: seat exists at given section/row, bob is a valid passenger)
    */
   public void manuallyReserve(String section, int row, Passenger bob)
   {        
         seats[sectionToNum(section)][row-1].setVacant(false);
         seats[sectionToNum(section)][row-1].setPassenger(bob);
   }
       
    /**
    * Selection 2: Automatically fill seats with passenger, no preference
    * (Postcondition: adds seats with p)
    * @param p Passenger to add
    * (Precondition: seat is 
    */
   public void autoFill(Passenger p)
    {
        for (int j = 0; j < SECTION; j++)
        {
            for (int i = 0; i < ROW; i++)
            {
                if (seats[j][i].getVacancy() == true)
                {
                    seats[j][i].setVacant(false);
                    seats[j][i].setPassenger(p);
                    return;
                }
             }
            }
    }
    
   /**
    * Manually reserves seats for selection 3 (group seating)
    * (Postcondition: p.length number of seats reserved)
    * @param section section to start from
    * @param row row to start adding from
    * @param p array of passengers to add from
    * (Precondition: valid section from 0-3 provided; valid row from 1-12 provided; valid array of passengers provided)
    */
   public void manuallyReserve2(int section, int row, Passenger[] p)
   {   
       int g = p.length;
       seats[section][row].setVacant(false);
       for(int i = y; i < p.length; i++)
       {
           if(y==g-1){
               y=0;
            }
           seats[section][row].setPassenger(p[i]);
           y++;
           i=p.length;
       }
   }
    
   /**
    * Finds whether or not a block exists for the number of passengers. Helper method for GSadd
    * (Postcondition: boolean returned)
    * @param section section to start at 
    * @param row row to start at 
    * @param numPass number of passengers to check group for
    * @return boolean value of whether or not a block is found
    * (Precondition: seat exists at that section and row)
    */
   public boolean FindBlock(int section, int row, int numPass) {
           int a = row;
           int b = section;
            while(numPass > 0){
            if(seats[b][a].getVacancy() == false)
            {
                return false;
            }
            else
            {
             b++;
             numPass--;
             if(b == SECTION)
                    {
                        b = 0;
                        a++;
                    }
            }
        }
        return true;
    }

   /**
    * Selection 3: add group of passengers
    * (Postcondition: passengers added)
    * @param section section to check at 
    * @param row row to check at
    * @param pass number of passengers
    * @param p Passenger array to add from 
    * (Precondition: block is found, valid array, section from 0-3, row from 0-12 provided)
    */
   public void GSadd(int section, int row, int pass, Passenger[] p)
    {
        int j = section;
        int i = row;
        while(pass> 0)
        {
               if(j == SECTION)
               {
                    j = 0;
                    i++;
                }   
               else if(seats[j][i].getVacancy() == true)
               {
                    manuallyReserve2(j, i, p);
                    j++;
                    pass--;
               } 
        }
    }
        
    /**
     * Selection 4: Cancel reservation of Passenger p 
     * (Postcondition: passenger removed if exists in array)
     * @param p the passenger to remove
     * (Precondition: p is a valid passenger that can be added)
     */
    public void cancel(Passenger p)
   {
        for(int j = 0; j < SECTION; j++)
        {
            for(int i = 0; i < ROW; i++)
            {
                if(seats[j][i].getVacancy() == false)
                {
                    if(seats[j][i].getPassenger().getFull().equalsIgnoreCase(p.getFull()))
                    {
                        seats[j][i].clearSeat();
                        System.out.println("Passenger removed. ");
                        return;
                    }
                }
            }
        }
        System.out.println("No passenger by that name was found. ");
    }
   
    /**
     * Selection 5: print name then seats in system
     * (Postcondition: system prints names)
     * (Precondition: passengers exist)
     */
  public void printNameAndSeat()
  {
      for(int j = 0; j < SECTION; j++)
              {
                  for(int i = 0; i < ROW; i++)
                  {
                      if(seats[j][i].getVacancy() == false)
                      {
                          System.out.println(seats[j][i].getPassenger().getFull() + ": " + "Section " + seats[j][i].getSection() + " , Row " + (seats[j][i].getRow() + 1));
                      }   
                  }
               }
  }

  /**
   * Selection 6: prints seats then name in system
   * (Postcondition: system prints names)
   * (Precondition: passengers exist)
   */
  public void printReservedInfo()
  {
      for(int j = 0; j < SECTION; j++)
              {
                  for(int i = 0; i < ROW; i++)
                  {
                      if(seats[j][i].getVacancy() == false)
                      {
                          System.out.println("Section " + seats[j][i].getSection() + " , Row " + (seats[j][i].getRow() + 1) + ": "+ seats[j][i].getPassenger().getFull());
                      }
                  }
              }
  }
}