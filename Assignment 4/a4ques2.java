/*
Given a String, Reverse it using STACK. For example “data structure” should be
output as “erutcurtsatad.”
*/
import java.util.*;
import java.io.*;
class a4ques2
{
    static Scanner scr = new Scanner(System.in);
    static int top=-1; //counter
    public static void main(final String[] args) 
    {
        System.out.println( "Enter string to be reversed. ");
        String st = scr.nextLine();
        char ch[] = new char[st.length()];
        for(int i=0;i<st.length();i++)
        {
            push(ch, st.charAt(i));
        }
        System.out.println( "The reversed string is : ");

        while(!isEmpty())
        {
            pop(ch);
        }
        System.out.println();
    }
    static void push(char c[], char element) 
    {
        if(element!=' ')
            c[++top]=element;
    }

    static void pop(char ch[]) 
    {
        System.out.print(ch[top]);
        ch[top--]=' ';
    }
    static boolean isEmpty() 
    {
        return top==-1;
    }
    
}