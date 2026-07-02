class BT{
    class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    BT(int data) 
    {
        root = new Node(data);
    }

    void insertLeft(Node node,int data)
    {
        node.left = new Node(data);
    }

    void insertRight(Node node,int data)
    {
        node.right = new Node(data);
    }

    void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void postOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right); 
    }
}
public class BinaryTree {
    public static void main(String arg[])
    {
        BT bt = new BT(1);
        bt.insertLeft(bt.root, 2);
        bt.insertRight(bt.root, 3);
        bt.insertLeft(bt.root.right , 7);
        bt.insertRight(bt.root.right , 8);

        bt.preOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
        System.out.println();
        bt.preOrder(bt.root);
        
    }
}
