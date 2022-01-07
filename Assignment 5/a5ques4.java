import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.io.*;
public class a5ques4 
{
    static Scanner scr= new Scanner(System.in);
    static int SIZE=26;
    static Queue<Character> q = new LinkedList<Character>();
    static String str="";
    public static void main(String[] args) 
    {
        System.out.print("Enter String on which the operation is to be checked : ");
        str=scr.nextLine();
        check();
    }
    static void check()
    {
        int ch[]=new int[SIZE];
        for(int i=0;i<SIZE;i++)
        {
            ch[i]=0;
        }
        for(int i=0;i<str.length();i++)
        {
            char temp= str.charAt(i);
            if(temp==' ')
                continue;
            q.add(temp);
            //System.out.println(temp-65+" "+temp+" "+ch[temp-65]);
            ch[temp-'a']++;
            while(!q.isEmpty())
            {
                if(ch[q.peek()-'a']==1)
                {
                    System.out.print(q.peek()+" ");
                    break;
                }
                else 
                {
                    q.poll();
                }
            }
            if(q.isEmpty())
                System.out.print("-1 ");
        }
        System.out.println();
    }
}
