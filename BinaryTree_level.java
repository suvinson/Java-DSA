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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> ls = new LinkedList<List<Integer>>();
        if(root == null)
        {
            return ls;
        }
        que.offer(root);
        while(!que.isEmpty())
        {
            int level = que.size();
            List<Integer> l = new LinkedList<>();
            for(int i=0;i<level;i++)
            {
                if(que.peek().left != null)
                {
                    que.offer(que.peek().left);
                }
                if(que.peek().right != null)
                {
                    que.offer(que.peek().right);
                }
                l.add(que.poll().val);
            }
            ls.add(l);
        }
        return ls;
    }
}
public class BinaryTree_level {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);

        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);

        root.left.right = new TreeNode(5);

        // Create Solution object

        Solution obj = new Solution();

        // Call levelOrder

        List<List<Integer>> result = obj.levelOrder(root);

        // Print result

        System.out.println(result);
    }
}
