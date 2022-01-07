import java.io.*;
import java.util.*;
class Stack extends LinkedList
{
    static Scanner scr=new Scanner (System.in);
    
    public static void push (LinkedList l1, int val)
    {
        Node new_Node = new Node(val);
        new_Node.next=l1.head;
        l1.head=new_Node;
    }

    public static String pop(LinkedList l1)
    {
        if (l1.head==null)
            return null;
        else
        {
            int val = (l1.head).data;
            l1.head= l1.head.next;
            return Integer.toString(val);
        }
    }
    public static void main(final String[] args) 
    {
        LinkedList list = new  LinkedList();
        System.out.println("Enter number of entries");
        int n = scr.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter value : ");
            push (list, scr.nextInt());
        }
        System.out.println("Values: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(pop(list)+"  ");
        }

    }
}