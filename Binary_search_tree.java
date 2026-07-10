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
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root,val);
    }
    TreeNode search(TreeNode root, int val)
    {
        if(root == null)
        {
            return null;
        }
        else if(root.val == val)
        {
            return root;
        }
        else if(root.val>val)
        {
            return search(root.left,val);
        }
        else
        {
            return search(root.right , val);
        }
    }
}
public class Binary_search_tree {

    public static void main(String args[]) {

        // Creating the BST

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);

        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);

        root.left.right = new TreeNode(3);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to search: ");

        int val = sc.nextInt();

        Solution obj = new Solution();

        TreeNode ans = obj.searchBST(root, val);

        if (ans != null) {

            System.out.println("Node found: " + ans.val);

        } else {

            System.out.println("Node not found");

        }

        sc.close();

    }

}
