/*
Develop a menu driven program for the following operations of on a Singly Linked
List.
(a) Insertion at the beginning.
(b) Insertion at the end.
(c) Insertion in between (before or after a node having a specific value, say 'Insert a
new Node 35 before/after the Node 30').
(d) Deletion from the beginning.
(e) Deletion from the end.
(f) Deletion of a specific node, say ('Delete Node 60').
(g) Search for a node and display its position from head.
(h) Display all the node values.
 */
import java.util.*;
// child class which can use basic operation of parent class
//TO USE THIS PLEASE CALL THE CLASS LinkedList TOO
class a2ques1 extends LinkedList
{
    static Scanner scr= new Scanner(System.in);
    static int menu()
    {
        System.out.println( );
        System.out.println( "--------——LINKED LIST----------");
        System.out.println( "\t——MENU——- \n1.Insertion at the beginning.\n2.Insertion at the end.\n3.Insertion in between ");
        System.out.println( "4.Deletion from the beginning.\n5.Deletion from the end. \n6.Deletion of a specific node");
        System.out.println( "7.Search for a node and display its position from head.\n8.Display all node values.\n9.Exit \nEnter your choice ");
        int ch = scr.nextInt();
        return ch;
    }
    //main function
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        int val;
        int ch=0;
        do {
            ch = menu();
            System.out.println();
            switch (ch) 
            {
                case 1:
                System.out.print("Enter value to be inserted at the beginning : ");
                val =scr.nextInt();
                insertAtBeginning(list, val);
                break;
                case 2:
                System.out.print("Enter value to be inserted at the end : ");
                val =scr.nextInt();
                insertAtLast(list, val);
                break;
                case 3:
                System.out.print("Enter value to be inserted : ");
                val =scr.nextInt();
                System.out.print(val+" to be inserted around which node : ");
                int no =scr.nextInt();
                System.out.println(val+" to be inserted before/ after "+no+".\nType 0 for inserting after "+no+". Any other number for inserting before ");
                int cross =scr.nextInt();
                insertAfterBefore(list, no, val, cross);
                break;
                case 4:
                System.out.print("Deleting item form beginning :" +deleteAtBeginning(list));
                break;
                case 5:
                System.out.print("Deleting item form end :" +deleteAtEnd(list));
                break;
                case 6:
                System.out.print("Enter value to be deleted :");
                val =scr.nextInt();
                deleteAtKey(list, val);
                break;
                case 7:
                System.out.print("Enter value to be searched :");
                val =scr.nextInt();
                search(list, val);
                break;
                case 8:
                print(list);
                break;
                case 9:
                System.out.println("We are done ");
                break;
                default:
                System.out.println("Not an option \n");

            }
        } while (ch != 9);
    }
}