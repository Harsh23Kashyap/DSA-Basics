import java.util.*;
import java.io.*;

class insertSort extends Sort
{
    static Scanner scr=new Scanner (System.in);
    public static void main(final String[] args) 
    {
        LinkedList list= new  LinkedList();
        input(list);
        System.out.println("The initial linked list is:  ");
        print(list);
        list.head = mergeSort(list.head);
        System.out.println("Enter value to be inserted:  ");
        int val =scr.nextInt();
        Node curr = list.head;
        int ind=0;
        while (curr!=null && curr.data<=val)
        {
            curr=curr.next;
            ind++;
        }
        insertAtIndex(list, val,ind);
        System.out.println("\nThe final linked list  is:  ");
        print(list);
    }
}

