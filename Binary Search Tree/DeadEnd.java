import java.util.*;
class DeadEnd extends BinarySearchTree1
{
    static int n=0;
    static int arr[]=new int[100];
    public static void count(Node root) 
    {
        if(root!=null)
        {
            count(root.left);
            arr[n++]=root.key;
            count(root.right);
        }
    }
    
    static Scanner scr= new Scanner(System.in);
    public static void main(String[] args) 
    {
        BinarySearchTree1 tree = new BinarySearchTree1();
        /*
        tree.insert(8);
        tree.insert(5);
        tree.insert(9);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(90);
        System.out.println("Inorder");
        count(root);
        System.out.println("count "+n);
        boolean min,max,res=false;
        for (int i=0;i<n;i++)
        {
            min= false;
            max=false;
            for (int j=0;j<n;j++)
            {
                if(arr[i]+1==arr[j])
                {
                    max=true;
                    break;
                }
            }
            for (int j=0;j<n;j++)
            {
                if(arr[i]-1==arr[j])
                {
                    min=true;
                    break;
                }
            }
            if(min==true && max)
            {
                System.out.println("Deadend ");
                res=true;
                break;

            }
        }
        if(!res)
        {
            System.out.println("Not a Deadend ");
        }
    }
}