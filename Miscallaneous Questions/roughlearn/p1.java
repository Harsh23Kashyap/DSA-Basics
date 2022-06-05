// Java code to perform add, 
// multiply and transpose on sparse matrices 
import java.util.*;
public class sparse_matrix { 
    static int len=0;
    static int counter=0;
    static Scanner scr =new Scanner (System.in);
    // insert elements into sparse matrix 
    private static void insert(int A[][],int r, int c,int n) 
    { 
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter value of "+(i)+"th non zero element");
            A[i][2] = scr.nextInt();
            System.out.println("Enter the row");
            A[i][0]= scr.nextInt();
            System.out.println("Enter the column");
            A[i][1]= scr.nextInt();
        }
        A[n][0]=A[n][1]=A[n][2]=-1;
    } 

    private static void transpose(int A[][],int r,int c, int n)
    {
        len=0;
        int trans[][] = new int[n+1][3]; 
        trans[n][0]=trans[n][1]=trans[n][2]=-1;
        for (int j=0;j<n;j++,len++){
            trans[len][0]= A[len][1];
            trans[len][1]= A[len][0];
            trans[len][2]= A[len][2];
        }
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (trans[j][0] > trans[j+1][0]) 
                { 
                    int temp = trans[j][0];
                    trans[j][0] = trans[j+1][0];
                    trans[j+1][0] = temp; 
                    temp = trans[j][1];
                    trans[j][1] = trans[j+1][1];
                    trans[j+1][1] = temp; 
                    temp = trans[j][2];
                    trans[j][2] = trans[j+1][2];
                    trans[j+1][2] = temp; 
                } 
        print(trans,c,r);
    }

    private static void add(int A[][],int B[][],int r,int c)
    {
        int l1=0,l2=0;
        counter=0;
        int res[][] = new int[A.length+B.length][3]; 
        for (int i=0;i<A.length;i++)
        {
            for (int j=0;j<A[0].length;j++)
            {
                if (i==A[l1][0] && j==A[l1][1] && i==B[l2][0] && j==B[l2][1] )
                {
                    res[counter][2]=A[l1++][2]+B[l2++][2];
                    res[counter][0]=i;
                    res[counter++][1]=j;
                }
                else if (i==A[l1][0] && j==A[l1][1])
                {
                    res[counter][2]=A[l1++][2];
                    res[counter][0]=i;
                    res[counter++][1]=j;
                }
                else if (i==B[l2][0] && j==B[l2][1] )
                {
                    res[counter][2]=B[l2++][2];
                    res[counter][0]=i;
                    res[counter++][1]=j;
                }
            }
        }
        res[counter][0]=res[counter][1]=res[counter][2] =-1;
        print(res,r,c);
    }
    // printing matrix 
    private static void print(int arr[][],int row, int col) 
    { 
        len=0;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                if (!(arr[len][0]==i && arr[len][1]==j))
                    System.out.print("0  ");
                else
                    System.out.print(arr[len++][2]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    } 

    public static void main(String args[]) 
    { 
        System.out.println("\tMATRIX A");
        System.out.println("Enter number of row for matrix A ");
        int r1 = scr.nextInt();
        System.out.println("Enter number of column for matrix A ");
        int c1= scr.nextInt();
        System.out.println("Enter number of non zero elements of matrix A");
        int n1= scr.nextInt();
        int A[][]= new int[n1+1][3];
        System.out.println();
        insert(A,r1,c1,n1);
        System.out.println("\nThe original matrix A is : ");
        print(A,r1, c1);
        System.out.println("\nThe transpose matrix A is : ");
        transpose(A,r1,c1,n1);
        System.out.println("\tMATRIX B");
        System.out.println("Enter number of row for matrix B ");
        int r2 = scr.nextInt();
        System.out.println("Enter number of column for matrix B ");
        int c2= scr.nextInt();
        System.out.println("Enter number of non zero elements of matrix B");
        int n2= scr.nextInt();
        int B[][]= new int[n2+1][3];
        System.out.println();
        insert(B,r2,c2,n2);
        System.out.println("\nThe original matrix B is : ");
        print(B,r2, c2);
        System.out.println("\nFinding the sum... ");
        if(r1==r2 && c1==c2)
        {
            System.out.println("\nThe sum matrix of A+B is : ");
            add(A,B,r1, c1);
        }
        else
            System.out.println("\nMatrix can't be added ");
        System.out.println("\nFinding the Product... ");
        if(c1==r2)
        {
            System.out.println("\nThe product matrix of AXB is : ");
            //multiply(A,B,r1, c1);
        }
        else
            System.out.println("\nMatrix can't be multiplied ");
    } 
} 
