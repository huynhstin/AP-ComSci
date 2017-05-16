
/**
 * Implement a class Balloon that models a spherical balloon that is being filled with air
 * 
 * @author (Justin Huynh) 
 * @version (Oct 3, 2016)
 */
import java.util.*;
public class Balloon
{
   public double volume; // air in balloon
   public double radius; // radius of balloon 
   public double surfaceArea; // surface area 
   
  /**
   * Constructs an empty balloon.
   */
   public Balloon() 
   {
       volume = 0;
       radius = 0;
       surfaceArea = 0;
    }
    
  /**
   * Adds the given amount of air to the balloon. 
   * @param amounts the amount of air to be added.
   */
   public void addAir(double amounts)
   {
       volume = volume + amounts;
       radius = Math.cbrt( 3 * (volume / (4 * Math.PI)) );
       surfaceArea = 4 * Math.PI * radius * radius;
    }
   
   /**
    * Returns volume of balloon
    * @return volume of balloon
    */ 
   public double getVolume()
   {
       return volume;
    }
   
    /**
     * Returns surface area of balloon rounded to 2 decimals.
     * @return surface area
     */
   public double getSurfaceArea()
   {
       return Math.round (surfaceArea * 100.0) / 100.0;
    }
    
   /**
    * Returns radius of balloon rounded to 2 decimals.
    * @return the radius of balloon
    */
   public double getRadius()
   {
       return Math.round (radius * 100.0) / 100.0;
    }
}
