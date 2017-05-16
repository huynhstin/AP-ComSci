/**
 * Write a description of class Hotel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Hotel
{
    private Reservation[] rooms;
    private ArrayList <String> waitList;
    public Hotel()
    {
        rooms = new Reservation[100];
        waitList = new ArrayList <String>();
    }
    
    public Reservation requestRoom(String guestName)
    {
        for(int i = 0; i < rooms.length; i++)
        {
            if(rooms[i] == null)
            {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }   
    
    public Reservation cancelAndReassign(Reservation res)
    {
        Reservation newRes = null;
        int i = res.getRoomNumber();
        if (!waitList.isEmpty())
        {
            newRes = new Reservation((String)waitList.get(0), i);
            waitList.remove(0); 
        }
        rooms[i] = newRes;
        return newRes;
    }
}