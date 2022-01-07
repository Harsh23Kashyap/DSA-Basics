// package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
class codeval
{
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) 
    {
        int t =0;
        try 
        {
            t = scr.nextInt();

        } 
        catch(Exception e) 
        {
        } 
        for(var i=0;i<t;i++)
        {
            int N=0,K=0,X=0,Y=0;
            boolean cond=false;
            try
            {
                N = scr.nextInt();
                K = scr.nextInt();
                X = scr.nextInt();
                Y = scr.nextInt();
            }
            catch(Exception e) 
            {
            } 
            if(X>=N || Y>=N || N==0)
            {
                System.out.println("NO");
                return;
            }
            if(N==1)
            {
                System.out.println("YES");
                return;
            }
            int jump=X;
            int m=0;
            do
            {
                m++;
                jump+=K;
                if(jump>=N)
                    jump-=N;
                if(jump==Y)
                    cond=true;
            }while(jump!=X);
            if(cond)
                System.out.println("YES");
            else    
                System.out.println("NO");
            System.out.println(m);

        }
    }
}