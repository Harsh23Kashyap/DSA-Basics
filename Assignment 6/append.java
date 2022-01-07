import java.util.*;
import java.io.*;

class Append extends LinkedList
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
        Node cur=l1.head;
        while (cur.next!=null)
        {
            cur=cur.next;
        }
        System.out.println("The final linked list merger is:  ");
        cur.next=l2.head;
        print(l1);
    }
}

