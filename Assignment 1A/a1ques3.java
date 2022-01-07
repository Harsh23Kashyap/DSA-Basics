//Write a program to find sum of every row and every column in a two-dimensional array
import java.io.*; 
import java.util.*;
class SumofRowColumn    
{    
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;

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
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
        //Calculates sum of each row of given matrix    
        for(int i = 0; i < rows; i++){    
            sumRow = 0;    
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    
            
        //Calculates sum of each column of given matrix    
        for(int i = 0; i < cols; i++){    
            sumCol = 0;    
            for(int j = 0; j < rows; j++){    
              sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
} 