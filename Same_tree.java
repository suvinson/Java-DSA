import java.util.*;
class TreeNode 
{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) 
      {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return helper(p,q);
        
    }
    private boolean helper(TreeNode p, TreeNode q)
    {
        if (p == null && q == null)
        {
            return true;
        }
        if((p == null && q != null) || (p != null && q == null) || (p.val != q.val))
            return false;
        if (p.val == q.val)
        {
            helper(p.left,q.left);
            helper(p.right,q.right);
        }
        return helper(p.left,q.left) && helper(p.right,q.right);
    }
}
public class Same_tree {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of elements in first tree:");
        int n1 = scn.nextInt();

        System.out.println("Enter first tree in level order (-1 for null):");
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++)
        {
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter number of elements in second tree:");
        int n2 = scn.nextInt();

        System.out.println("Enter second tree in level order (-1 for null):");
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++)
        {
            arr2[i] = scn.nextInt();
        }

        TreeNode p = buildTree(arr1);
        TreeNode q = buildTree(arr2);

        Solution sol = new Solution();

        boolean ans = sol.isSameTree(p, q);

        System.out.println("Are the trees same? " + ans);

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

            if(i < arr.length && arr[i] != -1)
            {
                temp.left = new TreeNode(arr[i]);
                queue.add(temp.left);
            }

            i++;

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
