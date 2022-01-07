import java.util.*;
import java.io.*;

class Sort extends LinkedList
{
    static Scanner scr=new Scanner (System.in);

    public static Node sortedMerge(Node a, Node b) 
    { 
        Node result = null; 
        /* Base cases */
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 

        /* Pick either a or b, and recur */
        if (a.data <= b.data) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    } 

    public static Node mergeSort(Node h) 
    { 
        // Base case : if head is null 
        if (h == null || h.next == null) { 
            return h; 
        } 

        // get the middle of the list 
        Node middle = getMiddle(h); 
        Node nextofmiddle = middle.next; 

        // set the next of middle Node to null 
        middle.next = null; 

        // Apply mergeSort on left list 
        Node left = mergeSort(h); 

        // Apply mergeSort on right list 
        Node right = mergeSort(nextofmiddle); 

        // Merge the left and right lists 
        Node sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 

    // Utility function to get the middle of the linked list 
    public static Node getMiddle(Node head) 
    { 
        if (head == null) 
            return head; 

        Node slow = head, fast = head; 

        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 
    } 

    public static void main(final String[] args) 
    {
        LinkedList list= new  LinkedList();
        input(list);
        System.out.println("The initial linked list is:  ");
        print(list);
        System.out.println("\nThe final linked list merger is:  ");
        list.head = mergeSort(list.head);
        print(list);
    }
}

