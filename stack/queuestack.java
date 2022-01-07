/*Queue using Stacks
Last Updated: 11-09-2020
The problem is opposite of this post. We are given a stack data structure with push and pop operations, 
the task is to implement a queue using instances of stack data structure and operations on them.
*/

//Stack and Queue with insert and delete operations

//A queue can be implemented using two stacks. Let queue to be implemented be q and stacks used to implement q be stack1 and stack2. q can be implemented in two ways:
import java.util.Scanner;
import java.util.Stack;
class queuestack 
{
    static Scanner scr= new Scanner(System.in);
    static Stack<Integer> s1= new Stack<Integer>();
    static Stack<Integer> s2= new Stack<Integer>();
    public static void main(String[] args) 
    {
        System.out.println("Enter number of elements ");
        int n= scr.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter value : ");
            int v=scr.nextInt();
            enqueue(v);
        }
        dequeue();
    }
    static void enqueue(int el)
    {
        if (s1.isEmpty())
        {
            s1.push(el);
        }
        else
        {
            while(!s1.isEmpty())
            {
                s2.push((Integer)s1.pop());
            }
            s1.push(el);
            while(!s2.isEmpty())
            {
                s1.push((Integer)s2.pop());
            }
        }
    }
    static void dequeue()
    {
        System.out.println("Elements");
        while(!s1.isEmpty())
        {
              System.out.print(s1.pop()+"\n");
        }
    }
}
