import java.io.*;
import java.util.*;
class Palindrome extends Reverse
{
    static Scanner scr=new Scanner (System.in);
    //insertion

    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        System.out.println("\nEnter number of elements: ");
        int n=scr.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.println("\nEnter value: ");
            insertAtLast(l1, scr.nextInt());
        }
        print(l1);
        LinkedList p = new  LinkedList();
        Node curr = l1.head;
        int gin=0;
        int cn=n/2;
        while (gin++!=cn)
        {
            insertAtLast(p, curr.data);
            curr= curr.next;
        }
        if (n%2!=0)
            curr=curr.next;
        reverse(p);
        boolean ans=true;
        Node z= p.head;
        while(curr.next!=null)
        {
            if (curr.data!=z.data)
            {
                ans=false;
                break;
            }
            curr=curr.next;
            z=z.next;
        }
        z.next=curr;
        if (ans)
            System.out.println("\nThe list is palindrome ");
        else
            System.out.println("\nThe list is not palindrome ");

    }
}