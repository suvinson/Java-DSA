import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x)
      { 
        val = x; 
        next = null;
       }
  }
class Solution {
    public void deleteNode(ListNode node) {
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
class Delete_node
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the node number : ");
        int num = scn.nextInt();
        System.out.println("Enter the node values : ");
        int val = scn.nextInt();
        ListNode head = new ListNode(val);
        ListNode temp = head;
        for(int i=1;i<num;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next; 
        }
        System.out.println("Full linkedlist : ");
        ListNode curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
        System.out.println("Enter the node value to delete :");
        int target = scn.nextInt();
        ListNode nod = head;
        while (nod != null && nod.val != target) {

            nod = nod.next;
        }
        if (nod == null || nod.next == null) {

            System.out.println("Cannot delete this node (maybe last node or not found)");
            return;
        }
        Solution sol = new Solution();
        sol.deleteNode(nod);
        System.out.println("After deleted linkedlist : ");
        curr = head;
        while(curr!=null)
        {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}