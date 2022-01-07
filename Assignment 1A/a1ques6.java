// Java program Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.
import java.io.*; 
import java.util.*;
class a1ques6 { 
    static Scanner scr = new Scanner(System.in);
    static  int a[][];
    // Function print matrix in spiral form
    static void spiral(int m, int n, int a[][]) {
        System.out.println("\nThe matrix in spiral form :");
        int i, k = 0, l = 0;
        int z=1;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                a[k][i]=z++;
            }
            k++;

            for (i = k; i < m; ++i) {
                a[i][n-1]=z++;
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    a[m-1][i]=z++;
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    a[i][l]=z++;
                }
                l++;
            }
        }
    }

    // driver program
    public static void main(String[] args) {
        System.out.println("Enter number for matrix (NXN) ");
        int r = scr.nextInt();
        a = new int[r][r];
        spiral(r,r, a);
        int c=0;
        for (int i = 0; i < r; i++) {
            for (int j= 0; j < r; j++)
            {
            System.out.print(a[i][j]+"  ");
            }
            System.out.println();

        }
        
	} 
} 
