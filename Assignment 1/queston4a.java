/*
#Implement the logic to
#Reverse the elements of an array*/
import java.util.Scanner;
class Main1
{
    static Scanner scr = new Scanner(System.in);
    static int a[];
    public static void main(final String[] args) {
        System.out.println("Enter number of elements ");
        final int n = scr.nextInt();
        a = new int[n];
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println("Enter value of " + i + "th element ");
            a[i] = scr.nextInt();
        }
        final int m = (int) (n / 2);
        for (i = 0; i < m; i++) {
            final int d = a[i];
            a[i]= a[n-1-i];
            a[n-i-1] = d;
        }
        for (i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}