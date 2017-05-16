/**
 * Write a description of class Reservation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reservation
{   
    public String guest;
    public int room;
    public Reservation(String guestName, int roomNumber)
    {
        guest = guestName;
        room = roomNumber;
    }
    
    public int getRoomNumber()
    {
        return room;
    }
}
