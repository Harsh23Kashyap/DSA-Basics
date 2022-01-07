// WAP to find size of Circular Linked List
import java.util.*;
// child class which can use basic operation of parent class
//TO USE THIS PLEASE CALL THE CLASS CircularLinkedList TOO
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
class a3ques3b
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
    //main function
    public static void main(String[] args) 
    {
        Node last = insert();
        int k=1;
        Node curr=last.next;
        do
        {
            k++;
            curr=curr.next;
        }while(curr!=last.next);
        k--;
        System.out.println("The number of elements in the circular linked list is : "+k);
    }
}

