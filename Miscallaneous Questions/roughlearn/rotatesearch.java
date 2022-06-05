
/*Search an element in a sorted and rotated array
An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.

sortedPivotedArray

Example:

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 3
Output : Found at index 8

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 30
Output : Not found

Input : arr[] = {30, 40, 50, 10, 20}
        key = 10   
Output : Found at index 3
Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.


All solutions provided here assume that all elements in the array are distinct.

Basic Solution:
Approach:



The idea is to find the pivot point, divide the array in two sub-arrays and perform binary search.
The main idea for finding pivot is – for a sorted (in increasing order) and pivoted array, pivot element is the only element for which next element to it is smaller than it.
Using the above statement and binary search pivot can be found.
After the pivot is found out divide the array in two sub-arrays.
Now the individual sub – arrays are sorted so the element can be searched using Binary Search.
Implementation:

Input arr[] = {3, 4, 5, 1, 2}
Element to Search = 1
  1) Find out pivot point and divide the array in two
      sub-arrays. (pivot = 2) Index of 5
      2) Now call binary search for one of the two sub-arrays.
      (a) If element is greater than 0th element then
             search in left array
      (b) Else Search in right array
          (1 will go in else as 1 < 0th element(3))
  3) If element is found in selected sub-array then return index
     Else return -1.
*/
import java.util.*;
import java.lang.*;
class arrayrotationsearch
{
    static boolean con=false;
    static Scanner scr=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter no. of elements : ");
        int arr[]=new int [scr.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i+1;
        }
        System.out.print("Rotate value by : ");
        int k =scr.nextInt();
        System.out.print("Enter value to be searched : ");
        int s =scr.nextInt();
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
        //now doing the steps
        int pivot=0;
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                pivot=i;
                break;
            }
        }
        System.out.println("Pivot : "+pivot);
        if(arr[0]<=s)
            search(arr,0,pivot,s);
        else
            search(arr,pivot+1,arr.length-1,s);
        if(!con)
            System.out.println("Not Found ");

        
    }
    static void search(int arr[], int start, int end,int s)
    {
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==s)
            {
                System.out.println("Found "+i);
                con=true;
                break;
            }
        }
    }
}
