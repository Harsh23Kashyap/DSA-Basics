/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.
*/


import java.io.*;
import java.util.*;
class a2reverse extends LinkedList
{
    static Scanner scr=new Scanner (System.in);
    //insertion
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
    public static void reverse(LinkedList list) 
    {
        Node pointer = list.head;
        Node previous = null, current = null;
    
        while (pointer != null)
        {
            current = pointer;
            pointer = pointer.next;
        
            // reverse the link
            current.next = previous;
            previous = current;
            list.head = current;
        }
    }
    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        print(l1);
        System.out.print("Enter initial index m : ");
        int m = scr.nextInt();
        System.out.print("Enter final index n : ");
        int n = scr.nextInt();
        Node prev=l1.head;
        LinkedList part= new  LinkedList();
        Node curr;
        for(int i=1;i<m-1 ;i++)
        {
            prev=prev.next;
            if(prev.next==null)
                System.out.print("n value out of range");
        }
        curr = prev.next;
        for(int i=m;i<=n && curr!=null;i++)
        {
            insertAtLast(part, curr.data);
            if (curr.next==null)
                System.out.print("n value out of range");
            curr=curr.next;
        }
        reverse(part);
        Node add=part.head;
        while (add.next!=null)
            add=add.next;
        prev.next=part.head;
        add.next=curr;
        print(l1);
    }

}