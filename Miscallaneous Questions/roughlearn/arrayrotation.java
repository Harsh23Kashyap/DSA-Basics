//Program for array rotation
//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
import java.util.*;
import java.lang.*;
class arrayrotation 
{
    static Scanner scr=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter no. of elements : ");
        int arr[]=new int [scr.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter value of "+(i+1)+" : ");
            arr[i]=scr.nextInt();
        }
        System.out.print("Rotate value by : ");
        int k =scr.nextInt();
        int temp[]=new int[k];
        for (int i=0;i<k;i++)
        {
            temp[i]=arr[i];
        }
        
        for (int i=0+k;i<arr.length;i++)
        {
            arr[i-k]=arr[i];
        }
        int j=0;
        for (int i=arr.length-k;i<arr.length;i++)
        {
            arr[i]=temp[j++];
        }
        System.out.println("\nRotated matrix : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"   ");
        }
    }
}
