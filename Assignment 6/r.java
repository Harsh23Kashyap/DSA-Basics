// Java program to print a 
// matrix in spiral form 
import java.io.*; 

class Part12 
{ 

    static void printSpiral(int [][]mat, int s1, int s2) 
    { 
        int d=1,r=0,u=2,l=2;
        int n=9;
        int f;
        int x,k;
        int row=mat.length;
        int col= mat[0].length;
        while(n!=0)
        {
            x=s1;
            f=x+d;
            k=s2;
            //System.out.print(s1+" "+s2);
            while(x<=f)
            {
                if(n==0)
                return;
                else if (n!=0 && x>=0 && x<row && k>=0 && k<col  )
                {
                    System.out.print(mat[x][k]+" ");
                    n--;
                }
                x++;
            }
            x--;
            k++;
            f=r+k;
            while(k<=f)
            {
                if(n==0)
                return;
                else if (n!=0 && x>=0 && x<row && k>=0 && k<col  )                
                {
                    System.out.print(mat[x][k]+" ");
                    n--;
                }
                k++;
            }
            k--;
            f=x-u;
            x--;
            while(x>=f)
            {
                if(n==0)
                return;
                else if (n!=0 && x>=0 && x<row && k>=0 && k<col  )
                {
                    System.out.print(mat[x][k]+" ");
                    n--;
                }
                x--;
            }
            x++;
            f=k-l;
            k--;
            while(k>=f)
            {
                if(n==0)
                return;
                else if (n!=0 && x>=0 && x<row && k>=0 && k<col  )
                {
                    System.out.print(mat[x][k]+" ");
                    n--;
                }
                k--;
            }
            k++;
            s1=++x;
            s2=k;
            d=(r==0)?(d+1):(d+2);
            r+=2;
            u+=2;
            l+=2;
        }
    } 

    // Driver code 
        static public void main (String[] args) 
        { 
            int [][]mat = {{1, 2, 3 }, 
                         { 5, 6, 7}, 
                          {9, 10, 11}}; 
            int i = -1, j = -1; 
            System.out.println("\n");
            // Function calling 
            printSpiral(mat, i, j); 
        } 
} 
