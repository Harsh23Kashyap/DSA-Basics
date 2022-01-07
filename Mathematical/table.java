
import java.util.*;
import java.lang.*;
import java.io.*;
class table
{
    static Scanner scr = new Scanner(System.in);
    
    public static void main(final String[] args) 
    {
        int t =0;
        int N[];
        t = scr.nextInt();
        N = new int [t];
        for(int i=0;i<t;i++)
        {
            N[i]=scr.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            display(N[i]);
            System.out.println();
        }
    }
    static void display(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.print(n*i+" ");
        }
    }
}