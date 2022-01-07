import java.util.*;
import java.io.*;

class Divide extends Sort
{
    static Scanner scr=new Scanner (System.in);
    //insertion

    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        print(l1);
        l1.head = mergeSort(l1.head);
        LinkedList even= new  LinkedList();
        LinkedList odd= new  LinkedList();
        Node h =l1.head;
        int ind=0;
        while (h!=null)
        {
            if(ind%2==0)
                insertAtLast(odd, h.data);
            else
                insertAtLast(even, h.data);
            ind++;
            h=h.next;
        }
        System.out.println("\nLinked List One ");
        print(odd);
        System.out.println("\nLinked List Two ");
        print(even);
    }
}

