/**
 * Ask user for array size. 
 * Generate random values between 1-99
 * Sort them out.
 * Display them. 
 * Ask user to sort for particular value, and 
 * ask what search algorithm- Linear or binary.
 * Say found or not found, tell how many comparisons. 
 * While loop to continue 
 * (search for another value)
 * 
 * @author (Justin Huynh) 
 * @version (Feb 8 2016)
 */
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class BinarySearch
{
    private int[] nums; // the array to search
    private Random rand; // random generator 
    private boolean found; // if value found or not
    public BinarySearch(int size) 
    {
        nums = new int[size];
        rand = new Random();
        found = false;
        fillArray();
    }
    
    /**
     * Set array
     * (Postcondition: nums gets newNums)
     * @param newNums new array
     * (Precondition: newNums is an int array)
     */
    public void setNums(int[] newNums)
    {
        nums = newNums;
    }
    
    /**
     * Returns whether or not value is found
     * (Postcondition: found returned)
     * @return found or not 
     * (Precondition: none)
     */
    public boolean getFound()
    {
        return found;
    }
    
    /**
     * Set found 
     * (Postcondition: found gets nFound)
     * @param nFound new bool value
     * (Precondition: nFound is a boolean)
     */
    public void setFound(boolean nFound)
    {
        found = nFound;
    }
    
    /**
     * Fills array with randomly generated integers
     * (Postcondition: array filled with randomly generated integers)
     * (Precondition: nums has at least 1 integer)
     */
    public void fillArray()
    {
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = rand.nextInt(99) + 1;
        }
    }
    
    /**
     * Prints out array
     * (Postcondition: array printed)
     * (Precondition: none)
     */
    public void printArray()
    {
        System.out.print("[ ");
        for(int i : nums)
        {
            System.out.format("%d ", i);
        }
        System.out.print("]\n");
    }
    
    /**
     * Sorts an array of integers
     * (Postcondition: array is sorted from low to high)
     * @return sorted array
     * (Precondition: nums has at least 1 integer)
     */
    public int[] sort()
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                int index = i;
                if(nums[j] < nums[i]) 
                {
                    index = j;
                }
                if(index != i) 
                {
                    swap(index, i, nums);
                }
            }
        }
        return nums;
    }
    
    /**
     * Swaps variables in an array
     * (Postcondition: the variable at index i becomes the variable at index j and vice versa)
     * @param i first index to swap
     * @param j second index to swap
     * @param arr array to swap from
     * (Precondition: there are at least two variables in arr)
     */
    public void swap(int i, int j, int[] arr) 
    {
        arr[i] = arr[j];
        arr[j] = arr[i];
    }
    
    /**
     * Linear search algorithm 
     * (Postcondition: number of comparisons returned)
     * @param target value to search for
     * @return number of comparisons 
     * (Precondition: none)
     */
    public int linearSearch(int target)
    {
        int counter = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                counter++;
                setFound(true);
                break;
            }
            else
            {
                counter++;
            }
        }
        return counter;
    }
    
    /**
     * Calculate mid point of array
     * (Postcondition: midpoint returned)
     * @param low lowest index of array
     * @param high highest index of array
     * @return midpoint
     * (Precondition: none)
     */
    public int midPt(int low, int high)
    {
        return (low + high) / 2;
    }
    
    /**
     * Binary search algorithm 
     * (Postcondition: number of comparisons returned.)
     * @param target the integer to look for 
     * @return number of comparisons
     * (Precondition: target is between 1-99)
     */
    public int binarySearch(int target)
    {
        int counter = 0;
        int low = 0;
        int high = nums.length - 1;
        int mid; 
        while(high >= low) 
        {
            mid = midPt(low, high); // recalculate midpoint every time
            counter++;
            if(nums[mid] == target) // if value is found
            { 
                setFound(true); 
                break;
            }
            else if(nums[mid] < target) // since middle of list is less than target
            {
                low = mid + 1; // look in right half of list
            }
            else // middle of list higher than target 
            {
                high = mid - 1; // look in left half of list
            }
        }
        return counter;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many values?");
        int size;
        try
        {
            size = in.nextInt();
        } 
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a valid int.");
            return;
        }        
        BinarySearch a = new BinarySearch(size);
        a.setNums(a.sort()); // set array to sorted array 
        System.out.println("Sorted array:");
        a.printArray();
        quit:while(true)
        {
            cont:while(true)
            {
                System.out.println("Press [1] for linear search.");
                System.out.println("Press [2] for binary search.");
                System.out.println("Press [3] to view array.");
                System.out.println("Press [4] to quit.");
                int option;
                try
                {
                    option = in.nextInt();
                } 
                catch(InputMismatchException e)
                {
                    System.out.println("Please enter a valid int.");
                    break quit;
                }
                switch(option)
                {
                    case 1:
                        System.out.println("What value would you like to search for?");
                        int toSearch;
                        try
                        {
                            toSearch = in.nextInt();                           
                        } 
                        catch(InputMismatchException e)
                        {
                            System.out.println("Please enter a valid int.");
                            break quit;
                        }
                        int comparisons = a.linearSearch(toSearch);
                        if(a.getFound())
                        {
                            System.out.printf("Value found! Took %d comparisons.\n", comparisons);
                            a.setFound(false);
                        }
                        else
                        {
                            System.out.printf("Value not found. Took %d comparisons.\n", comparisons);
                        }                        
                        break;
                    case 2:
                        System.out.println("What value would you like to search for?");
                        int bToSearch;
                        try
                        {
                            bToSearch = in.nextInt();                           
                        } 
                        catch(InputMismatchException e)
                        {
                            System.out.println("Please enter a valid int.");
                            break quit;
                        }
                        int bComparisons = a.binarySearch(bToSearch);
                        if(a.getFound())
                        {
                            System.out.printf("Value found! Took %d comparisons.\n", bComparisons);
                            a.setFound(false);
                        }
                        else
                        {
                            System.out.printf("Value not found. Took %d comparisons.\n", bComparisons);
                        }
                        break;
                    case 3:
                        a.printArray();
                        break;
                    case 4:
                        break quit;
                    default:
                        break cont;
                }
            }
        }
    }
}