import java.util.*;
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
public class Binary_Tree {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        printTree(root);
    }
    public static void printTree(Node node) 
    {
        if (node == null) 
            return;

        System.out.print(node.data + " ");
        // Visit left child
        printTree(node.left);

        // Print current node data
        

        // Visit right child
        printTree(node.right);
    }
}
