// WAP to Split a Circular Linked List into two halves
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class splitcircular 
{
    static Scanner scr= new Scanner(System.in);
    static Node insert()
    {
        Node last=new Node(-1);
        while(true)
        {
            System.out.print("Enter element or 0 to stop : ");
            int data=scr.nextInt();
            Node tmp=new Node(data);
            if(data==0)
            {
                System.out.println("Stopping the insertion process");
                break;
            }
            if(last.data==-1)
            {
                last=tmp;
                tmp.next=tmp;
            }
            else
            {
                tmp.next=last.next;
                last.next=tmp;
                last=tmp;
            }
        }
        return last;
    }
    static void print(Node end)
    {
        Node copy=end.next;
        do
        {
            System.out.print(" -> "+copy.data);
            copy=copy.next;
        }while(copy!=end.next);
        System.out.println(" -> ");
    }
    static Node insertAtEnd(int d,int k, Node last)
    {
        Node fresh=new Node(d);
        if (k==1) //counter to checkmif it is a first element
        {
            last=fresh;
            fresh.next=fresh;
        }
        else
        {
            fresh.next=last.next;
            last.next=fresh;
            last=fresh;
        }
        return last;
    }

    //main function
    public static void main(String[] args) 
    {
        Node last=insert();
        System.out.println("\nThe circular linked list is :");
        print(last);
        Node slow =last.next;
        Node fast =last.next;
        Node divLast1 = new Node(0);
        Node divLast2 = new Node(0);
        int k=1;
        while(fast.next!=last.next && fast.next.next!=last.next)
        {
            divLast1=insertAtEnd(slow.data,k++,divLast1);
            slow=slow.next;
            fast=fast.next.next;
        }
        divLast1= insertAtEnd(slow.data,k++,divLast1);
        k=1;
        slow=slow.next;
        while(slow!=last.next)
        {
            divLast2=insertAtEnd(slow.data,k++,divLast2);
            slow=slow.next;
        }
        System.out.println("\nThe splitted linked lits is :  \n1."        );
        print(divLast1); 
        System.out.println("\n2."        );
        print(divLast2);
        System.out.println("\n"        );
    }
}

