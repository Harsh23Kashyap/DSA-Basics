/*
Write a program that checks if an expression has balanced parentheses.
*/
import java.util.*;
import java.io.*;
class a4ques3
{
    static Scanner scr = new Scanner(System.in);
    static int top=-1; //counter
    static char ch[]= new char [100];
    public static void main(final String[] args) 
    {
        System.out.println( "Enter paranthesis");
        String s=scr.next();
        for(int i=0;i<s.length();i++)
        {
            char p=s.charAt(i);
            if(p=='{' || p=='[' || p=='(')
            {
                push(p);
            }
            else if (p=='}' || p==']' || p==')')
            {
                if (isEmpty())
                {
                    System.out.println("Not Balanced  ");
                    return;
                }
                char para=pop();
                if (para=='{' && p!='}')
                {
                    System.out.println("Not Balanced  ");
                    return;
                }
                else if (para=='[' && p!=']')
                {
                    System.out.println("Not Balanced  ");
                    return;
                }
                else if (para=='(' && p!=')')
                {
                    System.out.println("Not Balanced  ");
                    return;
                }
            }
            
        }
        if(!isEmpty())
            System.out.println("Not Balanced  ");
        else
            System.out.println("Balanced  ");

    }
    static void push(char element) 
    {
        ch[++top]=element;
    }

    static char pop() 
    {
        char n=ch[top];
        ch[top--]=0;
        return n;
    }
    static boolean isEmpty() 
    {
        return top==-1;
    }
    
}