/* #Space required to store any two-dimensional array is
#. Assuming array is used to store elements of the following
#matrices, implement an efficient way that reduces the space requirement.
#(a) Diagonal Matrix
 */
import java.util.Scanner;
class ass1a_q1
{
    static Scanner scr = new Scanner(System.in);
    public static void main(final String[] args) {
        System.out.println("Enter rows and columns for matrix (nXn) : ") ;
        int diag = scr.nextInt();
        int d[] = new int[diag];
        int i,j;
        for (i = 0; i < diag; i++) {
            System.out.println("Enter value for diagonal ["+i+","+i+"] th element : ");
            d[i] = scr.nextInt();
        }
        System.out.println("\nDiagonal Matrix");
        for (i=0;i<diag;i++)
        {
            for (j=0;j<diag;j++)
            {
                if (i==j)
                    System.out.print(d[i]+"   ");
                else
                    System.out.print("0   ");
            }
            System.out.println();
        }
        System.out.println();
    }
}