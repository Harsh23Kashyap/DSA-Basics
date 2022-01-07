import java.util.*;
class Code
{
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node( )
        {
            data =0;
            next =null;
        }
    }
    static Scanner scr = new Scanner(System.in);
    static HashMap <Integer, Integer> hmap = new HashMap<Integer, Integer>();
    static boolean isCircular=false;
    static  void insertAtEnd(Node head, int key)
    {
        Node temp=head;
        Node object= new Node();
        object.data=key;
        object.next=null;
        if(head==null)
        {
            head=object;
            hmap.put(key,0);
            return;
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=object;
            hmap.put(key,1);
            return;
        }
    }

    static Node searchAfter(Node temp,int key)
    {
        Node head=temp;
        while(head!=null)
        {
            if(head.data==key)
            {
                return head;
            }
            else
            {
                head=head.next;
            }
        }
        return null;
    }

    static Node searchBefore(Node temp, int key)
    {
        Node head=temp;
        Node prev=null;
        while(head!=null)
        {
            if(head.data==key)
            {
                return prev;
            }
            prev=head;
            head=head.next;
        }
        return prev;
    }

    static Node mid(Node temp,int x,int y)
    {
        Node head=temp;
        Node start=searchAfter(head,x);
        Node end=searchAfter(head,y);
        Node slow=start;
        Node fast=start.next;
        while(fast!=end && fast.next!=end)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    static void insertAt(Node head,Node loc,int key)
    {
        Node object= new Node();
        object.data=key;
        if(loc==null)
        {
            object.next=head;
            hmap.put(head.data,1);
            head=object;
            hmap.put(head.data,0);
            return;
        }
        Node temp=loc.next;
        loc.next=object;
        object.next=temp;
        hmap.put(object.data,1);
        return;
    }

    static void updateLinkedList(Node head,Node position,int d)
    {
        Node temp =position;
        hmap.put(temp.next.data,(temp.next.data)--);
        while(d>0)
        {
            d--;
            if(temp.next==null)
            {
                temp=head;
                isCircular=true;
                hmap.put(head.data,1);
            }
            else
            {
                temp=temp.next;

            }
            hmap.put(temp.data,(temp.data)++);
            position.next=temp;
            return;
        }
        return;
    }

    public static void main(final String[] args) 
    {
        Node head= new Node();
        int n=0;
        try
        {
            n=scr.nextInt();
        }
        catch (final Exception e){}
        for(int i=1;i<=n;i++)
        {
            char ch=' ';
            try
            {
                ch=scr.next().charAt(0);
            }
            catch (final Exception e){}
            if(ch=='I')
            {
                int type=0;
                try
                {
                    type=scr.nextInt();
                }
                catch (final Exception e){}
                if(type==0)
                {
                    int key=0;
                    try
                    {
                        key=scr.nextInt();
                    }
                    catch (final Exception e){}
                    insertAtEnd(head, key);
                }
                else if (type==1)
                {
                    int x=0,y=0;
                    try
                    {
                        x=scr.nextInt();
                        y=scr.nextInt();
                    }
                    catch (final Exception e){}
                    Node loc;
                    loc=searchAfter(head,x);
                    if(loc!=null)
                    {
                        insertAt(head,loc,y);
                    }
                    else
                    {
                        loc=searchBefore(head,y);
                        insertAt(head,loc,x);
                    }
                }
                else if(type==2)
                {
                    int x=0,y=0,z=0;
                    try
                    {
                        x=scr.nextInt();
                        y=scr.nextInt();
                        z=scr.nextInt();

                    }
                    catch (final Exception e){}
                    Node middle= mid(head,x,y);
                    insertAt(head,middle,z);
                }
            }
            else if(ch=='U')
            {
                int x=0,d=0;
                try
                {
                    x=scr.nextInt();
                    d=scr.nextInt();
                }
                catch (final Exception e){}
                Node position;
                position=searchAfter(head,x);
                updateLinkedList(head,position,d);
            }
        }
        for (int i : hmap.keySet()) 
        {
            System.out.println("key: " + i + " value: " + hmap.get(i));
        }
    }
}

