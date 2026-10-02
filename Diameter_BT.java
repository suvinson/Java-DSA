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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        height(root,dia);
        return dia[0];
    }
    private int height(TreeNode root, int[] dia)
    {
        if(root == null) 
            return 0;
        int rl = height(root.left,dia);
        int rr = height(root.right,dia);
        dia[0] = Math.max(dia[0],rl + rr);
        return 1 + Math.max(rl,rr);
    }
}
public class Diameter_BT {
    public static void main(String arg[])
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();
        int result = sol.diameterOfBinaryTree(root);

        System.out.println("Diameter = " + result);
    }
}
