//Write a program to add two polynomials using a linked list.

import java.io.*;
import java.util.*;
class Polynomial
{
    Node head;
    static class Node
    {
        int value;
        int degree;
        Node next;
        Node(int v, int d)
        {
            value=v;
            degree=d;
            next=null;
        }
    }
    static Scanner scr= new Scanner(System.in);
    public static Polynomial insertAtLast(Polynomial p, int val,int deg)
    {
        Node new_Node=new Node(val,deg);
        new_Node.next=null;
        if (p.head==null)
        {
            p.head = new_Node;
        }
        else
        {
            Node last = p.head;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_Node;
        }
        return p;
    }
    static void input(Polynomial p)
    {
        System.out.println("Enter number of terms ");
        int n = scr.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter coefficient of " + i + "th term ");
            int v= scr.nextInt();
            System.out.println("Enter degree of " + i + "th term with "+v+" as value");
            int d= scr.nextInt();
            insertAtLast(p,v,d);
        }
    }
    static void print(Polynomial p)
    {
        Node current = p.head;
        System.out.println("\nThe polynomial expression is ");
        while (current!=null)
        {
            if (current.next!=null)
                System.out.print(current.value+"x^"+current.degree+" + ");
            else
                System.out.println(current.value+"x^"+current.degree);
            current= current.next;
        }
    }

    public static void main(String[] args)
    {
        Polynomial p1= new Polynomial();
        Polynomial p2= new Polynomial();
        input(p1);
        input(p2);
        print(p1);
        print(p2);
        // to add both poylnomial
        Polynomial add= new Polynomial();
        Node curr1=p1.head;
        boolean res;
        while(curr1!=null)
        {
            res=false;
            Node curr2=p2.head;
            while(curr2!=null)
            {
                if(curr1.degree==curr2.degree)
                {
                    res=true;
                    insertAtLast(add, curr1.value + curr2.value , curr1.degree);
                }
                curr2=curr2.next;
            }
            if(!res)
                insertAtLast(add, curr1.value, curr1.degree);
            curr1=curr1.next;
        }
        Node curr2=p2.head;
        while(curr2!=null)
        {
            res=false;
            Node fin=add.head;
            while(fin!=null)
            {
                if(fin.degree==curr2.degree)
                {
                    res=true;
                }
                fin=fin.next;
            }
            if(!res)
                insertAtLast(add, curr2.value, curr2.degree);
            curr2=curr2.next;
        }
        System.out.print("\nThe final polynomial value is ");
        print(add);
    }
}