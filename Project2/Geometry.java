/**
 * Computes volume and surface area of a sphere, cylinder, ellipse and cone
 * 
 * @author (Justin Huynh) 
 * @version (Oct 24, 2016)
 */
import java.util.*;
import java.awt.geom.*;
public class Geometry
{
    /**
     * Returns volume of a sphere with given radius
     * (Postcondition: volume > 0)
     * @param r radius of the sphere
     * @return volume of the sphere
     * (Precondition: r > 0)
     */
    public static double sphereVolume(double r)
    {
        return (4.0/3.0) * (Math.PI) * (r * r * r);
    }
    
    /**
     * Returns surface area of a sphere with given radius
     * (Postcondition: surface area > 0)
     * @param r radius of the sphere
     * @return surface area of the sphere
     * (Precondition: r > 0)
     */
    public static double sphereSurface(double r)
    {
        return 4.0 * Math.PI * r * r; 
    }
    
    /**
     * Returns volume of a cylinder with given radius and height 
     * (Postcondition: volume > 0)
     * @param r radius of the cylinder
     * @param h height of the cylinder
     * @return volume of the cylinder
     * (Precondition: r > 0 , h > 0)
     */
    public static double cylinderVolume(double r, double h)
    {
        return Math.PI * r * r * h;
    }
    
    /**
     * Returns surface area of a cylinder with given radius and height 
     * (Postcondition: surface area > 0)
     * @param r radius of the cylinder
     * @param h height of the cylinder
     * @return surface area of the cylinder
     * (Precondition: r > 0 , h > 0)
     */
    public static double cylinderSurface(double r, double h)
    {
        return (2.0 * Math.PI * r * r) + 2 * Math.PI * r * h;
    }
    
    /**
     * Returns volume of a cone with given radius and height
     * (Postcondition: volume > 0)
     * @param r radius of the cone
     * @param h height of the cone 
     * @return volume of the cone
     * (Precondition: r > 0 , h > 0)
     */
    public static double coneVolume(double r, double h)
    {
        return (1.0/3.0) * Math.PI * r * r * h;
    }
    
    /**
     * Returns surface area of a cone with given radius and height
     * (Postcondition: surface area > 0)
     * @param r radius of the cone
     * @param h height of the cone
     * @return surface area of the cone
     * (Precondition: r > 0 , h > 0)
     */
    public static double coneSurface(double r, double h)
    {
        return (Math.PI * r) * (r + (Math.sqrt((h * h) + (r * r))));
    }
    
    /**
     * Returns perimeter of an ellipse with given height and width
     * (Postcondition: perimeter > 0)
     * @param e new object of type Ellipse2D.Double
     * @return perimeter of ellipse
     * (Precondition : height and width > 0 )
     */
    public static double perimeter(Ellipse2D.Double e)
    {
        double a = e.getHeight() / 2.0;
        double b = e.getWidth() / 2.0;
        return Math.PI * (3 * (a + b) - Math.sqrt(((3 * a) + b) * (a + (3 * b))));
    }
    
    /**
     * Returns area of an ellipse with given height and width
     * (Postcondition: area > 0)
     * @param e new object of type Ellipse2D.Double
     * @return area of ellipse
     * (Precondition : height and width > 0 )
     */
    public static double area(Ellipse2D.Double e)
    {
        double a = e.getHeight() / 2.0;
        double b = e.getWidth() / 2.0;
        return Math.PI * a * b;
    }
    
    /**
     * Checks if the given point is inside the ellipse
     * (Postcondition: returns true or false)
     * @param p new object of type Point2D.Double
     * @param e new object of type Ellipse2D.Double
     * @return boolean value: if ellipse contains point 
     * (Precondition : valid ellipse and point specified)
     */
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e)
    {
        double xValPoint = p.getX();
        double yValPoint = p.getY();
        return (e.contains(xValPoint, yValPoint));
    }
    
    /**
     * Checks if the given point is on perimeter of ellipse
     * (Postcondition: returns true or false)
     * @param p new object of type Point2D.Double
     * @param e new object of type Ellipse2D.Double
     * @return boolean value: if ellipse perimeter contains point 
     * (Precondition : valid ellipse and point specified: width and height are not 0)
     */
    public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e)
    {
       
        double x = p.getX();
        double y = p.getY();
        double b = e.getHeight() / 2.0;
        double a = e.getWidth() / 2.0;
        double h = e.getX() + e.getWidth() / 2.0;
        double k = e.getY() + e.getHeight() / 2.0;
        
        if(a >= b)
        {
            return((((Math.pow((x-h) , 2)) / (a * a)) + ((Math.pow((y - k) , 2))/(b * b))) - 1.0 <= 0.1);
        }
        else
        {
         return((((Math.pow((x-h) , 2)) / (b * b)) + ((Math.pow((y - k) , 2))/(a * a))) - 1.0 <= 0.1);
    }
    }
}