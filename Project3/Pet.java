/**
 * Creates a Pet 
 * 
 * @author (Justin Huynh)
 * @version (Dec 1 2016)
 */
public abstract class Pet
{
    private String myName;
    
    /**
     * Construct a new Pet with given name 
     * @param name new name of pet 
     */
    public Pet(String name)
    {
        myName = name;
    }
    
    /**
     * Return name of pet 
     * (Postcondition: pet named returned)
     * @return name of pet 
     * (Precondition: pet has a name that is a String)
     */
    public String getName()
    {
        return myName;
    }
    
    /**
     * Class to be overridden by different pet types
     */
    public abstract String speak();
}
