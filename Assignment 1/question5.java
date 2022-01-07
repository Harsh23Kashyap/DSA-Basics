// Implement the Binary search algorithm regarded as a fast search algorithm with run-time complexity of Ï(log n) in comparison 
//to the Linear Search.

import java.util.*;
class question6binary { 
    // Returns index of x if it is present in arr[], 
    // else return -1 
    static Scanner scr = new Scanner(System.in);

    static int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 

            if (arr[m] == x) 
                return m; 

            if (arr[m] < x) 
                l = m + 1; 

            else
                r = m - 1; 
        } 

        return -1; 
    } 

    // Driver method to test above 
    public static void main(String args[]) 
    { 
        System.out.println("Enter number of elements ");
        int n = scr.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value of " + i + "th element ");
            arr[i] = scr.nextInt();
        }  
        System.out.println("Enter search element ");
        int x = scr.nextInt();
        int result = binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                + "index " + result); 
    } 
} 
