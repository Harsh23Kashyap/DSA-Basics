// Java program to print a 
// matrix in spiral form 
import java.io.*; 
import java.util.*; 
class Part
{ 
    static int row=0,col=0,nz=0;
    static void printSpiral(int [][]mat, int s1, int s2) 
    { 
        int d=1,r=0,u=2,l=2;
        int f;
        int x,k;
        while(nz!=0)
        {
            x=s1;
            f=x+d;
            k=s2;
            //System.out.print(s1+" "+s2);
            while(x<=f)
            {
                if(nz==0)
                return;
                else if (nz!=0 && x>=0 && x<row && k>=0 && k<col  && mat[x][k]!=0)
                {
                    System.out.println(x+" "+k+" "+mat[x][k]+" "+1);
                    nz--;
                }
                x++;
            }
            x--;
            k++;
            f=r+k;
            while(k<=f)
            {
                if(nz==0)
                return;
                else if (nz!=0 && x>=0 && x<row && k>=0 && k<col  && mat[x][k]!=0)      
                {
                    System.out.println(x+" "+k+" "+mat[x][k]+" "+2);
                    nz--;
                }
                k++;
            }
            k--;
            f=x-u;
            x--;
            while(x>=f)
            {
                if(nz==0)
                return;
                else if (nz!=0 && x>=0 && x<row && k>=0 && k<col  && mat[x][k]!=0)
                {
                    System.out.println(x+" "+k+" "+mat[x][k]+" "+3);
                    nz--;
                }
                x--;
            }
            x++;
            f=k-l;
            k--;
            while(k>=f)
            {
                if(nz==0)
                return;
                else if (nz!=0 && x>=0 && x<row && k>=0 && k<col  && mat[x][k]!=0)
                {
                    System.out.println(x+" "+k+" "+mat[x][k]+" "+4);
                    nz--;
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
    static Scanner scr=new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception 
        { 
            try
            {
                row =scr.nextInt();
                col=scr.nextInt();
                nz=scr.nextInt();
            }
            catch (Exception e)
            {}
            int sp[][] = new int[nz][3];
            if(nz==0)
            return;
            for (int i=0;i<nz;i++)
            {
                try
                {
                    sp[i][0] =scr.nextInt();
                    sp[i][1]=scr.nextInt();
                    sp[i][2]=scr.nextInt();
                }
                catch (Exception e)
                {}
            }
            int len=0;
            int [][]mat= new int[row][col];
            for (int i=0;i<row;i++)
            {
                for (int j=0;j<col;j++)
                {
                    if(len<nz && i==sp[len][0] && j==sp[len][1])
                        mat[i][j]=sp[len++][2];
                    else
                    mat[i][j]=0;
                }
            } 
            int s1=0,s2=0;
                try
                {
                    s1 =scr.nextInt();
                }
                catch (Exception e)
                {} 
            // Function calling 
            printSpiral(mat, s1, s2); 
        } 
} 
