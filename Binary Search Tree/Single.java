import java.util.*;
class Single extends BinarySearchTree1
{
    
    public static void single(Node root)
    {
        Node temp=root;
        while(temp!=null)
        {
            if(temp.left!=null && temp.right!=null)
            {
                System.out.println("Not single tree ");
                return;
            }
            else if(temp.left==null)
                temp=temp.right;
            else    
                temp=temp.left;

        }
        System.out.println("Single tree ");

    }
    static Scanner scr= new Scanner(System.in);
    public static void main(String[] args) 
    {
        BinarySearchTree1 tree = new BinarySearchTree1();
        
        tree.insert(20);
        tree.insert(10);
        tree.insert(11);
        tree.insert(13);
        tree.insert(12);
        tree.insert(15);
        System.out.println("Inorder");
        tree.inorder(root);
        single(root);
        
        
    }
}