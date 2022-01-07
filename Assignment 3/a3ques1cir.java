/*Develop a menu driven program for the following operations of on a Circular as well
as a Doubly Linked List.
(a) Insertion anywhere in the linked list (As a first node, as a last node, and
after/before a specific node).
(b) Deletion of a specific node, say 'Delete Node 60'. That mean the node to be
deleted may appear as a head node, last node or a node in between.
(c) Search for a node.
 */
import java.util.*;
import java.lang.*;
class CircularLinkedList
{
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data =d;
            next =null;
        }
    }
    static CircularLinkedList insertAtBeginning(CircularLinkedList l, int d)
    {
        Node cons=l.head;
        Node fresh= new Node(d);
        if (l.head==null)
        {
            l.head=fresh;
            fresh.next=l.head;
        }
        else
        {
            Node curr =l.head;
            do
            {
                curr=curr.next;
            }while(curr.next!=cons);
            curr.next=fresh;
            fresh.next=l.head;
            l.head=fresh;
        }
        return l;
    }

    public static CircularLinkedList insertAtEnd(CircularLinkedList list, int data)
    {
        Node new_Node=new Node(data);
        new_Node.next=null;
        if (list.head==null)
        {
            list.head = new_Node;
            new_Node.next=list.head;
        }
        else
        {
            Node constant = list.head;
            Node last = list.head;
            do
            {
                last = last.next;
            }while(last.next!= constant);
            last.next = new_Node;
            new_Node.next=list.head;
        }
        return list;
    }

    static CircularLinkedList insertAfter(CircularLinkedList l, int d, int v)
    {
        boolean f=false;
        Node fresh= new Node(d);
        Node curr=l.head;
        if (l.head==null)
        {
            System.out.println("linkedList is null, so can't insert");
            return null;
        }
        else 
        {
            do
            {
                if (curr.data == v && curr.next!=l.head)
                {
                    f=true;
                    fresh.next=curr.next;
                    curr.next=fresh;
                    break;
                }
                else if (curr.data == v && curr.next==l.head)
                {
                    f=true;
                    fresh.next=l.head;
                    curr.next=fresh;
                    break;
                }
                curr=curr.next;
            }while(curr.next!=l.head);
        }
        if(!f)
        System.out.println("Didn't insert , "+v+" not found.");
        return l;
    }

    //Delete element from key
    public static CircularLinkedList deleteAtKey(CircularLinkedList list, int key)
    {
        Node current = list.head;
        Node constant = list.head;
        Node prev = null;
        if (current.data==key)
        {
            list.head = current.next;
            System.out.println(key +" found and deleted ,was present at the very beginning  ");
            do
            {
                current = current.next;
            }while (current.next!=constant);
            current.next=list.head;
            return list;
        }
        do
        {
            if (current.data==key)
            {
                prev.next=current.next;
                System.out.println(key +" found and deleted.  ");
                return list;
            }
            prev=current;
            current=current.next;
        }while(current!=constant);
        System.out.println(key +" not found.  ");
        return list;
    }

    static void print(CircularLinkedList l)
    {
        Node cons=l.head;
        Node curr=l.head;
        if (curr==null)
        {
            System.out.print("No element found. ");
            return;
        }
        System.out.print("-> ");
        do
        {
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }while(curr!=cons);

    }

    public static void search(CircularLinkedList list, int val)
    {
        Node current = list.head;
        Node constant = list.head;
        do
        {
            if (current.data == val)
            {
                System.out.println(val +" is present.");
                return;
            }
            current = current.next;
        }while (current!=constant);
        System.out.println(val+" not found in list. ");
    }

// child class which can use basic operation of parent class
//TO USE THIS PLEASE CALL THE CLASS CircularLinkedList TOO
    static Scanner scr= new Scanner(System.in);
    static int menu()
    {
        System.out.println( );
        System.out.println( "--------——CIRCULAR LINKED LIST----------");
        System.out.println( "\t——MENU——- \n1.Insertion at the beginning.\n2.Insertion at the end.\n3.Insert after ");
        System.out.println( "4.Deletion of a specific node");
        System.out.println( "5.Search for a node.\n6.Display all node values.\n7.Exit \nEnter your choice ");
        int ch = scr.nextInt();
        return ch;
    }
    //main function
    public static void main(String[] args) 
    {
        CircularLinkedList list = new CircularLinkedList();
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
                System.out.print("Enter value to be deleted : ");
                val =scr.nextInt();
                deleteAtKey(list,val);
                break;
                case 5:
                System.out.print("Enter value to be searched : ");
                val =scr.nextInt();
                search(list, val);
                break;
                case 6:
                print(list);
                break;
                case 7:
                System.out.println("We are done ");
                break;
                default:
                System.out.println("Not an option \n");

            }
        } while (ch != 7);
    }
}