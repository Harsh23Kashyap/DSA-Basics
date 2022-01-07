// WAP to find size of Double Linked List
import java.util.*;
class DLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int d)
        {
            data=d;
            prev=null;
            next=null;
        }
    }
    static Scanner scr= new Scanner(System.in);
    public static void insert(DLinkedList dll)
    {
        while(true)
        {
            System.out.print("Enter element or 0 to stop : ");
            int data=scr.nextInt();
            if(data==0)
            {
                System.out.println("Stopping the insertion process");
                break;
            }
            insertAtEnd(dll,data);
        }
    }
    static DLinkedList insertAtEnd(DLinkedList dll, int d)
    {
        Node fresh= new Node(d);
        fresh.prev=null;
        fresh.next=null;
        if (dll.head==null)
        {
            dll.head=fresh;
        }
        else
        {
            Node last =dll.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=fresh;
            fresh.prev=last;
        }
        return dll;
    }
    //main function
    public static void main(String[] args) 
    {
        DLinkedList dll= new DLinkedList();
        System.out.println("Taking input... ");
        insert(dll);
        int k=1;
        Node curr=dll.head;
        while(curr!=null)
        {
            k++;
            curr=curr.next;
        }
        k--;
        System.out.println("The number of elements in the doubly linked list is : "+k);
    }
}

