//Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.
//This one has been tried using Library class of JAVA to understand that.
// Java code for stack implementation 

import java.io.*; 
import java.util.*; 

class NearElement
{ 
	static Scanner scr= new Scanner(System.in);
	public static void main (String[] args) 
	{ 
        System.out.println("Enter no. of elements ");
        int n=scr.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element : ");
            arr[i]=scr.nextInt();
        }
        System.out.println("Near elements are ");
        displayNear(arr);
    } 

    static void displayNear(int a[])
    {
        System.out.println("For "+a[0]+" near element is : "+(-1));
        Stack<Integer> st = new Stack<Integer>(); 
        st.push(a[0]);
        int k=0;
        for(int i=1;i<a.length;i++)
        {
            if(st.peek() < a[i])
                k=st.peek();
            else if(st.peek() >= a[i])
            {
                while (!st.empty() && st.peek() >=  a[i] )
                    st.pop();
                k= st.empty()?-1:st.peek();
            }
            System.out.println("For "+a[i]+" near element is : "+k);
            st.push(a[i]);
        }
    }
}
