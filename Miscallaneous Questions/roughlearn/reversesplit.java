//Program for array rotation
//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
//The first 3 methods to rotate an array by d elements has been discussed in this post.
/*
Method 4 (The Reversal Algorithm) :

Algorithm :

rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], 1, n);
Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is :

Reverse A to get ArB, where Ar is reverse of A.
Reverse B to get ArBr, where Br is reverse of B.
Reverse all to get (ArBr) r = BA.
*/
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
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println("\nRotated matrix : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"   ");
        }
    }
    static void reverse(int arr[],int start,int end)
    {
        for(int i=start;i<(start+end)/2;i++)
        {
            arr[i]=arr[end-i-1];
        }
    }
}
