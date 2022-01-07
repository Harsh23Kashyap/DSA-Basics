import java.util.*;
import java.lang.*;
class LinkedList
{
    static Scanner scr=new Scanner (System.in);
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data =d;
            next =null;
        }
    }
    public static LinkedList insertAtLast(LinkedList list, int data)
    {
        Node new_Node=new Node(data);
        new_Node.next=null;
        if (list.head==null)
        {
            list.head = new_Node;
        }
        else
        {
            Node last = list.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_Node;
        }
        return list;
    }

    public static LinkedList insertAtIndex(LinkedList list, int data,int index)
    {
        Node new_Node=new Node(data);
        new_Node.next=null;
        Node current = list.head;
        int counter = 1;
        if (list.head==null || index==0)
        {
            list.head = new_Node;
            new_Node.next=current;
        }
        else
        {
            while (current!=null)
            {
                if (counter==index)
                {
                    Node add= current.next;
                    current.next = new_Node;
                    new_Node.next = add;
                }
                counter++;
                current = current.next;
            }
        }
        return list;
    }

    //Printing
    public static void print(LinkedList list)
    {
        Node current = list.head;
        System.out.println("\n\tDisplaying the List  ");
        while (current!=null)
        {
            if (current.next!=null)
                System.out.print(current.data+" -> ");
            else
                System.out.println(current.data);
            current= current.next;
        }
    }

    //Delete element from key
    public static LinkedList deleteAtKey(LinkedList list, int key)
    {
        Node current = list.head;
        Node prev = null;
        if (current!= null && current.data==key)
        {
            list.head = current.next;
            System.out.println(key +" found and deleted ,was present at the very beginning  ");
            return list;
        }
        while (current!=null && current.data!=key)
        {
            prev= current;
            current = current.next;
        }
        if (current!=null)
        {
            prev.next = current.next;
            System.out.println(key +" found and deleted . ");
        }
        else if (current==null)
        {
            System.out.println(key+" not found . ");
        }
        return list;
    }
    //Delete element from index
    public static LinkedList deleteByIndex(LinkedList list, int index)
    {
        Node current = list.head;
        Node prev = null;
        if (current!= null && index==0)
        {
            list.head = current.next;
            System.out.println(index +" position list deleted.  ");
            return list;
        }
        int counter=0;
        while (current!=null)
        {
            if (index == counter)
            {
                prev.next = current.next;
                System.out.println(index +" position linked list deleted.  ");
                return list;
            }
            prev = current;
            current = current.next;
            counter++;
        }
        System.out.println(index+" not found . ");
        return list;
    }

    public static void search(LinkedList list, int val)
    {
        Node current = list.head;
        int counter=0;
        while (current!=null)
        {
            if (current.data == val)
            {
                System.out.println(val +" is present at index "+counter);
                return;
            }
            current = current.next;
            counter++;
        }
        System.out.println(val+" not found in list. ");
    }

    static void input(LinkedList list)
    {
        System.out.println("Enter number of elements ");
        int n = scr.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter value of " + i + "th element ");
            int inp= scr.nextInt();
            insertAtLast(list,inp);
        }
    }
}