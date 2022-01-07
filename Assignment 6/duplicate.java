import java.io.*;
import java.util.*;
class DuplicateList extends LinkedList
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
        int dup=0;
        Node cur1=l1.head;
        Node first =l1.head;
        Node second=l2.head;
        LinkedList fin = new LinkedList();
        boolean res=false;
        while (cur1!=null)
        {
            Node cur2=l2.head;
            while(cur2!=null)
            {
                if (cur1.data==cur2.data)
                {
                    dup++;
                    res = true;
                    break;
                }
                cur2=cur2.next;
            }
            if(!res)
            {
                first =first.next;
                second=second.next;
            }
            cur1=cur1.next;
        }

        first.next =second;
        print(l1);
        System.out.println("\nNo. of duplicate elements : "+dup);
    }

}