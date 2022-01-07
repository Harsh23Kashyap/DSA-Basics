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
class StackLLJava
{
    static class Node
    {
        int data;
        Node next;
        Node(final int d)
        {
            data=d;
            next=null;
        }
    }

    static Scanner scr = new Scanner(System.in);
    static Node head=new Node(0);
    static boolean entry=false;
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
                System.out.println("Viewing the stack ");
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
        final int ch = scr.nextInt();
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
        final int pos = scr.nextInt();
        if (entry==false)
        {
            entry=true;
            head.data=pos;
            head.next=null;
            return;
        }
        final Node tmp=new Node(pos);
        tmp.next=head;
        head=tmp;
    }

    static void pop() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Popping out element... : "+head.data);
        head=head.next;
    }

    static void peek() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the top element ... : "+head.data);

    }

    static boolean isFull() 
    {
        return false; //rarely gets full
    }

    static boolean isEmpty() 
    {
        return head==null;
    }

    static void display()
    {

        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        for(Node tmp=head;tmp!=null;tmp=tmp.next)
        {
            System.out.println(" | "+tmp.data+" |");
            System.out.println(" -----");
        }
    }
}