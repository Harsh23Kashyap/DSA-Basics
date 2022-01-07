//Write a program to reverse a linked list.

import java.io.*;
import java.util.*;
class a2ques4 extends LinkedList
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
    //reverse
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
        System.out.println("\nReverse elements: ");
        reverse(l1);
        print(l1);
    }

}