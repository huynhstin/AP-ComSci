/**
 * Tests Geometry class
 * 
 * @author (Justin Huynh) 
 * @version (Oct 24 2016)
 * (x-h)^2 / a ^ 2 + (y - k)^2 / b^2 = 1
 * y, k = center 
 * 50 50 200 400 
 * start corner is 50 50 
 * 200 wide 400 long
 * check if on ; plug in x and y of coordinate, see if it equals 1 
 * check if inside ; 
 */
import java.util.*;
import java.awt.geom.*;
public class GeometryTester
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
     
        System.out.println("What is the radius? ");
        double r = input.nextDouble();
        System.out.println("What is the height? ");
        double h = input.nextDouble();
        
        System.out.println("");
        System.out.println("Sphere volume = " +Geometry.sphereVolume(r));
        System.out.println("Sphere surface area = " +Geometry.sphereSurface(r));
        System.out.println("Cylinder volume = " +Geometry.cylinderVolume(r , h));
        System.out.println("Cylinder surface area = " +Geometry.cylinderSurface(r , h));
        System.out.println("Cone volume = " +Geometry.coneVolume(r , h));
        System.out.println("Cone surface area = " +Geometry.coneSurface(r , h));
        System.out.println("");
        
        System.out.println("Ellipse: What is the width? "); 
        double width = input.nextDouble();
        System.out.println("Ellipse: What is the height? "); 
        double height = input.nextDouble();
       
        System.out.println("Ellipse: What is the x-value? "); 
        double x  = input.nextDouble();
        System.out.println("Ellipse: What is the y-value? "); 
        double y = input.nextDouble();
        System.out.println("");
        
        Ellipse2D.Double n = new Ellipse2D.Double(x, y, width, height);
        System.out.println("Ellipse perimeter = " +Geometry.perimeter(n));
        System.out.println("Ellipse area = " +Geometry.area(n));
        System.out.println("");
        
        System.out.println("What is the x coordinate of the point? ");
        double pointX = input.nextDouble();
        System.out.println("What is the y coordinate of the point? ");
        double pointY = input.nextDouble();
        
        Point2D.Double p = new Point2D.Double(pointX , pointY);
        
        System.out.println("");
        
        if(Geometry.isInside(p , n) == true)
        {
            System.out.println("Point is inside the ellipse");
        }
        else
        {
            System.out.println("Point is not inside the ellipse");
        }
        
        if(Geometry.isOnBoundary(p , n) == true)
        {
            System.out.println("Point is on boundary");
        }
        else
        {
            System.out.println("Point is not on boundary");
        }
    }
}
