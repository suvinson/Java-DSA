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
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        int rl = maxDepth(root.left);
        int rr = maxDepth(root.right);
        return 1 + Math.max(rl,rr);
    }
}
public class Max_depth_tree {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of elements in tree:");
        int n = scn.nextInt();

        if(n <= 0)
        {
            System.out.println("The tree is empty.");
            return;
        }

        System.out.println("Enter tree elements in level order (-1 for null):");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }

        TreeNode root = buildTree(arr);

        Solution sol = new Solution();

        int ans = sol.maxDepth(root);

        System.out.println("Maximum depth of tree: " + ans);

        scn.close();
    }

    private static TreeNode buildTree(int[] arr)
    {
        if(arr.length == 0 || arr[0] == -1)
        {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while(!queue.isEmpty() && i < arr.length)
        {
            TreeNode temp = queue.poll();

            // Left child
            if(i < arr.length && arr[i] != -1)
            {
                temp.left = new TreeNode(arr[i]);
                queue.add(temp.left);
            }

            i++;

            // Right child
            if(i < arr.length && arr[i] != -1)
            {
                temp.right = new TreeNode(arr[i]);
                queue.add(temp.right);
            }

            i++;
        }

        return root;
    }
}
