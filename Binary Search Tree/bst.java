import java.util.*;
import java.util.Queue; 
import java.util.LinkedList;
class BinarySearchTree1
{
    static Node root=null;
    static class Node
    {
        int key;
        Node left, right;
        public Node(int d)
        {
            key=d;
            left=right=null;
        }
    }
    public static void insert(int key) 
    {
        root= insertRec(root, key);
    }

    public static Node insertRec(Node root, int key) 
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        if(key < root.key)
        {
            root.left = insertRec(root.left, key);
        }
        else if (key> root.key)
        {
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    static int c=0;
    public static void count(Node root) 
    {
        if(root!=null)
        {
            count(root.left);
            c++;
            count(root.right);
        }
    }

    public static void inorder(Node root) 
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
    static int kmax;
    static int j=0;
    public static void Kthmax(Node root) 
    {
        if(root!=null)
        {
            Kthmax(root.left);
            j++;
            if(j==kmax)
            {
                System.out.println((c-kmax+1)+"th maximum value is "+root.key);
                return;
            }
            Kthmax(root.right);
        }
    }
    static int k;
    static int i=0;
    public static void Kthmin(Node root) 
    {
        if(root!=null)
        {
            Kthmin(root.left);
            i++;
            if(i==k)
            {
                System.out.println(k+"th minimum value is "+root.key);
                return;
            }
            Kthmin(root.right);
        }
    }

    public static void preorder(Node root) 
    {
        if(root!=null)
        {
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void postorder(Node root) 
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.key);
        }
    }

    public static void levelOrder(Node root)
    {
        Queue<Node> queue = new LinkedList<Node> (); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
            Node tempNode = queue.poll(); 
            System.out.print(tempNode.key + " "); 
            if (tempNode.left != null) 
                queue.add(tempNode.left); 
            if (tempNode.right != null) 
                queue.add(tempNode.right); 
        } 
    }

    public static void InorderStack(Node root)
    {
        if(root==null)
            return;
        Stack<Node> st= new Stack<Node>();
        Node curr=root;
        while(curr!=null || !st.isEmpty())
        {
            while(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            System.out.println(curr.key+" ");
            curr=curr.right;
        }
    }

    public static void search (Node root, int key)
    {
        if (root == null)
            System.out.println("Not found");
        else if (root.key==key)
            System.out.println("Found ");
        else if (key < root.key)
            search(root.left, key);
        else if (key> root.key)
            search(root.right, key);
    }

    public static int minValue(Node root)
    {
        if(root.left==null)
            return root.key;
        return minValue(root.left);
    }

    public static int maxValue(Node root)
    {
        int max =root.key;
        Node copy=root;
        while(copy!=null)
        {
            max=copy.key;
            copy=copy.right;
        }
        return max;
    }

    public static void delete(Node root,int key)
    {
        root=deleteRecur(root,key);
    }

    public static Node deleteRecur(Node root, int key)
    {
        if(root==null)
            return root;
        else if (key< root.key)
            root.left=deleteRecur(root.left, key);
        else if(key > root.key)
            root.right=deleteRecur(root.right, key);
        else
        {
            if(root.left==null)
                return root.right;
            else if(root.right == null)
                return root.left;
            else
            {
                root.key= minValue(root.right);  //minimum value
                root.right = deleteRecur(root.right, root.key);
            }
        }
        return root;
    }

    public static void LCA(Node root, int l, int r)
    {
        if(l==root.key || r==root.key)
        {
            System.out.println("LCA is "+root.key);
            return;
        }
        else if (l<root.key && r<root.key)
            LCA(root.left, l, r);
        else if (l>root.key && r>root.key)
            LCA(root.right, l, r);
        else if(l<root.key && r>root.key)
        {

            System.out.println("LCA is "+root.key);
            return;
        }
    }
    
    static int max=Integer.MAX_VALUE;
    static int sl=1;
    public static void SecondLargest(Node root)
    {
        if(root!=null)
        {
            SecondLargest(root.right);
            sl++;
            if(sl==3)
            {
                System.out.println("Second largest is "+root.key);
                return;
            }

            SecondLargest(root.left);
        }
    }
    static int leaf=0;
    public static void countLeaves(Node root)
    {
        if(root!=null)
        {
            if(root.left==null && root.right==null)
                leaf++;
            countLeaves(root.left);
            countLeaves(root.right);
        }
    }

    static Scanner scr= new Scanner(System.in);
    public static void main(String[] args) 
    {
        BinarySearchTree1 tree = new BinarySearchTree1();

        /* Let us create following BST
        50
        /     \
        30      70
        /  \    /  \
        20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(55);
        tree.insert(65);
        // print inorder traversal of the BST
        /*tree.insert(20);
        tree.insert(8);
        tree.insert(22);
        tree.insert(4);
        tree.insert(12);
        tree.insert(10);
        tree.insert(14);*/
        System.out.println("Inorder");
        tree.inorder(root);
        System.out.println("Preorder");
        tree.preorder(root);
        System.out.println("Postorder");
        tree.postorder(root);
        System.out.println("Level Order");
        tree.postorder(root);
        System.out.print("Enter element to be searched : " );
        int check= 40;
        search(root, check);
        System.out.println("Minimum value is : " +minValue(root));
        System.out.println("Maximum value is : "+maxValue(root));
        //tree.delete(root,70);
        System.out.println("Inorder");
        tree.inorder(root);
        System.out.println("Enter elements ");
        int a=20;//scr.nextInt();
        int b=70;//scr.nextInt();
        LCA(root, Math.min(a,b), Math.max(a,b));
        System.out.println("Enter the k value: ");
        k =5;// scr.nextInt();
        Kthmin(root);
        count(root);
        System.out.println("Count is "+c);
        System.out.println("Enter the kth Max value: ");
        kmax =2;// scr.nextInt();
        kmax=c-kmax+1;
        Kthmax(root);
        SecondLargest(root);
        System.out.println("Inorder Traversal ");
        InorderStack(root);
        countLeaves(root);
        System.out.println("No. of leaves is "+leaf);
    }
}