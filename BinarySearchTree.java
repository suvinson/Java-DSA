class BST
{
    class Node{
        int data ;
        Node left ;
        Node right ;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root ;

    BST(int data)
    {
        root = new Node(data);
    }
    void insert(Node root , int data)
    {
        if(data < root.data) //inserting in left 
        {
            if(root.left == null)
            {
                root.left = new Node(data);
            }
            else
            {
                insert(root.left,data);
            }
        }
        else
        {
            if(root.right == null)
            {
                root.right = new Node(data);
            }
            else
                insert(root.right,data);
        }
    }
    void inOrder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    Node search(Node root , int data)
    {
        if(root == null )
        {
            System.out.println("\nNot found");
            return null;
        }
        else if(root.data == data)
        {
            System.out.print("\nFound : ");
            return root;
        }
        if(root.data > data)
        {
            return search(root.left,data);
        }
        else
        {
            return search(root.right,data);
        }
    }

}
public class BinarySearchTree {
    public static void main(String arg[])
    {
        BST bst = new BST(5);
        bst.insert(bst.root,2);
        bst.insert(bst.root,1);
        bst.insert(bst.root,3);
        bst.insert(bst.root,7);
        bst.insert(bst.root,9);
        bst.insert(bst.root,8);
        bst.insert(bst.root,6);

        bst.inOrder(bst.root);

        System.out.print(bst.search(bst.root,3).data);
        System.out.print(bst.search(bst.root,0));
    }
}
