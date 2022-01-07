/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class close
{
    static Scanner scr = new Scanner(System.in);
    
    public static void main(final String[] args) 
    {
        int t =0;
        int N[];
        int M[];
        t = scr.nextInt();
        N = new int [t];
        M = new int [t];
        for(int i=0;i<t;i++)
        {
            M[i]=scr.nextInt();
            N[i]=scr.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            divide(M[i],N[i]);
            System.out.println();
        }
    }
    static void divide(int m, int n)
    {
       double k=Math.round(m/(n*1.0));
        System.out.println((int)k*n);
    }
}