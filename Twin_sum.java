import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode current = slow;
        ListNode next = null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode temp = prev;
        int result = 0;
        while(temp!=null)
        {
            result = Math.max(result , head.val + temp.val);
            head = head.next;
            temp = temp.next;
        }
        return result;
    }
}
class Twin_sum
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int num = scn.nextInt();
        if(num == 0)
        {
            System.out.println("Node is empty");
            return;
        }
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

        Solution sol = new Solution();
        int result = sol.pairSum(head);
        System.out.println("The maximum twin sum is : " + result);

    }
}