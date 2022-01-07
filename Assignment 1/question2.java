/*Question 2
Design the logic to remove the duplicate elements from an Array and after the deletion, the array should contain the unique elements.

*/
import java.util.*;
import java.io.*;
class question2
{
    private static int duplicate(int m[])
    {
        int c=0;
        for (int i = 0;i<m.length-c;i++)
        {
            for (int j=i+1;j<m.length-c;j++)
            {
                if (m[j]==m[i])
                {
    
                    c++;
                    delete(m,j);
                }
            }
        }
        return c;
    }
    private static void delete(int m[],int j)
    {
        for (int i=j;i<m.length-1;i++)
        {
            m[i]=m[i+1];
        }
    }
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Enter number of elements ");
        int n = scr.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of " + i+" th element ");
            a[i]= scr.nextInt();
        }
        int m = duplicate(a);
        System.out.println("Array ");
        for (int i =0;i<a.length-m;i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }

    
}