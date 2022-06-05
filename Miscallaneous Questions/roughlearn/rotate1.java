//Program for array rotation
//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
//The first 3 methods to rotate an array by d elements has been discussed in this post.
/*
Program to cyclically rotate an array by one
Given an array, cyclically rotate the array clockwise by one.

Examples:

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
Following are steps.
1) Store last element in a variable say x.
2) Shift all elements one position ahead.
3) Replace first element of array with x.
*/
import java.util.*;
import java.lang.*;
class arrayrotationcircular
{
    static Scanner scr=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter no. of elements : ");
        int arr[]=new int [scr.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i+1;
        }
        System.out.print("Rotate value by circularly ");
        int x= arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=x;
        System.out.println("\nRotated matrix : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"   ");
        }
    }
    
}
