
/*
Develop a menu driven program demonstrating the following operations on Circular Queues: enqueue(), dequeue(), isEmpty(), isFull(), display(), and peek(). 
Note: Use arrays to implement circular queue
 */
import java.util.*;
import java.io.*;
class a5ques2
{
    static Scanner scr = new Scanner(System.in);
    static int SIZE = 5;
    static int arr[] = new int[SIZE];
    // Lets keep size as 100
    static int front =-1;
    static int rear = -1;

    public static void main(final String[] args) 
    {
        int ch = 0;
        do 
        {
            ch = menu();
            switch (ch) {
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    if (isEmpty())
                        System.out.println("Stack is empty .Underflow\n");
                    else
                        System.out.println("Stack is not empty \n");
                    break;
                case 5:
                    if (isFull())
                        System.out.println("Stack is full. Overflow\n");
                    else
                        System.out.println("Stack is not full \n");
                    break;
                case 6:
                    display();
                    break;
                case 7:
                    System.out.println("We are done ");
                    break;
                default:
                    System.out.println("Not an option \n");

            }
        } while (ch != 7);
    }

    static int menu() {
        System.out.println(
                "\n——MENU——- \n1.ENQUEUE\n2.DEQUEUE\n3.PEEK\n4.EMPTY\n5.FULL\n6.DISPLAY\n7.EXIT\nEnter your choice");
        int ch = scr.nextInt();
        return ch;
    }

    static void enqueue() 
    {
        if (isFull()) 
        {
            System.out.println("Overflow  ");
            return;
        }
        System.out.print("Enter element to be pushed : ");
        int pos = scr.nextInt();
        if (front == -1 && rear == -1)
            front = rear = 0;
        else {
            rear = (rear + 1) % SIZE;
        }
        arr[rear] = pos;
    }

    static void dequeue() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Popping out element... : "+arr[front]);
        if(front==rear)
            front=rear=-1;
        else
            front=(front+1)%SIZE;
    }

    static void peek() 
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        System.out.println("Viewing the top element ... : "+arr[front]);
       
    }

    static boolean isFull() 
    {
        if((front==0 && rear==SIZE-1) || (rear==front-1))
            return true;
        return false;
    }
    static boolean isEmpty() 
    {
        if(front==-1 )
            return true;
        return false;

    }

    static void display()
    {
        if (isEmpty())
        {
            System.out.println("Underflow  ");
            return;
        }
        
        System.out.println("Viewing the Queue ");
        int i=front;
        do
        {
            System.out.println(" | "+arr[i]+" |");
            System.out.println(" -----");
            if(i==rear)
                break;
            if(i==SIZE-1)
                i=0;
            i++;
        }while(true);
    }

}