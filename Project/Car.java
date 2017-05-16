/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Car
{
  public double mpg;
  public double fuel;
  
  public Car()
  {
      mpg = 0;
      fuel = 0;
    }
  
  public void drive(double distance)
  {
      fuel = fuel - (distance/mpg);
      if(fuel <= 0) fuel = 0;
    }
  
  public void setMPG(double newMPG)
  {
      mpg = newMPG;
    }
    
  public void tank(double gas)
  {
      fuel = fuel + gas;
    }
    
  public double getFuelLevel()
  {
     return fuel;
    }
  
}
