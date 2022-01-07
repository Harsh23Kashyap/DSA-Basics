// Write a program to find a saddle point in a two-dimensional array. 
//A saddle point in a numerical array is a number that is larger than or equal to every number in its column, 
//and smaller than or equal to every number in its row.
import java.util.*;
class Test 
{  
    static boolean findSaddlePoint(int mat[][], int n) 
    { 
        // Process all rows one by one 
        for (int i = 0; i < n; i++) 
        { 
            int min_row = mat[i][0], col_ind = 0; 
            for (int j = 1; j < n; j++) 
            { 
                if (min_row > mat[i][j]) 
                { 
                    min_row = mat[i][j]; 
                    col_ind = j; 
                } 
            } 
            int k; 
            for (k = 0; k < n; k++) 

                if (min_row < mat[k][col_ind]) 
                    break; 

            if (k == n) 
            { 
                System.out.println("Value of Saddle Point " + min_row); 
                return true; 
            } 
        } 

        return false; 
    } 

    static Scanner scr = new Scanner(System.in);

    public static void main(final String[] args) {
        System.out.println("Enter rows and columns for matrix (nXn) : ") ;
        int n = scr.nextInt();
        int a[][] = new int[n][n];
        int i,j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("Enter value for ["+i+","+j+"] th element : ");
                a[i][j] = scr.nextInt();
            }
            if (findSaddlePoint(a, n) == false) 
                System.out.println("No Saddle Point "); 
        } 
    } 
}
