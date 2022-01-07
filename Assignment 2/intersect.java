//Write a function to get the intersection point of two Linked Lists

import java.io.*;
import java.util.*;
class a2ques extends LinkedList
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
    
    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        LinkedList l2= new  LinkedList();
        input(l2);
        print(l2);
        Node curr1 =l1.head;
        boolean ans = false;
        int c=1;
        out: while (curr1!=null)
        {
            Node curr2=l2.head;
            while (curr2!=null)
            {
                if (curr1.data==curr2.data)
                {
                    ans=true;
                    break out;
                }
                curr2=curr2.next;
            }
            curr1=curr1.next;
            c++;
        }
        if (ans)
            System.out.println("Intersection point found at "+c+"th position and value - "+curr1.data);
        else
            System.out.println("Intersection point not found.  ");

    }

}