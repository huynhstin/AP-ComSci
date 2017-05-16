/**
 * Simulates PR2004 Robot
 * 
 * @author (Justin Huynh) 
 * @version (Dec 1 2016)
 */
public class Robot
{
    private int [] hall;
    private int pos;
    private boolean facingRight;
    
    /**
     * Constructs a new Robot with given intial positon and number of items
     * @param nPos intial positon
     * @param items number of items
     */
    public Robot(int nPos, int items)
    {
        hall = new int [items];
        pos = nPos;
        facingRight = true;
    }
    
    /**
     * Checks if there is a wall immediately in front of the item
     * (Postcondition: returns true if this Robot has a wall immediately in
     *          front of it, so that it cannot move forward;
     *          otherwise, returns false)
     * @return whether or not there is a wall in front of the item 
     * (Precondition: pos is not a negative number)
     */
    private boolean forwardMoveBlocked()
    {
        return (facingRight && (pos + 1) == hall.length || !facingRight && (pos == 0));
    }
    
    /**
     * Moves robot depending on direction and removes one from current item 
     * (Postcondition: one move has been made according to the
     *            specifications above and the state of this
     *            Robot has been updated)
     * (Precondition: pos is not a negative int)            
     */
    public void move()
    {  
        if(hall[pos] > 0)
        {
            hall[pos]--;
        }
        else
        {
            if(!forwardMoveBlocked())
            {
                    if(facingRight)
                    {
                        pos++;
                    }
                    else 
                    {
                        pos--;
                    }
                    if(hall[pos] > 0)
                    {
                        hall[pos]--;
                    }
            }
            else
            {
                facingRight = !facingRight;
            }
        }
    }
    
    /**
     * Clear entire hall and return moves used
     * (Postcondition: no more items remain in the hallway;
     *                returns the number of moves made)
     * @return number of moves used
     * (Precondition: there are items in the hallway)
     */
    public int clearHall()
    {
        int moves = 0;
        while(!hallIsClear())
        {
            move();
            moves++;
        }
        return moves;
    }
    
    /**
     * Checks if hall is clear 
     * (Postcondition: returns whether or not hall is clear)
     * @return whether or not hall is clear
     * (Precondition: hall exists)
     */
    public boolean hallIsClear()
    {
        boolean clear = true;
        for(int i = 0; i < hall.length; i++)
        {
            if(hall[i] != 0) 
            {   
                clear = false;
            }
        }
        return clear;
    }
    
    /**
     * Modifies hall at given index with given number
     * (Postcondition: hall at i is set to num)
     * @param num number to set hall to 
     * @param i the index to change the number of 
     * (Precondition: hall has at least i items)
     */
    public void modHall(int num, int i)
    {
        hall[i] = num;
    }
    
    /**
     * Returns array as a string 
     * (Postcondition: array as a string is returned)
     * @return array as a string
     * (Precondition: array exists)
     */
    public String retArray()
    {
        String str = "";
        for(int i = 0; i < hall.length; i++)
        {
            str += " " + Integer.toString(hall[i]);
        }
        return ("[" + str + " ]");
    }
    
    /**
     * Returns current position
     * (Postcondition: position is returned) 
     * @return current position
     * (Precondition: position exists)
     */
    public int getPos()
    {
        return pos;
    }
    
    /**
     * Returns whether or not robot is facing right
     * (Postcondition: returns whether or not robot is facing right)
     * @return whether or not robot is facing right
     * (Precondition: facingRight is either true or false)
     */
    public boolean isRight()
    {
        return facingRight;
    }
}


