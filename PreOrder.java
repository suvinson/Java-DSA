import java.util.*;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        return preOrder(root);
    }
    List<Integer> preOrder(TreeNode root)
    {
        List<Integer> l = new ArrayList<>();
        if(root == null)
        {
            return l;
        }
        List<Integer> left = preOrder(root.left);
        List<Integer> right = preOrder(root.right);
        l.add(root.val);
        l.addAll(left);
        l.addAll(right);
        return l;
    }
}
public class PreOrder {

    static Scanner scn = new Scanner(System.in);

    static TreeNode buildTree() {
        System.out.print("Enter node value (-1 for null): ");
        int val = scn.nextInt();

        if (val == -1) {
            return null;
        }

        TreeNode root = new TreeNode(val);

        System.out.println("Enter left child of " + val);
        root.left = buildTree();

        System.out.println("Enter right child of " + val);
        root.right = buildTree();

        return root;
    }

    public static void main(String[] args) {

        System.out.println("Build the Binary Tree");

        TreeNode root = buildTree();

        Solution obj = new Solution();

        List<Integer> ans = obj.preorderTraversal(root);

        System.out.println("Preorder Traversal: " + ans);
    }
}
