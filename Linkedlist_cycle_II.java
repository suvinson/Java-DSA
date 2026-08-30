import java.util.*;
class ListNode 
{
      int val;
      ListNode next;
      ListNode(int x) 
      {
          val = x;
          next = null;
      }
  }
class Solution {
    public ListNode detectCycle(ListNode head) {
        /* Set<ListNode> ls = new HashSet<>();
        ListNode temp = head;
        while(temp!=null)
        {
            if(ls.contains(temp))
            {
                return temp;
            }
            ls.add(temp);
            temp = temp.next;
        }
        return null;  */
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
public class Linkedlist_cycle_II {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n=scn.nextInt();
        if (n <= 0) 
        {
            System.out.println("The linked list is empty.");
            return;
        }
        System.out.println("Enter the  nodes values : ");
        int val=scn.nextInt();
        
        ListNode head = new ListNode(val);
        ListNode temp = head;
        for(int i=1 ;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        System.out.print("Enter the position to create cycle (-1 for no cycle): ");
        int pos = scn.nextInt();
        if (pos >= 0 && pos < n) 
        {
            ListNode cycleNode = head;
            for (int i = 0; i < pos; i++) 
            {
                cycleNode = cycleNode.next;
            }
            temp.next = cycleNode;
        }
        Solution sol = new Solution();
        ListNode ans = sol.detectCycle(head);
        System.out.println("The linkedlist starting is :  " + ans.val);
    }
}

