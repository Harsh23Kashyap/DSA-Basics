// #DesigntheLogictoFindaMissingNumberinaSortedArray.
import java.util.*;
import java.io.*;
class question7
{
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Enter number of elements ");
        int n = scr.nextInt();
        int arr[] = new int [n];
        int miss[] = new int [n-1];
        int i;
        for (i=0;i<arr.length;i++)
            arr[i]= i+1;
        int sum= n*(n+1)/2;        
        int usersum=0;
        System.out.println("Enter the rest of elements ");
        for (i=0;i<miss.length;i++)
        {
            System.out.println("Enter value of "+i+"th element ");
            miss[i]=scr.nextInt();
            usersum+=miss[i];
        }
        
        System.out.println("The missing element is "+(sum-usersum));
    }
}