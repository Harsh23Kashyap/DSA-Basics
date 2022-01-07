/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scr=new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
        int t=0;
        try 
        {
            t=scr.nextInt();
        } 
        catch (Exception e) 
        {
        }
        String res[]=new String[t];
        for(int i=0;i<t;i++)
        {

            int n=0,k=0,x=0,y=0;
            try 
            {
                n=scr.nextInt();
                k=scr.nextInt();
                x=scr.nextInt();
                y=scr.nextInt();

            } 
            catch (Exception e) 
            {
            }
            if(x>=n || y>=n)
                res[i]="NO";
            else if(n==1)
                res[i]="YES";
            
            
        }
        for(int i=0;i<t;i++)
        System.out.println(res[i]);
	}
}
