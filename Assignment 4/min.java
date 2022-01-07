/*
Design a stack that supports getMin() in O(1) time and O(1) extra space
 */
import java.util.*;
import java.io.*;
class min
{
    static Scanner scr = new Scanner(System.in);
    static int a[]= new int[100];
    static int top = -1;
    static int min;

    public static void main(final String[] args) 
    {
        int ch=0;
        do 
        {
            ch = menu();
            switch (ch) {
                case 1:
                System.out.print("Enter elements to be pushed : ");
                int pos = scr.nextInt();
                push(pos);
                break;
                case 2:
                pop();
                break;
                case 3:
                getMin();
                break;
                case 4:
                if (isEmpty())
                    System.out.println("Stack is empty .Underflow\n");
                else
                    System.out.println("Stack is not empty \n");
                break;
                case 5:
                if (isFull())
                    System.out.println("Stack is full. Overflow\n");
                else
                    System.out.println("Stack is not full \n");
                break;
                case 6:
                System.out.println("We are done ");
                break;
                default:
                System.out.println("Not an option \n");

            }
        } while (ch != 6);
    }

    static int menu() 
    {
        System.out.println("\n——MENU——- \n1.PUSH\n2.POP\n3.GET MIN\n4.EMPTY\n5.FULL\n6.EXIT\nEnter your choice");
        int ch = scr.nextInt();
        return ch;
    }

    static boolean isFull() 
    {
        return top == 100;
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void getMin() 
    {
        if (isEmpty())
            System.out.println("Stack is empty");

        else
            System.out.println("Minimum Element in the " + " stack is: " + min);
    }

    // prints top element of MyStack
    static void peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty ");
            return;
        }
        int t = a[top]; // Top element.
        System.out.print("Top Most Element is: ");
        if (t < min)
            System.out.println(min);
        else
            System.out.println(t);
    }

    // Removes the top element from MyStack
    static void pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        int t = a[top];
        a[top--] = 0;
        if (t < min) {
            System.out.println(min);
            min = 2 * min - t;
        } 
        else
            System.out.println(t);
    }

    // Insert new number into MyStack
    static void push(int x) 
    { 
        if (isEmpty()) 
        { 
            min = x; 
            a[++top]=x; 
            System.out.println("Number Inserted: " + x); 
            return; 
        } 

        if (x < min) 
        { 
            a[++top]=2*x - min; 
            min = x; 
        } 

        else
            a[++top]=x; 
        System.out.println("Number Inserted: " + x); 
    } 
}
