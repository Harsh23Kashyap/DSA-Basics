/* #Space required to store any two-dimensional array is
 #. Assuming array is used to store elements of the following
#matrices, implement an efficient way that reduces the space requirement.
#(c) Upper triangular Matrix.
*/
import java.util.Scanner;
class ass1a_q1c
{
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Enter rows and columns for matrix (nXn) : ") ;
        int n = scr.nextInt();
        int p = (n*(n-1)/2);
        int d[]=new int[p];
        int i,j;
        System.out.println("\nUPPER TRIANGULAR MATRIX");
        for (i = 0; i < p; i++) {
            System.out.println("Enter element : ");
            d[i] = scr.nextInt();
        }
        int u =0;
        System.out.println("\nMATRIX");
        for (i = 0; i < n; i++) {
            for (j = 0; j< n; j++) {
                if (j>i)
                    System.out.print(d[u++]+"  ");
                else
                   System.out.print("0"+"  ");
            }
            System.out.println();
        }
    }
}