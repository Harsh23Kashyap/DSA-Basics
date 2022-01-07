/*The Stock Span Problem
Number of NGEs to the right
Last Updated: 21-04-2020
Given an array of n integers and q queries, print the number of next greater elements to the right of the given index element.

Examples:

Input : a[] = {3, 4, 2, 7, 5, 8, 10, 6}  
              q = 2 
              index = 0, 
              index = 5
Output: 4 
        1 
Explanation: the next greater elements
to the right of 3(index 0) are 4, 7, 8, 
10. The next greater elements to the right
of 8(index 5) are 10.*/
// Java linear time solution for stock span problem 

import java.util.Stack; 
import java.util.Arrays; 

public class NGE 
{ 
     
    static void calculateGreat(int gr[], int n, int S[]) 
    { 
        Stack<Integer> st = new Stack<>(); 
        st.push(n-1); 
        S[n-1] = 0; 
        for (int i = n-1; i >=0; i--) 
        { 
            
        } 
    } 

    // A utility function to print elements of array 
    static void printArray(int arr[]) 
    { 
        System.out.print(Arrays.toString(arr)); 
    } 

    // Driver method 
    public static void main(String[] args) 
    { 
        int price[] = { 10, 4, 5, 90, 120, 80 }; 
        int n = price.length; 
        int S[] = new int[n]; 

        calculateSpan(price, n, S); 

        // print the calculated span values 
        printArray(S); 
    } 
} 
// This code is contributed by Sumit Ghosh 
