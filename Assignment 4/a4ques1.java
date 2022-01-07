/*
#1) Develop a Menu driven program to demonstrate the following operations o Arrays
#——MENU——- 
# 1.PUSH 
# 2.POP
# 3.PEEK
# 4.EMPTY
# 5.FULL
# 6.DISPLAY
# 7.EXIT
 */
import java.util.*;
import java.io.*;
class a4ques1
{
    static Scanner scr = new Scanner(System.in);
    static int a[]= new int[100];
    static int top = -1;

    public static void main(final String[] args) 
    {
        int ch=0;
        do {
            ch = menu();
            switch (ch) {
                case 1:
                push();
                break;
                case 2:
                pop();
                break;
                case 3:
                peek();
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
                display();
                break;
                case 7:
                System.out.println("We are done ");
                break;
                default:
                System.out.println("Not an option \n");

            }
        } while (ch != 7);
    }

    static int menu() 
    {
        System.out.println( "\n——MENU——- \n1.PUSH\n2.POP\n3.PEEK\n4.EMPTY\n5.FULL\n6.DISPLAY\n7.EXIT\nEnter your choice");
        int ch = scr.nextInt();
        return ch;
    }

    static void push() 
    {
        if (isFull())
        {
            System.out.println("Overflow  ");
            return;
        }
        System.out.print("Enter elements to be pushed : ");
        int pos = scr.nextInt();
        a[++top]=pos;
    }

    static void pop() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Popping out element... : "+a[top]);
        a[top--]=0;
    }

    static void peek() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the top element ... : "+a[top]);
       
    }

    static boolean isFull() 
    {
        return top==100;
    }
    static boolean isEmpty() 
    {
        return top==-1;
    }

    static void display()
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the stack ");
        for(int i=top;i>=0;i--)
        {
            System.out.println(" | "+a[i]+" |");
            System.out.println(" -----");
        }
    }
}