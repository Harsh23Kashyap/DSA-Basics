//WAP to Check if a linked list is Circular Linked List
import java.util.*;
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data=d;
        next=null;
    }
    static Scanner scr= new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Enter 0 for termination");
        System.out.print("Enter element : ");
        int value=scr.nextInt();
        if (value==0)
        {
            System.out.println("This is a circular linked list");
            return;
        }
        Node head=new Node(value);
        Node last = new Node(value);
        while(true)
        {
            System.out.print("Enter element : ");
            value=scr.nextInt();
            if (value==0)
            {
                System.out.println("Ending insertion process...");
                break;
            }
            Node ins=new Node(value);
            last.next=ins;
            last=ins;
            ins.next=null;
        }
        System.out.println("Enter 0 to make linked list circular, 1 to make it a single linked list.");
        int ch=scr.nextInt();

        if (ch==0)
            last.next=head;
        //checking
        System.out.println("Checking if it is circular or not.... ");
        if (last.next==null)
        {
            System.out.println("Not a Circular Linked List ");
        }
        else 
        {
            System.out.println("It is a Circular Linked List ");
        }
    }
}
