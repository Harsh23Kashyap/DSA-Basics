/*Space required to store any two-dimensional array is number of row X number of column,
Assuming array is used to store elements of the following matrices,
implement an efficient way that reduces the space requirement.
(e) Symmetric Matrix
*/
import java.util.*;
import java.io.*;
class a1ques1e
{
    static Scanner scr = new Scanner(System.in);
    static int a[][];
    public static void main(final String[] args) {
        System.out.println("Enter rows and columns for matrix (nXn) : ") ;
        int n = scr.nextInt();
        int p = (n*(n-1)/2);
        int d[]=new int[n];
        int ud[]= new int[p];
        int dn=0;
        int udn=0;
        int ldn=0;
        int i,j;
        for (i = 0; i < n; i++)
        {
            for (j= 0; j < n ;j++)
            {
                if(i==j)
                {
                    System.out.println("Enter value of [" + i + ","+j+"] th element ");
                    d[dn++] = scr.nextInt();
                }
                if (j>i)
                {
                    System.out.println("Enter value of [" + i + ","+j+"] th element ");
                    ud[udn++] = scr.nextInt();
                }
            }
        }
        dn=udn=ldn=0;
        boolean ans;
        System.out.println("\nSYMMETRIC MATRIX ");
        for (i = 0; i <n; i++)
        {
            ans= false;
            for (j= 0; j < n; j++)
            {
                if(i==j)
                    System.out.print(d[dn++]+"  ");
                else if (j>i)
                    System.out.print(ud[udn++]+"  ");
                else if (i>j && !ans)
                    for (int k=0,z=i-1,c=n-2;k<i;k++,z+=c--)
                    {
                        ans= true;
                        System.out.print(ud[z]+"  ");
                    }
            }
            System.out.println("");
        }
    }
}

