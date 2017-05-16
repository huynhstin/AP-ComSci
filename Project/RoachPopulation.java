
/**
 * Implements a class RoachPopulation that simulates growth of roach population
 * 
 * @author (Justin Huynh) 
 * @version (Oct 04 2016)
 */
public class RoachPopulation
{
   public double population; // roach population
   
   /**
    * Constructs new roach population with given initial population
    * @param initialPop initial roach population
    */
   public RoachPopulation(double initialPop)
   {
       population = initialPop;
    }
   
    /**
     * Doubles population
     */
   public void breed()
   {
       population = population * 2;
    }
    
    /**
     * Multiplies population by given ratio
     * @param ratio ratio to multiply population by
     */
   public void labBreed(double ratio)
   {
      population = population + (population * ratio);
    }
   
    /**
     * Reduces population by 10%
     */
   public void spray()
   {
       population = population * .9;
    }
   
    /**
     * Kills all roaches by setting population to 0
     */
   public void wipeOut()
   {
       population = 0;
    }
   
    /**
     * Returns population
     * @return roach population 
     */
   public double getRoaches()
   {
       return population;
    }
}


