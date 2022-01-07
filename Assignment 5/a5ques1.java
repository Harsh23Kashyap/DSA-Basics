/*
Develop a menu driven program demonstrating the following operations on simple
Queues: enqueue(), dequeue(), isEmpty(), isFull(), display(), and peek().
Note: Use either arrays or linked list to implement queue.
 */
import java.util.*;
import java.io.*;
class a5ques1
{
    static class Node
    {
        Node next;
        int data;
        Node()
        {
            data=0;
            next=null;
        }
    }
    static Scanner scr = new Scanner(System.in);
    static Node front = null;
    static Node rear = null;
    // Lets keep size as 100
    static int size = 100;
    static int top = 0;

    public static void main(final String[] args) {
        int ch = 0;
        do {
            ch = menu();
            switch (ch) {
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
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
        System.out.println("\n——MENU——- \n1.ENQUEUE\n2.DEQUEUE\n3.PEEK\n4.EMPTY\n5.FULL\n6.DISPLAY\n7.EXIT\nEnter your choice");
        int ch = scr.nextInt();
        return ch;
    }

    static void enqueue() 
    {
        if (isFull()) 
        {
            System.out.println("Overflow  ");
            return;
        }
        top++;
        System.out.print("Enter elements to be pushed : ");
        int pos = scr.nextInt();
        Node temp = new Node();
        temp.data=pos;
        if (rear == null || front==null) 
        {
            front = rear = temp;
        }
        else
        {
            rear.next=temp;
            rear=temp;
        }
    }

    static void dequeue() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        top--;
        System.out.println("Popping out element... : "+front.data);
        if(front.next==null)
            front=null;
        else
            front=front.next;
        return;
    }

    static void peek() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the top element ... : "+front.data);
       
    }

    static boolean isFull() 
    {
        return top==100;
    }
    static boolean isEmpty() 
    {
        if(front==null )
            return true;
        return false;

    }

    static void display()
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the Queue ");
        for(Node temp =front;temp!=rear.next;temp=temp.next)
        {
            System.out.println(" | "+temp.data+" |");
            System.out.println(" -----");
        }
    }

}