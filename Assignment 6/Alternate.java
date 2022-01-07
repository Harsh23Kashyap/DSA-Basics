import java.util.*;
import java.io.*;

class Alternate extends LinkedList
{
    static Scanner scr=new Scanner (System.in);
    //insertion

    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        LinkedList l2= new  LinkedList();
        input(l1);
        input(l2);
        print(l1);
        print(l2);
        LinkedList ann= new LinkedList();
        Node cur1=l1.head;
        Node cur2=l2.head;
        int ind=0;
        while (cur1!=null && cur2!=null)
        {
            if(ind%2==0)
            {
                insertAtLast(ann,cur1.data);
                cur1=cur1.next;
            }
            else 
            {
                insertAtLast(ann,cur2.data);
                cur2=cur2.next;
            }
            ind++;
        }
        if ( cur1!=null)
        {
            while (cur1!=null)
            {
                insertAtLast(ann,cur1.data);
                cur1=cur1.next;
            }
        }
        else
        {
            while (cur2!=null)
            {
                insertAtLast(ann,cur2.data);
                cur2=cur2.next;
            }
        }
        System.out.println("\nThe final linked list containing  elements ");
        print(ann);
    }
}

