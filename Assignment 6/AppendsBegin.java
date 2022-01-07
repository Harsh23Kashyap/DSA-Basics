import java.util.*;
import java.io.*;

class AppendsBegin extends LinkedList
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
        l2.head.next=l1.head;
        System.out.println("\nThe final linked list containing larger elements ");
        print(l2);
    }
}

