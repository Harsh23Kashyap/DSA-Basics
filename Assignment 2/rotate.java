/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.
 */

import java.io.*;
import java.util.*;
class a2rotate extends LinkedList
{
    static Scanner scr=new Scanner (System.in);
    static int n;
    //insertion
    static void input(LinkedList list)
    {
        System.out.println("Enter number of elements ");
        n = scr.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter value of " + i + "th element ");
            int inp= scr.nextInt();
            insertAtLast(list,inp);
        }
    }

    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        print(l1);
        System.out.print("Enter places to be rotated : ");
        int k= scr.nextInt();
        int x= Math.abs(n-k);
        Node temp=l1.head;
        while(x>1)
        {
            x--;
            temp=temp.next;
        }
        Node newHead=temp.next;
        temp.next=null;
        temp=newHead;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=l1.head;
        l1.head=newHead;
        temp=l1.head;
        print(l1);
    }
}
