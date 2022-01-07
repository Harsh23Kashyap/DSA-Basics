import java.util.*;
import java.io.*;
class propCircular extends CircularLinkedList
{
    static Scanner scr = new Scanner (System.in);

    public static void main(final String[] args) 
    {
        CircularLinkedList list= new  CircularLinkedList();
        int ch=0;
        int inp=0;
        do 
        {
            ch = menu();
            switch (ch)
            {
                case 1:
                input(list);
                break;
                case 2:
                System.out.println("Enter value of element ");
                inp= scr.nextInt();
                insertAtLast(list,inp);
                break;
                case 3:
                print(list);
                break;
                case 4:
                System.out.println("Enter value to be deleted ");
                inp= scr.nextInt();
                deleteAtKey(list,inp);
                break;
                case 5:
                System.out.println("Enter index to be deleted ");
                inp= scr.nextInt();
                deleteByIndex(list,inp);
                break;
                case 6:
                System.out.println("Enter val to be searched. ");
                inp= scr.nextInt();
                search(list,inp);
                break;
                case 7:
                System.out.println("Enter val to be inserted. ");
                int val= scr.nextInt();
                System.out.println("Enter index at which "+val+" is to be inserted");
                inp= scr.nextInt();
                insertAtIndex(list,val,inp);
                break;
                case 8:
                System.out.println("We are done ");
                break;
                default:
                System.out.println("Not an option \n");

            }
        } while (ch != 8);
    }

    static int menu()
    {
        System.out.println( "\n——MENU——- \n1.INPUT \n2.INSERT AT LAST \n3.PRINT\n4.DELETE KEY VALUE\n5.DELETE KEY AT INDEX \n6.SEARCH \n7.INSERT AT INDEX \n8.EXIT\n\nEnter your choice");
        int ch = scr.nextInt();
        return ch;
    }
}

