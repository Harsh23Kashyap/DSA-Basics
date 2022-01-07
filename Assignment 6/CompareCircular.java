import java.util.*;
import java.io.*;

class CompareCircular extends CircularLinkedList
{
    static Scanner scr=new Scanner (System.in);
    public static void main(final String[] args) 
    {
        CircularLinkedList l1= new  CircularLinkedList();
        CircularLinkedList l2= new  CircularLinkedList();
        input(l1);
        input(l2);
        print(l1);
        print(l2);
        CircularLinkedList ann= new CircularLinkedList();
        Node cur1=l1.head;
        Node cons1=l1.head;
        Node cur2=l2.head;
        Node cons2=l1.head;
        do
        {
            if(cur1.data>cur2.data)
                insertAtLast(ann,cur1.data);
            else 
                insertAtLast(ann,cur2.data);
            cur1=cur1.next;
            cur2=cur2.next;
        }while (cur1!=cons1 && cur2!=cons2);
        if ( cur1!=null)
        {
            while (cur1!=cons1)
            {
                insertAtLast(ann,cur1.data);
                cur1=cur1.next;
            }
        }
        else
        {
            while (cur2!=cons2)
            {
                insertAtLast(ann,cur2.data);
                cur2=cur2.next;
            }
        }
        System.out.println("\nThe final linked list containing larger elements ");
        print(ann);
    }
    System.out.println();
}

