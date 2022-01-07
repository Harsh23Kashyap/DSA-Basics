
import java.util.*;
import java.lang.*;
class CircularLinkedList
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
    public static CircularLinkedList insertAtLast(CircularLinkedList list, int data)
    {
        Node new_Node=new Node(data);
        new_Node.next=null;
        if (list.head==null)
        {
            list.head = new_Node;
            new_Node.next=list.head;
        }
        else
        {
            Node constant = list.head;
            Node last = list.head;
            do
            {
                last = last.next;
            }while(last.next!= constant);
            last.next = new_Node;
            new_Node.next=list.head;
        }
        return list;
    }

    public static CircularLinkedList insertAtIndex(CircularLinkedList list, int data,int index)
    {
        Node new_Node=new Node(data);
        new_Node.next=null;
        Node constant = list.head;
        Node current = list.head;
        int counter = 1;
        if (list.head==null || index==0)
        {
            list.head = new_Node;
            new_Node.next=current;
            do
            {
                current = current.next;
            }while (current.next!=constant);
            current.next=list.head;
        }
        else
        {
            do
            {
                if (counter++==index)
                {
                    Node add = current.next;
                    current.next = new_Node;
                    new_Node.next = add;
                }
                current = current.next;
            }while(current.next!=constant);
        }
        return list;
    }

    //Printing
    public static void print(CircularLinkedList list)
    {
        Node current = list.head;
        Node constant = list.head;
        System.out.println("\n\tDisplaying the List  ");
        do
        {
            System.out.print(current.data+" -> ");
            current= current.next;
        }while (current!=constant);
    }

    //Delete element from key
    public static CircularLinkedList deleteAtKey(CircularLinkedList list, int key)
    {
        Node current = list.head;
        Node constant = list.head;
        Node prev = null;
        if (current.data==key)
        {
            list.head = current.next;
            System.out.println(key +" found and deleted ,was present at the very beginning  ");
            do
            {
                current = current.next;
            }while (current.next!=constant);
            current.next=list.head;
            return list;
        }
        do
        {
            prev= current;
            current = current.next;
        }while (current.next!=constant && current.data!=key);
        if (current.next!=constant)
        {
            prev.next = current.next;
            System.out.println(key +" found and deleted . ");
        }
        else if (current.next==constant)
        {
            System.out.println(key+" not found . ");
        }
        return list;
    }
    //Delete element from index
    public static CircularLinkedList deleteByIndex(CircularLinkedList list, int index)
    {
        Node current = list.head;
        Node constant = list.head;
        Node prev = null;
        if (current!= null && index==0)
        {
            list.head = current.next;
            System.out.println(index +" position list deleted.  ");
            do
            {
                current = current.next;
            }while (current.next!=constant);
            current.next=list.head;
            return list;
        }
        int counter=0;
        do
        {
            if (index == counter++)
            {
                prev.next = current.next;
                System.out.println(index +" position linked list deleted.  ");
                return list;
            }
            prev = current;
            current = current.next;
        }while (current!=constant);
        System.out.println(index+" not found . ");
        return list;
    }

    public static void search(CircularLinkedList list, int val)
    {
        Node current = list.head;
        Node constant = list.head;
        int counter=0;
        do
        {
            if (current.data == val)
            {
                System.out.println(val +" is present at index "+counter);
                return;
            }
            current = current.next;
            counter++;
        }while (current!=constant);
        System.out.println(val+" not found in list. ");
    }

    static void input(CircularLinkedList list)
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