/*Design and Implement Special Stack Data Structure | Added Space Optimized Version
Last Updated: 02-06-2020
Question: Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and 
an additional operation getMin() which should return minimum element from the SpecialStack. All these operations of SpecialStack must be O(1). 
To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, .. etc.
*/
import java.util.Scanner;
import java.util.Stack;
class specialstack 
{
    static Scanner scr= new Scanner(System.in);
    static Stack<Integer> s1= new Stack<Integer>();
    static Stack<Integer> aux= new Stack<Integer>();
    public static void main(String[] args) 
    {
        System.out.println("Enter number of elements ");
        int n= scr.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter value : ");
            int v=scr.nextInt();
            insert(v);
        }
        delete();
        getMin();
    }
    static void insert(int el)
    {
        if (s1.isEmpty())
        {
            s1.push(el);
            aux.push(el);
        }
        else
        {
            s1.push(el);
            if(s1.peek() < aux.peek())
            {
                aux.push(s1.peek());
            }
        }
    }
    static void delete()
    {
        System.out.println("Elements");
        while(!s1.isEmpty())
        {
              System.out.print(s1.pop()+"\n");
        }
    }
    static void getMin()
    {
        System.out.println("Minimum element : "+aux.peek());

    }
}
