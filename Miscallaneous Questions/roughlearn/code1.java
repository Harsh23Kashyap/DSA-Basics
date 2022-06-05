/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class code
{
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        int t =0;
        int N[];
        int K[];
        try {
            t = scr.nextInt();

        } catch(Exception e) {

        } 
        N = new int [t];
        K = new int [t];
        int i,j;
        int result[] = new int [t];
        int M[][] = new int [t][];
        for (i=0;i<t;i++)
        {
            try {
                N[i] = scr.nextInt();
                K[i] = scr.nextInt();

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
        }  
        int c;
        int ad=-1;
        for (i=0;i<t;i++)
        {
            c=10000;
            for (j=0;j<M[i].length;j++)
            {
                if (K[i]%M[i][j]==0)
                {

                    if (K[i]/M[i][j]<c){
                        c=K[i]/M[i][j];
                        ad=M[i][j];
                    }
                }
            }
            if (c!=10000)
            result[i]=ad;
            else
            result[i]=-1;
        }
        for (i=0;i<t;i++)
            System.out.println(result[i]);
    }
}
 