/*
Implement two stacks in an array
Last Updated: 08-06-2020
Create a data structure twoStacks that represents two stacks. Implementation of twoStacks should use only one array, i.e., 
both stacks should use the same array for storing elements. 
Following functions must be supported by twoStacks.
 */
import java.util.*;
class twostack
{
    static Scanner scr = new Scanner(System.in);
    static int a[]= new int[100];
    static int m = -1;
    static int n=50;

    public static void main(final String[] args) 
    {
        //First stack
        push(1,1);
        push(2,1);
        push(3,1);
        push(4,1);
        push(5,1);
        display(1);
        push(100,0);
        push(200,0);
        push(300,0);
        push(400,0);
        push(500,0);
        display(0);

    }

    

    static void push(int pos, int val) 
    {
        if (isFull(val))
        {
            System.out.println("Overflow  ");
            return;
        }
        if(val==1)
            a[++m]=pos;
        else
            a[++n]=pos;
    }

    static void pop(int val) 
    {
        if (isEmpty(val))
        {
            System.out.println("Underflow  ");
            return;
        }
        if (val==1)
        {
            System.out.println("Popping out element... : "+a[m]);
            a[m--]=0;
        }
        else
        {
            System.out.println("Popping out element... : "+a[n]);
            a[n--]=0;
        }
    }

    static void peek(int val) 
    {
        if (isEmpty(val))
        {
            System.out.println("Underflow  ");
            return;
        }
        if(val==1)
        System.out.println("Viewing the top element ... : "+a[m]);
        else
        System.out.println("Viewing the top element ... : "+a[m]);

    }

    static boolean isFull(int val) 
    {
        if(val==1)
            return m==50;
        else
            return n==100;
    }
    static boolean isEmpty(int val) 
    {
        if (val==1)
        return m==-1;
        else
        return n==50;
    }

    static void display(int val)
    {
        if (isEmpty(val))
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the stack ");
        if(val==1)
        {
            for(int i=m;i>=0;i--)
            {
                System.out.println(" | "+a[i]+" |");
                System.out.println(" -----");
            }
        }
        else
        {
            for(int i=n;i>=50;i--)
            {
                System.out.println(" | "+a[i]+" |");
                System.out.println(" -----");
            }
        }
    }
}