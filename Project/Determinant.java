/**
 * Compute determinant of a 2x2 or 3x3 matrix
 * 
 * @author (Justin Huynh and Jason Tang) 
 * @version (Sep 16, 2016)
 */
import java.util.Scanner;
public class Determinant
{
   public static void main(String []args)
   {
       String user = "Y";
       while(user.equals("Y")){
       Scanner input = new Scanner(System.in);
       
       System.out.println("2 or 3 rows and columns? ");
       int dimension = input.nextInt();
       int [][] matrix = new int [3][5];
       
       if(dimension == 2){
            for(int i = 0; i < 2; i++)
        {
             System.out.println("Enter 2 values in row " + (i+1));
            for(int j = 0; j < 2; j++)
            {
                matrix[i][j] = input.nextInt();
            }
}
   
    int det2 = (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
    System.out.println("The determinant is " +det2+ ".");
    
}
    if(dimension == 3){
           for(int i = 0; i < 3; i++)
        {
             System.out.println("Enter 3 values in row " + (i+1));
            for(int j = 0; j < 3; j++)
            {
                matrix[i][j] = input.nextInt();
            }
}

    int det1=(matrix[0][0]*matrix[1][1]*matrix[2][2]);
    int det2=(matrix[0][1]*matrix[1][2]*matrix[2][0]);
    int det3=(matrix[0][2]*matrix[1][0]*matrix[2][1]);
    int result1=det1+det2+det3;
    int det4=(matrix[0][2]*matrix[1][1]*matrix[2][0]);
    int det5=(matrix[0][0]*matrix[1][2]*matrix[2][1]);
    int det6=(matrix[0][1]*matrix[1][0]*matrix[2][2]);
    int result2= det4+det5+det6;
    int res = result1-result2;

System.out.println("The determinant is " +res+ ".");
}
Scanner sc = new Scanner(System.in);
System.out.println("Would you like to continue? Y/N ");
user = sc.nextLine();
}
System.out.println("Finished. ");
}
}