// Java program to construct a Doubly linked linked list from 2D Matrix 
import java.util.*; 

class DD
{ 
	// define dimension of matrix 
	static int dim; 
    static class Node 
    { 
		int data; 
		Node next; 
		Node prev; 
		Node up; 
		Node down; 
    }; 
    static Scanner scr= new Scanner(System.in);
    static int[][] matrixInput()
    {
        System.out.print("Enter number of rows and columns (NXN) : ");
        int n=scr.nextInt();
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter ( "+i+","+j+" ) value : ");
                arr[i][j]=scr.nextInt();
            }
        }
        return arr;
    }
	
	// function to create a new node 
	static Node createNode(int data) 
	{ 
		Node temp = new Node(); 
		temp.data = data; 
		temp.next = null; 
		temp.prev = null; 
		temp.up = null; 
		temp.down = null; 
		return temp; 
	} 
	
	// function to construct the 
	// doubly linked list 
	static Node constructDoublyListUtil(int mtrx[][],int i, int j,Node curr) 
	{ 
	
		if (i >= dim || j >= dim) { 
			return null; 
		} 
		Node temp = createNode(mtrx[i][j]); 
		temp.prev = curr; 
		temp.up = curr;  
		temp.next= constructDoublyListUtil(mtrx, i, j + 1, temp); 
		temp.down= constructDoublyListUtil(mtrx, i + 1, j, temp); 
        return temp; 
	} 
	
	// Function to construct the doubly linked list 
	static Node constructDoublyList(int mtrx[][]) 
	{ 
		return constructDoublyListUtil(mtrx, 0, 0, null); 
	} 
	
	// function for displaying 
	// doubly linked list data 
	static void display(Node head) 
	{ 
		Node column; 
		Node  row= head; 
        while (row != null) 
        { 
			column = row; 
            while (column!=null) 
            { 
				System.out.print(column.data+" "); 
				column = column.next; 
			} 
	
			System.out.print("\n"); 
			row = row.down; 
		} 
	} 
	
	// driver code 
	public static void main(String args[]) 
	{ 
	
		// initialise matrix 
		int mtrx[][] = matrixInput();
        dim = mtrx.length;
		Node list = constructDoublyList(mtrx); 
	
		display(list); 
	
	} 
} 

