/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
public class codeans1
{
    static int k =0;
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        int t =0;
        int k=0;
        int N[];
        try {
            t = scr.nextInt();

        } catch(Exception e) {
        } 
        N = new int [t];
        int i,j;
        int M[][] = new int [t][];
        int result[] = new int[t] ;
        for (i=0;i<t;i++)
        {
            try {
                N[i] = scr.nextInt();
            } catch(Exception e) {

            } 
            M[i] = new int [N[i]];
            for (j=0;j<M[i].length;j++)
            {
                try {
                    M[i][j]= scr.nextInt();
                } catch(Exception e) {

                } 
            }
            int m= good(M[i]) ;
            result[k++]=m;
        }  
        for (i=0;i<t;i++)
        {
            System.out.println(result[i]);
        }
       
    }

    public static int good(int []arr) 
    { 
        int count=0;
        int sum=0;
        int prev sum=0;
        int k=1;
        for (int i=1;i<arr.length-1;i++)
        {
            sum=arr[i];
            if (sum==k)
            count++;

        
    }
    return count;
    } 
}