/*
Write a program interleave the first half of the queue with the second half.
*/
import java.util.*;
import java.io.*;
class a5ques3
{
    static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Queue<Integer> q=new LinkedList<Integer>();
        while(true)
        {
            System.out.println("Insert element. Press 0 to terminate");
            int num=scr.nextInt();
            if(num==0)
            {
                System.out.println("Done with taking input. ");
                break;
            }
            else
            {
                q.add(num);
            }

        }
        int size=q.size();
        interLeave(q);
        System.out.println("Displaying the new queue");
        for(int i=0;i<size;i++)
            System.out.print(q.poll()+"  ");
        System.out.println();

    }
    static void interLeave(Queue<Integer> q)
    {
        int size =q.size();
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<size/2;i++)
        {
            s.push(q.poll());
        }
        while(!s.empty())
        {
            q.add(s.pop());
        }
        for(int i=0;i<size/2;i++)
        {
            q.add(q.poll());
        }
        for(int i=0;i<size/2;i++)
        {
            s.push(q.poll());
        }
        while(!s.empty())
        {
            q.add(s.pop());
            q.add(q.poll());
        }
    }
}