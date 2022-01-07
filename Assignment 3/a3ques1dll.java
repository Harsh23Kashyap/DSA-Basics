import java.util.*;
class DoubleLinkedList
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

    static DoubleLinkedList insertAtBeginning(DoubleLinkedList dll, int d)
    {
        Node fresh= new Node(d);
        fresh.prev=null;
        fresh.next=null;
        if (dll.head==null)
        {
            dll.head=fresh;
            return dll;
        }
        else
        {
            fresh.next=dll.head;
            dll.head.prev=fresh;
            dll.head=fresh;
        }
        return dll;
    }

    static DoubleLinkedList insertAtEnd(DoubleLinkedList dll, int d)
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
    //printing 
    static void print(DoubleLinkedList dll)
    {
        System.out.println("Printing Doubly Linked List : ");
        Node last = dll.head;
        while(last!=null)
        {
            if(last.next!=null)
            {
                System.out.print(last.data+" -> ");
            }
            else
            {
                System.out.print(last.data+"  ");
            }
            last=last.next;
        }
    }

    static DoubleLinkedList insertAfter(DoubleLinkedList dll, int d, int s)
    {
        Node fresh= new Node(d);
        if(dll.head==null)
        {
            System.out.println("Cannot insert in an empty linked list");
            return dll;
        }
        Node last=dll.head;
        if(dll.head.data==s)
        {
            fresh.next=dll.head.next;
            dll.head.next=fresh;
            fresh.prev=dll.head;
            return dll;
        }
        while(last!=null)
        {
            if (last.data==s)
            {
                fresh.next=last.next;
                last.next=fresh;
                fresh.prev=last;
                return dll;
            }
            last=last.next;
        }
        System.out.println("Number not found, didn't insert");
        return dll;
    }

    static DoubleLinkedList insertBefore(DoubleLinkedList dll, int d, int s)
    {
        Node fresh= new Node(d);
        if(dll.head==null)
        {
            System.out.println("Cannot insert in an empty linked list");
            return dll;
        }
        Node last=dll.head;
        if(dll.head.data==s)
        {
            insertAtBeginning(dll, d);
        }
        while(last!=null)
        {
            if (last.data==s)
            {
                fresh.next=last;
                fresh.prev=last.prev;
                (last.prev).next=fresh;
                return dll;
            }
            last=last.next;
        }
        System.out.println("Number not found, didn't insert");
        return dll;
    }

    static DoubleLinkedList deleteAtKey(DoubleLinkedList dll, int d)
    {
        if(dll.head==null)
        {
            System.out.println("Cannot delete in an empty linked list");
            return dll;
        }
        Node last=dll.head;
        Node previous=dll.head;
        if(dll.head.data==d)
        {
            dll.head=dll.head.next;
            dll.head.prev=null;
            return dll;
        }
        while(last!=null)
        {
            if (last.data==d && last.next!=null)
            {
                previous.next=last.next;
                (last.next).prev=previous;
                return dll;
            }
            if (last.data==d && last.next==null)
            {
                previous.next=last.next;
                return dll;
            }
            previous=last;
            last=last.next;
        }
        System.out.println("Number not found, didn't delete");
        return dll;
    }

    static void search(DoubleLinkedList dll, int d)
    {
        if(dll.head==null)
        {
            System.out.println("Cannot search in an empty linked list");
            return ;
        }
        Node last=dll.head;
        int i=1;
        while(last!=null)
        {
            if (last.data==d )
            {
                System.out.println(d+" found at index "+i);
                return;
            }
            i++;
            last=last.next;
        }
        System.out.println(d+" not found");
        return ;
    }

    static Scanner scr= new Scanner(System.in);
    static int menu()
    {
        System.out.println( );
        System.out.println( "--------——DOUBLY LINKED LIST----------");
        System.out.println( "\t——MENU——- \n1.Insertion at the beginning.\n2.Insertion at the end.\n3.Insert after ");
        System.out.println( "4.Insert Before \n5.Deletion of a specific node");
        System.out.println( "6.Search for a node.\n7.Display all node values.\n8.Exit \nEnter your choice ");
        int ch = scr.nextInt();
        return ch;
    }
    //main function
    public static void main(String[] args) 
    {
        DoubleLinkedList list = new DoubleLinkedList();
        int val;
        int ch=0;
        do {
            ch = menu();
            System.out.println();
            switch (ch) 
            {
                case 1:
                System.out.print("Enter value to be inserted at the beginning : ");
                val =scr.nextInt();
                insertAtBeginning(list, val);
                break;
                case 2:
                System.out.print("Enter value to be inserted at the end : ");
                val =scr.nextInt();
                insertAtEnd(list, val);
                break;
                case 3:
                System.out.print("Enter value to be inserted : ");
                val =scr.nextInt();
                System.out.print(val+" to be inserted after which node : ");
                int no =scr.nextInt();
                insertAfter(list, val, no);
                break;
                case 4:
                System.out.print("Enter value to be inserted : ");
                val =scr.nextInt();
                System.out.print(val+" to be inserted before which node : ");
                no =scr.nextInt();
                insertBefore(list, val, no);
                break;
                case 5:
                System.out.print("Enter value to be deleted : ");
                val =scr.nextInt();
                deleteAtKey(list,val);
                break;
                case 6:
                System.out.print("Enter value to be searched : ");
                val =scr.nextInt();
                search(list, val);
                break;
                case 7:
                print(list);
                break;
                case 8:
                System.out.println("We are done ");
                break;
                default:
                System.out.println("Not an option \n");

            }
        } while (ch != 8);
    }
}
