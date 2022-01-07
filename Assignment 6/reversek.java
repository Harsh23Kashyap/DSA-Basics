import java.io.*;
import java.util.*;
class ReversetillK extends Reverse
{
    static Scanner scr=new Scanner (System.in);
    //insertion
    
    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        print(l1);
        System.out.print("\nNumber: ");
        int r = scr.nextInt();
        System.out.println("\nReverse elements: ");
        LinkedList p = new  LinkedList();
        Node curr = l1.head;
        int gin=0;
        while (gin++!=r)
        {
            insertAtLast(p, curr.data);
            curr= curr.next;
            
        }
        reverse(p);
        Node z= p.head;
        while(z.next!=null)
        z=z.next;
        z.next=curr;
        print(p);
    }

}