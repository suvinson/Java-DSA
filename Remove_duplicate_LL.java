import java.util.*;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
       while(temp!=null)
       {
            while(temp.next!=null && temp.val == temp.next.val)
            {
                if(temp.next!=null)
                {
                    if(temp.val == temp.next.val)
                    {   
                        temp.next = temp.next.next;
                    }
                }
            }
            temp = temp.next;
       }
       return head;
    }
}
public class Remove_duplicate_LL {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n = scn.nextInt();
        System.out.println("Enter the node values : ");
        int val = scn.nextInt();

        ListNode head = new ListNode(val);
        ListNode temp = head;
        for(int i=1;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        Solution sol = new Solution();
        ListNode result = sol.deleteDuplicates(head);
        System.out.println("After removing duplicates from the linkedlist : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
