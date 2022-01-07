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
class stack
{
    static Scanner scr = new Scanner(System.in);
    static int a[]= new int[100];
    static int m = -1;

    public static void main(final String[] args) 
    {
        int ch=0;
        do {
            ch = menu();
            switch (ch) 
            {
                case 1:
                System.out.print("Enter elements to be pushed : ");
                int pos = scr.nextInt();
                push(pos);
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

    static void push(int pos) 
    {
        if (isFull())
        {
            System.out.println("Overflow  ");
            return;
        }
        a[++m]=pos;
    }

    static void pop() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Popping out element... : "+a[m]);
        a[m--]=0;
    }

    static void peek() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the top element ... : "+a[m]);
       
    }

    static boolean isFull() 
    {
        return m==100;
    }
    static boolean isEmpty() 
    {
        return m==-1;
    }

    static void display()
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the stack ");
        for(int i=m;i>=0;i--)
        {
            System.out.println(" | "+a[i]+" |");
            System.out.println(" -----");
        }
    }
}