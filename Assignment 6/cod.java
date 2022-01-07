import java.util.*;
class LinkedList
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
    static int ind=0;
    static HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(); 
    static boolean circular=false;
    public static LinkedList function2(final LinkedList list, int y,int x)
    {
        final Node new_Node=new Node(x);
        new_Node.next=null;
        Node curr=list.head;
        //y exists
        while(curr!=null)
        {
            if(curr.data==y)
            {
                new_Node.next=curr.next;
                curr.next=new_Node;
                h.put(x,1);
                return list;
            }
            curr=curr.next;
        }
        //x exists
        new_Node.data=y;
        if(list.head.data==x)
        {
            new_Node.next=list.head;
            list.head=new_Node;
            h.put(y,0);
            h.put(x,1);
            return list;
        }
        curr=list.head;
        while(curr.next!=null)
        {
            if(curr.next.data==x)
            {
                new_Node.next=curr.next;
                curr.next=new_Node;
                h.put(y,1);
                return list;
            }
            curr=curr.next;
        }
        return list;
    }
    public static LinkedList function1(final LinkedList list, final int data)
    {
        final Node new_Node=new Node(data);
        new_Node.next=null;
        if (list.head==null)
        {
            list.head = new_Node;
            h.put(data,0);
        }
        else
        {
            Node last = list.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_Node;
            h.put(data,1);
        }
        return list;
    }
    public static LinkedList function3(final LinkedList list, final int initial,int fin,int val)
    {
        int mid=0;
        Node curr;
        for(curr=list.head;curr!=null && curr.data!=initial ;curr=curr.next);
        if(curr==null)
            return list;
        Node copy=curr;
        while(curr.data!=fin)
        {
            if (curr==null) 
                return list;
            mid++;
            curr=curr.next;
        }
        mid=(mid%2==0)?(mid-1)/2:mid/2;
        int k=0;
        Node new_Node=new Node(val);
        while(copy!=null && k!=mid )
        {
            k++;
            copy=copy.next;
        }
        new_Node.next=copy.next;
        copy.next=new_Node;
        h.put(val,1);
        return list;
    }
    public static void function4(final LinkedList list, int x, int p)
    {
        int m=p;
        int inind=0;
        boolean found=false;
        if(list.head==null)
            return;
        Node curr=list.head;
        while(curr!=null)
        {
            if(curr.data==x)
            {
                found=true;
                break;
            }
            inind++;
            curr=curr.next;
        }
    
        int finind=inind;
        if(!found)
            return;
        found=false;
        Node begin=curr;
        Node temp=curr;
        while(p!=0)
        {
            p--;
            if(curr.next==null)
            {
                curr=list.head;
                found=true;
                finind=0;

            }
            else
            {
                curr=curr.next;
                finind++;
            }
        }
        if(curr==list.head || (inind<finind && found==true))
        {
            h.put(list.head.data, (h.get(list.head.data)+1));
            Node temp1=list.head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=list.head;
            circular=true;
        }
        else
        {
            circular=false;
        }
            int store=-1;
            int val=-1;
            while(temp!=curr)
            {
                temp=(temp.next==null)?list.head:temp.next;
                store=temp.data;
                val=h.get(store);
                h.put(temp.data, 0);
            }
            if(m==1)
            h.put(store,val);
            else
            h.put(store,++val);
            begin.next=curr;
    }


        //curr is pointing to a particular node
        /*Node beginp=curr;
        while(p!=0)
        {
            if(curr.next==null && p==1 )
            {
                curr.next=list.head;
                circular=true;
                h.put(list.head.data,h.get((list.head.data))+1);
            }
            else if(curr.next==null && p!=1 )
            {
                curr=list.head;
                circular=false;
            }
            p--;
            curr=curr.next;
        }
        Node temp=begp;
        int store=-1;
        int val=-1;
        int m=0;
        while(temp!=curr)
        {
            m++;
            temp=temp.next;
            store=temp.data;
            val=h.get(store);
            h.put(temp.data, 0);
        }
        //System.out.println("Val of "+store+" is "+val);
        if(m==1)
        h.put(store,val);
        else
        h.put(store,++val);
        begp.next=curr;
    }
    */
    
    public static void print(final LinkedList list)
    {
        if(list.head==null)
        return;
        Node current = list.head;
        while (current!=null)
        {
            System.out.print(current.data+" ");
            current= current.next;
            if(current==list.head)
                break;
        }
        System.out.println();
    }
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) 
    {
        LinkedList l= new LinkedList();
        int n=0;
        try
        {
            n=scr.nextInt();
        }
        catch (final Exception e){}
        while(n>0)
        {
            n--;
            char ch=' ';
            int x=0,y=0,z=0,cond=0;
            try
            {
                ch=scr.next().charAt(0);
            }
            catch (final Exception e){}
            if(ch=='U')
            {
                try
                {
                    x=scr.nextInt();
                    y=scr.nextInt();
                }
                catch (final Exception e){}
                function4(l, x, y);
            }
            else if (ch=='I')
            {
                try
                {
                    cond=scr.nextInt();
                }
                catch (final Exception e){}
                if(cond==0)
                {
                    try
                    {
                        x=scr.nextInt();
                    }
                    catch (final Exception e){}
                    l=function1(l, x);
                }
                else if (cond==1)
                {
                    try
                    {
                        y=scr.nextInt();
                        x=scr.nextInt();
                    }
                    catch (final Exception e){}
                    l=function2(l, y, x);
                }
                else if (cond==2)
                {
                    try
                    {
                        z=scr.nextInt();
                        y=scr.nextInt();
                        x=scr.nextInt();
                    }
                    catch (final Exception e){}
                    function3(l, z, y, x);
                }
            }
        }
        if(circular)
            System.out.println(1);
        else
            System.out.println(0);
        int freq=0;
        for (int i : h.keySet()) 
        {
            if(h.get(i)>1)
                freq++;
        }
        System.out.println(freq);
        if(freq==0)
        print(l);
        else
            for (int i : h.keySet()) 
            {
                if(h.get(i)>1)
                    System.out.print(i+" ");
            }
        System.out.println();
        if(freq!=0)
        for (int i : h.keySet()) 
        {
            if(h.get(i)>1)
                System.out.print(h.get(i)+" ");
        }
        System.out.println();

    }
}