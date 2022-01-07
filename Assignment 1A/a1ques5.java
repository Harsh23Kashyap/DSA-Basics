// Java program to print a given matrix in spiral form 
import java.io.*; 
import java.util.*;
class a1ques5 { 
    static Scanner scr = new Scanner(System.in);

    // Function print matrix in spiral form
    static int[] spiralPrint(int m, int n, int a[][]) {
        
        int b[] = new int [m*n];
        int x=0;
        int i, k = 0, l = 0;

        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                b[x++]=a[k][i];
            }
            k++;

            // Print the last column from the remaining columns
            for (i = k; i < m; ++i) {
                b[x++]=a[i][n-1];
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    b[x++]=a[m - 1][i];
                }
                m--;
            }

            // Print the first column from the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    b[x++]=a[i][l];
                }
                l++;
            }
            System.out.println();
        }
        return b;
    }


    // driver program
    public static void main(String[] args) {
        System.out.println("Enter number of rows ");
        int r = scr.nextInt();
        System.out.println("Enter number of columns ");
        int c = scr.nextInt();
        int a[][] = new int[r][c];
        for (int i = 0; i < a.length; i++) {
            for (int j= 0; j < a[0].length; j++)
            {
            System.out.println("Enter value of [" + i + ","+j+"] th element ");
            a[i][j] = scr.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j= 0; j < a[0].length; j++)
            {
            System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        int b[]=spiralPrint(r,c, a);
        System.out.println("The matrix in spiral format is");
        for (int i = 0; i < b.length; i++) 
            System.out.print(b[i]+"  ");
            System.out.println();
        }
       
	} 
