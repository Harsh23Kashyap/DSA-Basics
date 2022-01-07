//Java program to generate binary numbers from 1 to n 

import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner;;
class a5BinaryExtra 
{ 
    static Scanner scr=new Scanner(System.in);
	static void generatePrintBinary(int n) 
	{  
		Queue<String> q = new LinkedList<String>(); 
		
		q.add("1"); 
	
		for(int i=n;i>0;i--) 
		{ 
			String s1 = q.peek(); 
            q.remove(); 
			System.out.println(s1); 
			String s2 = s1;  
			q.add(s1 + "0"); 
			q.add(s2 + "1"); 
		} 
	} 
	
	public static void main(String[] args) 
	{ 
        System.out.print("Enter range : ");
		int n=scr.nextInt(); 
		generatePrintBinary(n); 
	} 
} 
