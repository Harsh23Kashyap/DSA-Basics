/* #Space required to store any two-dimensional array is
#. Assuming array is used to store elements of the following
#matrices, implement an efficient way that reduces the space requirement.
#(b) Tri diagonal Matrix.
 */
import java.util.Scanner;
class ass1a_q1b
{
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Enter rows and columns for matrix (nXn) : ") ;
        int diag = scr.nextInt();
        int ud[]= new int[diag-1];;
        int d[]=new int[diag];
        int ld[]= new int[diag-1];
        int i,j;
        System.out.println("\nUPPER DIAGONAL");
        for (i = 0; i < diag-1; i++) {
            System.out.println("Enter value for diagonal ["+i+","+(i+1)+"] th element : ");
            ud[i] = scr.nextInt();
        }
        System.out.println("\nDIAGONAL");
        for (i = 0; i < diag; i++) {
            System.out.println("Enter value for diagonal ["+i+","+i+"] th element : ");
            d[i] = scr.nextInt();
        }
        System.out.println("\nLOWER DIAGONAL");
        for (i = 0; i < diag-1; i++) {
            System.out.println("Enter value for diagonal ["+(i+1)+","+i+"] th element : ");
            ld[i] = scr.nextInt();
        }
        int u=0;
        int l=0;
        System.out.println("\nTRI DIAGONAL MATRIX");
        for (i = 0; i < diag; i++) {
            for (j = 0; j< diag; j++) {
                if (i-j==-1)
                    System.out.print(ud[u++]+"  ");
                else if(i==j)
                    System.out.print(d[i]+"  ");
                else if  (i-j==1)
                    System.out.print(ld[l++]+"  ");
                else
                   System.out.print("0"+"  ");
            }
            System.out.println();
        }
    }
}