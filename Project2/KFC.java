/**
 * Executes tasks for employees
 * 
 * @author (Justin Huynh) 
 * @version (10/31/16)
 */
import java.util.ArrayList;
public class KFC
{
    private ArrayList <Employee> employees;   //list of employees in payroll.
    
    /**
     * Create ArrayList of employees
     */
    public KFC()
    {
        employees = new ArrayList <Employee>();
    }
    
    /*
     * Adds employee to list.
     * (Postcondition: e is a valid employee)
     * @param e new object of type Employee
     * (Precondition: e is a valid employee)
     */
    public void addEmployee(Employee e)
    {
        employees.add(e);
    }
    
    /*
     * Gives all employees a raise.
     * (Postcondition: wage >= 0)
     * @param increase the amount to increase wage by 
     * (Precondition: increase >= 0)
     */
    public void raiseForAll(double increase)
    {
        for(int i = 0; i < employees.size(); i++)
        {
            employees.get(i).setWage(employees.get(i).getWage()+increase);
        }
    }
    
    /*
     * Increase wage for an employee with given name.
     * (Postcondition: wage >= 0)
     * @param name name of employee
     * @param increase amount to increase wage by
     * (Precondition: an employee exists in ArrayList employees with name name, and increase >= 0)
     */
    public void raiseIndividually(String name, double increase)
    {
        for(int i = 0; i < employees.size(); i++)
        if(name.equalsIgnoreCase(employees.get(i).getName()))
        {
            employees.get(i).setWage(employees.get(i).getWage()+increase);
        }
        
    }
    
    /*
     * Removes employee with given name.
     * (Postcondition: an employee exists in ArrayList employees with name name)
     * @param name the name of employee to remove
     * (Precondition: an employee exists in ArrayList employees with name name)
     */
    public void remove(String name)
    {
        for(int i = 0; i < employees.size(); i++)
        if(name.equalsIgnoreCase(employees.get(i).getName()))
        {
            employees.remove(i);
        }
        
    }
    
    /*
     * Find an employee in list and returns their index. Returns -1 if not found.
     * (Postcondition: returns -1 or index of name)
     * @return -1 if no employee with name name is found; otherwise index of employee with given name
     * (Precondition: none)
     */
    private int findEmployeeIndex(String name)
    {
        for(int i = 0; i < employees.size(); i++) //run through loop, find employee with matching name, give index
        {
            if(name.equalsIgnoreCase(employees.get(i).getName()))
            {
                return i;
            }
        }
        return -1;
    }
    
    /*
     * Prints employees names, hours worked, and their total earnings.
     * Employee gets paid 1.5x for hours worked over 40 hours.
     * (Postcondition: employee payroll printed)
     * (Precondition: size of ArrayList >= 0)
    */
    public void printPayroll()
    {
        for(int i = 0; i < employees.size(); i++)
        {
            System.out.println(employees.get(i).getName());
            System.out.println(employees.get(i).getHours());
            if(employees.get(i).getHours() >= 40)
            {
                System.out.println(((employees.get(i).getHours() - 40) * employees.get(i).getWage() * 1.5 ) + (40* employees.get(i).getWage()));
            }   
            else 
            {
                System.out.println(employees.get(i).getHours() * employees.get(i).getWage());
            }
        }
    }
     
}
