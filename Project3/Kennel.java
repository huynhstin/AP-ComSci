/**
 * Places different pets into an ArrayList 
 * 
 * @author (Justin Huynh) 
 * @version (Dec 1 2016)
 */
import java.util.*;
public class Kennel
{
    private ArrayList <Pet> petList;
    
    /**
     * Construct a new Kennel with an ArrayList of Pets
     */
    public Kennel()
    {
        petList = new ArrayList <Pet>();
        petList.add(new Cat("Cat"));
        petList.add(new Dog("Dog"));
        petList.add(new LoudDog("Dogg"));
    }
    
    /**
     * Makes pets speak 
     * (Postcondition: for each Pet in the kennel, its name followed by the result of a call to its speak method has been printed, one line per Pet)
     * (Precondition: there are petList.size() pets in the arraylist)
     */
    public void allSpeak()
    {
        for(int i = 0; i < petList.size(); i++)
        {
            System.out.println(petList.get(i).getName() + " says " + petList.get(i).speak());
        }
    }
}


