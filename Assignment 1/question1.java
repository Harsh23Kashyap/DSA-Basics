/*ASSIGNMENT 1 QUESTION 1
#1) Develop a Menu driven program to demonstrate the following operations o Arrays
#——MENU——- 
# 1.CREATE 
# 2.DISPLAY
#3.INSERT 
# 4.DELETE
#5.SEARCH
#  6.EXIT
 */
import java.util.*;
import java.io.*;
class Main
{
    static Scanner scr = new Scanner(System.in);
    static int a[];
    static int m = 10;

    public static void main(final String[] args) {
        int ch=0;
        do {
            ch = menu();
            switch (ch) {
                case 1:
                input();
                break;
                case 2:
                show();
                break;
                case 3:
                insert();
                break;
                case 4:
                delete();  
                break;
                case 5:
                search();
                break;
                case 6:
                System.out.println("We are done ");
                break;
                default:
                System.out.println("Not an option \n");

            }
        } while (ch != 6);
    }

    static int menu() {
        System.out.println( "——MENU——- \n1.CREATE \n2.DISPLAY\n3.INSERT \n4.DELETE\n5.SEARCH \n6.EXIT\nEnter your choice");
        int ch = scr.nextInt();
        return ch;
    }

    static void input() {
        System.out.println("Enter number of elements ");
        int n = scr.nextInt();
        a = new int[n + 10];
        for (int i = 0; i < a.length-m; i++) {
            System.out.println("Enter value of " + i + "th element ");
            a[i] = scr.nextInt();
        }
    }

    static void show() {
        System.out.println("Elements are ");
        int j = 0;
        while (j < a.length - m) {
            System.out.print(a[j] + " ");
            j = j + 1;
        }
        System.out.println("\n");
    }

    static void insert() {
        System.out.println("Enter value ");
        int val = scr.nextInt();
        System.out.println("Enter position at which we have to insert ");
         int pos = scr.nextInt();
        if (pos >= a.length - m)
            System.out.println("Out of Bounds index ");
        else {
            m--;
            int j = a.length - m;
            while (j > pos) {
                a[j] = a[j - 1];
                j = j - 1;
            }
                a[pos] = val;
            
        }

        System.out.println();
    
    }

    static void delete() {
        System.out.println("Enter position at which we have to delete ");
        final int pos = scr.nextInt();
        int j = pos;
        if (pos >= a.length - m)
            System.out.println("Out of Bounds index ");
        else {
            m++;
            while (j < a.length - m) {
                a[j] = a[j + 1];
                j = j + 1;
            }
        }
    }

    static void search()
    {
        System.out.println("Enter element to be searched ");
        final int pos = scr.nextInt();
        int j=0;
        int result=-1;
        while(j<(a.length-m))
        {
            if(pos==a[j])
            {
                result =j;
                break;
            }
            j=j+1;
        }
        if (result != -1)
        {
            System.out.println("Element is present at index "+result);
        }
        else
        {
            System.out.println("Element is not present in array") ;
        }
        System.out.println();
    }
}