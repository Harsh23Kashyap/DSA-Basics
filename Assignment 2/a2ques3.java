/*
Write a program to find the middle of a linked list\
 */
// child class which can use basic operation of parent class
//TO USE THIS PLEASE CALL THE CLASS LinkedList TOO
import java.util.*;
class a2ques3 extends LinkedList
{
    static Scanner scr= new Scanner(System.in);
    static void input(LinkedList list)
    {
        System.out.println("Enter number of elements ");
        int n = scr.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter value of " + i + "th element ");
            int inp= scr.nextInt();
            insertAtLast(list,inp);
        }
    }
    
    public static String getMiddle(LinkedList l) 
    { 
        if (l.head == null) 
            return "NOT FOUND";

        Node slow = l.head, fast = l.head; 

        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return Integer.toString(slow.data); 
    } 
    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        print(l1);
        System.out.println("Middle Element is : "+getMiddle(l1));
    }

}