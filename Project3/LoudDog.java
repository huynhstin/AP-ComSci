/**
 * Dog that makes two sounds 
 * 
 * @author (Justin Huynh) 
 * @version (Dec 1 2016)
 */
public class LoudDog extends Dog
{
    /**
     * Construct a new LoudDog with given name
     * @param name name of dog
     */
    public LoudDog(String name)
    {
        super(name);
    }
    
    /**
     * Make dog speak
     * (Postcondition: dogSound, followed by a space and another dogSound is returned)
     * @return 2 dogSounds 
     * (Precondition: a LoudDog exists)
     */
    public String speak()
    {
        return dogSound + " " + dogSound;
    }
}
