// WAP to check if a double Linked List is plaindrome
// WAP to find size of Double Linked List
import java.util.*;
class DLList
{
    Node head;
    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int d)
        {
            data=d;
            prev=null;
            next=null;
        }
    }
    static Scanner scr= new Scanner(System.in);
    public static void insert(DLList dll)
    {
        while(true)
        {
            System.out.print("Enter element or 0 to stop : ");
            char data=scr.next().charAt(0);
            if(data=='0')
            {
                System.out.println("Stopping the insertion process");
                break;
            }
            insertAtEnd(dll,data);
        }
    }
    static DLList insertAtEnd(DLList dll, int d)
    {
        Node fresh= new Node(d);
        fresh.prev=null;
        fresh.next=null;
        if (dll.head==null)
        {
            dll.head=fresh;
        }
        else
        {
            Node last =dll.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=fresh;
            fresh.prev=last;
        }
        return dll;
    }
    static boolean isPalindrome(DLList dll)
    {
        Node left=dll.head;
        Node right=dll.head;
        while(right.next!=null)
            right=right.next;
        while(left!=right)
        {
            if(left.data!=right.data)
                return false;
                left=left.next;
                right=right.prev;
        }
        return true;
    }

    //main function
    public static void main(String[] args) 
    {
        DLList dll= new DLList();
        System.out.println("Taking input... ");
        insert(dll);
        boolean ans= isPalindrome(dll);
        if(ans)
            System.out.println("The double linked list is palindrome");
        else
            System.out.println("The double linked list is not palindrome");
    }
}

