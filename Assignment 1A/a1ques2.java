/*Write a program to implement the following operations on a Sparse Matrix, assuming
the matrix is represented using a triplet. 
(a) Transpose of a matrix.
(b) Addition of two matrices.
(c) Multiplication of two matrices.
*/
import java.util.*;
class sparse_matrix
 { 
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

    private static int[][] transpose(int A[][] ,int n)
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
        return trans;
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

    private static void multiply(int A[][], int B[][],int r1, int c1, int r2,int c2,int n1, int n2)
    { 
        B = transpose(B,n2); 
        int apos, bpos; 
        int pro[][] = new int[r1*r2][3]; 
        int x=0;
        for (apos = 0; apos < A.length;) 
        { 
            int r = A[apos][0]; 
            for (bpos = 0; bpos < B.length;) { 
                int c = B[bpos][0]; 
                int tempa = apos; 
                int tempb = bpos; 
                int sum = 0; 
                while (tempa < A.length && A[tempa][0] == r && tempb < B.length && B[tempb][0] == c) 
                { 
                    if (A[tempa][1] < B[tempb][1])
                        tempa++; 

                    else if (A[tempa][1] > B[tempb][1]) 
                        tempb++; 
                    else
                        sum += A[tempa++][2] * B[tempb++][2]; 
                } 
                if (sum != 0) 
                {
                   pro[x][0]=r;
                   pro[x][1]=c; 
                   pro[x][2]=sum; 
                   x++;
                }

                while (bpos < B.length && B[bpos][0] == c) 
                    bpos++; 
            } 

            while (apos < A.length && A[apos][0] == r) 
            apos++; 
        } 
        pro[x][0]=pro[x][1]=pro[x][2]=-1;
        print(pro,r1,c2); 
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
        int trans[][]=transpose(A,n1); 
        print(trans,c1,r1);
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
            multiply(A,B,r1, c1,r2,c2,n1,n2);
        }
        else
            System.out.println("\nMatrix can't be multiplied ");
    } 
} 
