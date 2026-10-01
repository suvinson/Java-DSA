class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
public class Tree_traversal {

    TreeNode root;

    Tree_traversal(int data)
    {
        root = new TreeNode(data);
    }

    void insertLeft(TreeNode node, int data)
    {
        node.left = new TreeNode(data);
    }

    void insertRight(TreeNode node , int data)
    {
        node.right = new TreeNode(data);
    }

    void preOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    
    public static void main(String arg[])
    {
        Tree_traversal tt = new Tree_traversal(1);
        tt.insertLeft(tt.root, 2);
        tt.insertRight(tt.root, 3);
        tt.preOrder(tt.root);
    }
}
