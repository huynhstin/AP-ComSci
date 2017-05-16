
/**
 * Multiplies two matrices.
 * 
 * @author (Justin Huynh and Jason Tang) 
 * @version (Sep 23, 2016)
 */
import java.util.Scanner;
public class MatrixMultiplication
{
  public static void main(String[]args)
  {String user = "Y";
       do{
           
       Scanner input = new Scanner(System.in);
       Scanner sc = new Scanner(System.in);
       System.out.println("How many rows for the first matrix?");
       int rows1 = input.nextInt();
       System.out.println("How many columns for the first matrix?");
       int cols1 = input.nextInt();
       System.out.println("How many rows for the second matrix?");
       int rows2 = input.nextInt();
       System.out.println("How many columns for the second matrix?");
       int cols2 = input.nextInt();
       
       if(cols1 != rows2) {
    System.out.println("Try again. The first matrix's column must match the second matrix's rows.");   
    System.out.println("Would you like to continue? Y/N ");
    user = sc.nextLine();
}
          
      if(cols1==rows2){     
      
       int [][] matrix1 = new int [rows1][cols1];
       int [][] matrix2 = new int [rows2][cols2];
       int [][] res = new int [rows1][cols2];
       
            for(int i = 0; i < rows1; i++)
        {
             System.out.println("First matrix: Enter " +cols1+ " values in row " + (i+1));
            for(int j = 0; j < cols1; j++)
            {
                matrix1[i][j] = input.nextInt();
            }
}

            for(int i = 0; i < rows2; i++)
        {
             System.out.println("Second matrix: Enter " +cols2+ " values in row " + (i+1));
            for(int j = 0; j < cols2; j++)
            {
                matrix2[i][j] = input.nextInt();
            }
}

 //the calculations
            for(int c2=0; c2 < cols2; c2++)
            {                
                for(int r1 = 0; r1 < rows1; r1++ ){
                    int c1 = 0;
                    int result=0;
                    for(int r2 = 0; r2 < rows2; r2++){                   
                        result=result+matrix1[r1][c1]*matrix2[r2][c2];                 
                        c1++;
                }     
                res[r1][c2]=result;
            }
}

System.out.println("Result: ");

for(int o=0;o<rows1;o++)
    {
        for(int z=0;z<cols2;z++)
        {
            System.out.printf("%d ",res[o][z]);
        }
        System.out.println("");
}
    
    System.out.println("Would you like to continue? Y/N ");
    user = sc.nextLine();
    
}
}
while(user.equals("Y") || user.equals("y"));
System.out.println("Finished. ");
}
}