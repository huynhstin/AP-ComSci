
/**
 * Write a description of class Matrix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Matrix
{
    // instance variables
    public int row;
    public int column;
    public int[][] data;
    
    // constructor method
    public Matrix()
    {
        row = 0;
        column = 0;
        data = new int[row][column];
    }
    
    public Matrix(int newRow, int newColumn)
    {
        row = newRow;
        column = newColumn;
        data = new int[row][column];
    }
    
    public Matrix(double Walton, double Aaron)
    {
        
    }
    
    public void readValues()
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < row; i++){
            for(int k = 0; k < column; k++){
                data[i][k] = input.nextInt();
    }
}
}
}
