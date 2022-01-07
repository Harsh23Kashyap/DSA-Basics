/* ASSIGNMENT 4 2D Matrix TRANSPOSE
#Implement the logic to Find the Transpose of a Matrix

# A basic code for matrix input from user 
 */
import java.util.Scanner;
class question5
{
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Enter the number of rows for the matrix: ") ;
        int R = scr.nextInt();
        System.out.println("Enter the number of columns for the matrix: ") ;
        int C = scr.nextInt();
        // Initialize matrix 
        int transpose[][]= new int [C][R];
        int matrixA [][]= new int [R][C];
        System.out.println("Enter the entries rowwise: for first matrix") ;
        int i,j;
        //For user input 
        for (i=0;i<R;i++)
        {
            for (j=0;j<C;j++)
            {
                matrixA[i][j]=scr.nextInt();
            }
        }
        System.out.println("The original matrix is : ") ;

        for (i=0;i<R;i++)
        {
            for (j=0;j<C;j++)
            {
                System.out.print(matrixA[i][j]+"  ");
            }
            System.out.println();
        }
        for (i=0;i<C;i++)
        {
            for (j=0;j<R;j++)
            {
                transpose[i][j]=matrixA[j][i];
            }
        }
        System.out.println("The transpose matrix is : ") ;

        for (i=0;i<C;i++)
        {
            for (j=0;j<R;j++)
            {
                System.out.print(transpose[i][j]+"  ");
            }
            System.out.println();
        }
    }
}