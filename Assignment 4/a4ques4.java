//Write a program to convert an Infix expression into a Postfix expression.
import java.util.*;
import java.io.*;
class a4ques4
{
    static Scanner scr = new Scanner(System.in);
    static char st[]= new char [100];
    static int top = -1;

    public static void main(final String[] args) 
    {
        System.out.println("Enter the infix expression");
        String exp=scr.next();
        System.out.println("Infix expression : "+exp);
        exp="("+exp+")";
        String post="";
        for(int i=0;i< exp.length();i++)
        {
            char ch=exp.charAt(i);
            switch (ch)
            {
                case '(':
                push(ch);
                break;
                case ')':
                while(true)
                {
                    char putout=pop();
                    if(putout=='(')
                        break;
                    post=post+putout;
                }
                break;
                case '^':
                push(ch);
                break;
                case '*':
                case '/':
                while(true)
                {
                    char putout=peek();
                    if (peek()=='^' || peek()=='*' || peek()=='/')
                    {
                        putout=pop();
                        post=post+putout;
                    }
                    else
                    {
                        push(ch);
                        break;
                    }
                }
                break;
                case '+':
                case '-':
                while(true)
                {
                    char putout=peek();
                    if (peek()=='^' || peek()=='*' || peek()=='/' || peek()=='+' || peek()=='-')
                    {
                        putout=pop();
                        post=post+putout;
                    }
                    else
                    {
                        push(ch);
                        break;
                    }
                }
                break;
                default:
                post=post+ch;
            }
        }
        System.out.println("Postfix expression : "+post);
    }

    static void push(char pos) 
    {
        st[++top]=pos;
    }

    static char pop() 
    {
        char ch= st[top];
        st[top--]=' ';
        return ch;
    }

    static char peek() 
    {
        if(top==-1)
            return '.';
        return st[top];
    }

}