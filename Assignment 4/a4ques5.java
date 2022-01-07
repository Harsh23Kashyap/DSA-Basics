//Write a program for the evaluation of a Postfix expression.
import java.util.*;
import java.io.*;
class a4ques5
{
    static Scanner scr = new Scanner(System.in);
    static int st[]= new int [100];
    static int top = -1;

    public static void main(final String[] args) 
    {
        System.out.println("Enter the postfix expression");
        String exp=scr.nextLine();
        exp+=" ";
        int num=0;
        System.out.println("Evaluating the postfix expression : "+exp);
        for(int i=0;i< exp.length();i++)
        {
            char ch=exp.charAt(i);
            if (Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
            }
            else if (Character.isWhitespace(ch))
            {
                if(num!=0)
                    push(num);
                num=0;
            }
            else
            {
                int a = pop();
                int b = pop();
                switch(ch)
                {
                    case '+': push(b+a);
                              break;
                    case '-': push(b-a);
                              break;
                    case '*': push(b*a);
                              break;
                    case '/': push(b/a);
                              break;
                    case '^': push((int)Math.pow(b,a));
                              break;
                }
            }
        }
        System.out.println("Postfix expression : "+pop());
    }

    static void push(int pos) 
    {
        st[++top]=pos;
    }

    static int pop() 
    {
        int ch= st[top];
        st[top--]=' ';
        return ch;
    }

    
}