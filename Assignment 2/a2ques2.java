/*
Write a program to count the number of occurrences of a given key in a singly linked
list and then delete all the occurrences. For example, if given linked list is 1->2->1-
>2->1->3->1 and given key is 1, then output should be 4. After deletion of all the
occurrences of 1, the linked list is 2->2->3.
 */
import java.util.*;
// child class which can use basic operation of parent class
//TO USE THIS PLEASE CALL THE CLASS LinkedList TOO
class a2ques2 extends LinkedList
{
    static Scanner scr= new Scanner(System.in);
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
    // to remove duplicate and print
    static void duplicate (LinkedList l,int val)
    {
        int dup=0;
        while (l.head.data==val)
        {
            l.head=l.head.next;
        }
        Node prev = l.head;
        Node curr= l.head;
        while (curr!=null)
        {
           if (curr.data==val)
           {
                dup++;
                prev.next=curr.next;
           }
           prev=curr;
           curr=curr.next;
        }
        if (dup==0)
            System.out.println("No node found with "+val+" value.");
        else
            System.out.println("\nNode with "+val+" values are : "+dup);
        print(l);
    }

    //main function       
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        input(list);
        System.out.print("Enter value to be removed : ");
        int n=scr.nextInt();
        System.out.print("Elements before removal : ");
        print(list);
        System.out.print("Elements before removal : ");
        duplicate(list, n);
    }
}