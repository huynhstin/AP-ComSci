/**
 * Dog that speaks
 * 
 * @author (Justin Huynh) 
 * @version (Dec 1 2016)
 */
public class Dog extends Pet
{
    public String dogSound;
    
    /**
     * Constructs a new Dog with given name
     * @param name name of dog 
     */
    public Dog(String name)
    {
        super(name);
        dogSound = "woof";
    }
    
    /**
     * Make dog speak
     * (Postcondition: dogSound is returned)
     * @return sound of dog 
     * (Precondition: dogSound exists)
     */
    public String speak()
    {
        return dogSound;
    }
}
