
import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
      
        boolean cont = true;
        while (cont == true)
        {
            Scanner input = new Scanner (System.in);
            
            System.out.print("Enter the number of rows of the first matrix: ");
            int row1 = input.nextInt();
            System.out.print("Enter the number of columns of the first matrix: ");
            int col1 = input.nextInt();
            int[][] matrix1 = new int[row1][col1];
            
            System.out.print("Enter the number of rows of the second matrix: ");
            int row2 = input.nextInt();
            System.out.print("Enter the number of columns of the second matrix: ");
            int 
            col2 = input.nextInt();
            int[][] matrix2 = new int[row2][col2];
            
            //fills in the first matrix with user values
            for (int i = 0; i < row1; i++)
            {
                System.out.print("Enter " + col1 + " values: ");
                for (int j = 0; j < col1; j++)
                {
                    matrix1[i][j] = input.nextInt();
                }
            }
              
            //fills in the second matrix with user values
            for (int i = 0; i < row2; i++)
            {
                System.out.print("Enter " + col2 + " values: ");
                for (int j = 0; j < col2; j++)
                {
                    matrix2[i][j] = input.nextInt();
                }
            }
            
            
            //to display the two matrices
            System.out.println("HERE IS THE FIRST MATRIX.");
            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < col1; j++)
                {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
              
            System.out.println("HERE IS THE SECOND MATRIX.");
            for (int i = 0; i < row2; i++)
            {
                
                for (int j = 0; j < col2; j++)
                {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
            
            
            
            //to ask the user to continue
            System.out.print("Continue (y/n)? ");
            Scanner input2 = new Scanner (System.in);
            
            String userInput = input2.nextLine();
            if (!userInput.equals("y"))
                cont = false;
            
        }
    }
}