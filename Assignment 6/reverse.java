import java.io.*;
import java.util.*;
class Reverse extends LinkedList
{
    static Scanner scr=new Scanner (System.in);
    //insertion
    public static void reverse(LinkedList list) 
    {
        Node pointer = list.head;
        Node previous = null, current = null;
    
        while (pointer != null)
        {
            current = pointer;
            pointer = pointer.next;
        
            // reverse the link
            current.next = previous;
            previous = current;
            list.head = current;
        }
    }
    
    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        print(l1);
        System.out.println("\nReverse elements: ");
        reverse(l1);
        print(l1);
    }

}