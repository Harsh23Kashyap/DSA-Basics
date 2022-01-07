/*Display all the node values in a circular linked list, repeating value of head node at the
end too. For example, if elements present in the circular linked list starting from head
are 20 → 100 → 40 → 80 → 60, then output should be displayed as 20 100 40 80 60
20.
 */

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

class a3ques2 
{
    static Scanner scr= new Scanner(System.in);
    static Node insert(int n)
    {
        Node last=new Node(-1);
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter value: ");
            int data=scr.nextInt();
            Node tmp=new Node(data);
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
        System.out.println("\nEnter number of elements: ");
        int n=scr.nextInt();
        Node last =insert(n);
        Node cl=last.next;
        do
        {
            System.out.print(cl.data+"  ");
            cl=cl.next;
        }while(cl!=last.next);
        System.out.println(cl.data+"  ");
    }
}

