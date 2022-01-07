import java.util.*;
import java.io.*;
class getmiddle extends Sort
{
    static Scanner scr=new Scanner (System.in);
    
    public static void main(final String[] args) 
    {
        LinkedList l1= new  LinkedList();
        input(l1);
        print(l1);
        System.out.println("Middle Element is : "+(Integer.toString(l1.head)));
    }

}