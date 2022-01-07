/*
 * # ASSIGNMENT 4 2D Matrix Multiplication
#Implement the logic to Find the matrix multiplication

# A basic code for matrix input from the user 
 */
import java.util.Scanner;
class question4
{
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Enter the number of rows for both the matrix: ") ;
        int R = scr.nextInt();
        System.out.println("Enter the number of columns for both the matrix: ") ;
        int C = scr.nextInt();
        // Initialize matrix 
        int multiplied[][] = new int [R][C];
        int matrixA[][] = new int [R][C];
        int matrixB[][] = new int [R][C];
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
        System.out.println();
        System.out.println("Enter the entries rowwise: for second matrix") ;
        for (i=0;i<R;i++)
        {
            for (j=0;j<C;j++)
            {
                matrixB[i][j]=scr.nextInt();
            }
        }
        for (i=0;i<matrixA.length;i++)
        {
            for (j=0;j<matrixB[0].length;j++)
            {
                for (int k =0;k<matrixB.length;k++)
                    multiplied[i][j] += (matrixA[i][k] * matrixB[k][j]);
            }
        }
        System.out.println("\nThe final answer is ") ;
        for (i=0;i<R;i++)
        {
            for (j=0;j<C;j++)
            {
                System.out.print(multiplied[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}

