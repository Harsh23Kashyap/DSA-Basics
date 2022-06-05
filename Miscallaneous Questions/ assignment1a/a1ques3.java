// 3. Write a program to find sum of every row and every column in a two-dimensional array.
import java.util.*;
import java.io.*;
class a1ques3
{
    static Scanner scr = new Scanner(System.in);
    static int a[][];
    public static void main(final String[] args) {
        System.out.println("Enter number of rows ");
        int r = scr.nextInt();
        System.out.println("Enter number of columns ");
        int c = scr.nextInt();
        a = new int[r][c];
        for (int i = 0; i < a.length; i++) {
            for (int j= 0; j < a[0].length; j++)
            {
                System.out.println("Enter value of [" + i + ","+j+"] th element ");
                a[i][j] = scr.nextInt();
            }  
        }
        //Calculates sum of each row of given matrix    
        for(int i = 0; i < r; i++){    
            int sumRow = 0;    
            for(int j = 0; j < c; j++){    
                sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    

        //Calculates sum of each column of given matrix    
        for(int i = 0; i < c; i++){    
            int sumCol = 0;    
            for(int j = 0; j < r; j++){    
                sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
}    
