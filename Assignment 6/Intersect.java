import java.util.*;
import java.io.*;

class Intersect extends LinkedList
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
        LinkedList ann= new LinkedList();
        Node cur1=l1.head;
        while (cur1!=null)
        {
            Node cur2=l2.head;
            while(cur2!=null)
            {
                if(cur1.data==cur2.data)
                {
                    insertAtLast(ann, cur1.data);
                    break;
                }
                cur2=cur2.next;
            }
            cur1=cur1.next;
        }
        print(ann);
    }
}