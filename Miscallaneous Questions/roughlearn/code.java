/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        int t =0;
        try {
            t = scr.nextInt();

        } 
        catch(Exception e) 
        {

        } 
        int Sticks[] = new int [t];
        int i,j;
        int count[][] = new int [t][];
        int res[] = new int[t] ;
        for (i=0;i<t;i++)
        {
            try 
            {
                Sticks[i] = scr.nextInt();
            } 
            catch(Exception e) 
            {

            } 
            count[i] = new int [Sticks[i]];
            for (j=0;j<Sticks[i];j++)
            {
                try 
                {
                    count[i][j]= scr.nextInt();
                } 
                catch(Exception e) 
                {

                } 
            }
            Arrays.sort(count[i]);
                check(count[i]);
        }
    }
    static void check(int arr[])
    {
        int c=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>c)
            {
                
                c=arr[i];
                System.out.println(c);
            }
        }
        
    }
}
