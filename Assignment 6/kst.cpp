import java.util.*;
class Code
{
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node( final int d)
        {
            data =d;
            next =null;
        }
    }
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) 
    {
        Node head;
        head.next=null;
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
                    x=scr.nextInt();
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
                    insertAt(head,mid,z);
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
    }
}
                    
