//BASIC OPERATIONS OF LINKED LIST
import java.util.*;
import java.lang.*;
// class for performing LinkedList operation.
class LinkedList
{
    static Scanner scr = new Scanner (System.in);
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
    // function to insert at the beginning taking input linkedList and the val to be inserted and
    // returning the LinkedList or the obect class created
    public static LinkedList insertAtBeginning(LinkedList list, int data)
    {
        //creating anew node to store the particular value;
        Node new_Node = new Node(data);
        //assigning list the head position
        new_Node.next=list.head; 
        list.head=new_Node;
        return list;
    }

    // function to insert at the end taking input linkedList and the val to be inserted and
    // returning the LinkedList or the obect class created
    public static LinkedList insertAtLast(LinkedList list, int data)
    {
        Node new_Node=new Node(data);
        new_Node.next=null;
        if (list.head==null)
        {
            list.head = new_Node;
        }
        else
        {
            Node last = list.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_Node;
        }
        return list;
    }
    //fn to insert before or after a particular value
    //Linkedlist in which the operation is to be taken place
    //check which stores the node before or after which value is to be inserted
    //data to store the value of new node
    //index which is either 0 or any other number to insert new node before or after particular node.
    public static LinkedList insertAfterBefore(LinkedList list, int check,int data,int ind)
    {
        Node new_Node=new Node(data);
        new_Node.next=null;
        Node prev =null;
        Node curr=list.head;
        boolean ans= false;
        if (list.head==null)
        {
            System.out.println("No element found, didn't insert ");
        }
        else if (list.head.data==check && ind!=0)
        {
            ans=true;
            return insertAtBeginning(list,data);
        }
        else
        {
            while(curr.next!=null)
            {
                if (curr.data==check)
                {
                    ans=true;
                    if (ind==0)
                    {
                        new_Node.next= curr.next;
                        curr.next=new_Node;
                        System.out.println(data+" added after Node "+curr.data);
                    }
                    else
                    {
                        prev.next= new_Node;
                        new_Node.next=curr;
                        System.out.println(data+" added before Node "+curr.data);
                    }
                    break;
                }
                prev=curr;
                curr=curr.next;
            }
        }
        if(!ans)
        System.out.println("Node "+check+" not found, didn't insert. ");
        return list;
    }

    //Printing by traversing
    public static void print(LinkedList list)
    {
        Node current = list.head;
        System.out.println("\n\tDisplaying the List  ");
        while (current!=null)
        {
            if (current.next!=null)
                System.out.print(current.data+" -> ");
            else
                System.out.println(current.data);
            current= current.next;
        }
    }
    //fn to delete the value at the beginning 
    public static String deleteAtBeginning(LinkedList l1)
    {
        if (l1.head==null)
            return null;
        else
        {
            int val = (l1.head).data;
            l1.head= l1.head.next;
            return Integer.toString(val);
        }
    }
    //function to delete value at the end
    public static String deleteAtEnd(LinkedList l1)
    {
        if (l1.head==null)

            return null;
        else
        {
            Node prev=null,curr =l1.head;
            while(curr.next!=null)
            {
                prev=curr;
                curr=curr.next;
            }
            int val=curr.data;
            if (curr==l1.head)
                l1.head=null;
            else
                prev.next= null;
            return Integer.toString(val);
        }
    }

    //Delete element from key passing linkedlist and value
    public static LinkedList deleteAtKey(LinkedList list, int key)
    {
        Node current = list.head;
        Node prev = null;
        if (current!= null && current.data==key)
        {
            list.head = current.next;
            System.out.println(key +" found and deleted ,was present at the very beginning  ");
            return list;
        }
        while (current!=null && current.data!=key)
        {
            prev= current;
            current = current.next;
        }
        if (current!=null)
        {
            prev.next = current.next;
            System.out.println(key +" found and deleted . ");
        }
        else if (current==null)
        {
            System.out.println(key+" not found . ");
        }
        return list;
    }
    //function to search a particular value in the linkedlist
    public static void search(LinkedList list, int val)
    {
        Node current = list.head;
        int counter=0;
        //traversal
        while (current!=null)
        {
            if (current.data == val)
            {
                System.out.println(val +" is present at index "+counter);
                return;
            }
            current = current.next;
            counter++;
        }
        System.out.println(val+" not found in list. ");
    }
}