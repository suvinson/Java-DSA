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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = rangeSum( root, low, high);
        return sum;
    }
    int rangeSum(TreeNode root, int low, int high)
    {
        int s = 0;
        if(root == null)
        {
            return s;
        }
        else if(root.val <=high && root.val >=low)
        {
            s += root.val + rangeSum(root.left,low,high) + rangeSum(root.right,low,high);
        }
        else
        {
            if(root.val < low)
            {
                s += rangeSum(root.right,low,high);
            }
            else if(root.val > high)
                s += rangeSum(root.left,low,high);
        }
        return s;
    }
}
public class Range_sum_BST {
    static Scanner scn = new Scanner(System.in);

    // Recursive function to build the tree

    static TreeNode buildTree() {

        System.out.print("Enter node value (-1 for null): ");

        int val = scn.nextInt();

        if (val == -1)

            return null;

        TreeNode root = new TreeNode(val);

        System.out.println("Enter left child of " + val);

        root.left = buildTree();

        System.out.println("Enter right child of " + val);

        root.right = buildTree();

        return root;

    }
    public static void main(String arg[])
    {
        System.out.println("Build the Binary Tree");

        TreeNode root = buildTree();

        System.out.print("Enter low: ");

        int low = scn.nextInt();

        System.out.print("Enter high: ");

        int high = scn.nextInt();

        Solution obj = new Solution();

        int ans = obj.rangeSumBST(root, low, high);

        System.out.println("Range Sum = " + ans);
    }
}
