/**
 * Cat that speaks
 * 
 * @author (Justin Huynh) 
 * @version (Dec 1 2016)
 */
public class Cat extends Pet
{
   public String catSound;
  
    /**
     * Constructs a new Cat with given name
     * @param name name of cat 
     */
   public Cat(String name)
   {
       super(name);
       catSound = "meow";
    }
    
   /**
     * Make cat speak
     * (Postcondition: catSound is returned)
     * @return sound of cat
     * (Precondition: catSound exists)
     */
   public String speak()
   {
       return catSound;
    }
}
