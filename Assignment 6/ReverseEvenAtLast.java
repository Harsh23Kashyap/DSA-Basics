import java.io.*;
import java.util.*;
class ReversetEvenAtLast extends Reverse
{
    static Scanner scr=new Scanner (System.in);
    //insertion
    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        print(l1);
        System.out.println("\nReverse elements: ");
        LinkedList even = new  LinkedList();
        LinkedList odd = new  LinkedList();
        Node curr = l1.head;
        while (curr!=null)
        {
            if (curr.data%2==0)
                insertAtLast(even, curr.data);
            else
            insertAtLast(odd, curr.data);
            curr= curr.next;
        }
        reverse(even);
        curr= odd.head;
        while(odd.next!=null)
            curr=curr.next;
        curr.next=even.head;
        print(l1);
    }

}