
/**
 * Write a description of class MatrixRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatrixRunner
{
    public static void main(String[] args)
    {
        Matrix A = new Matrix();
        Matrix B = new Matrix(5,5);
        Matrix C = new Matrix(20,20);
        
        B.readValues();
        A.readValues();
        C.readValues();
        
    }
}
