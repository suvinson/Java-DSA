import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode temp = prev;
        int max = temp.val;
        while(temp!=null)
        {
            if( temp.next!=null && max>temp.next.val)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
                if(temp!=null)
                {
                    max = temp.val;
                }
            }
        }
        current = prev;
        prev = null;
        next = null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
class Remove_nodes {
    public static void main(String arg[])
    {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number of nodes :");
    int n = scn.nextInt();
    System.out.println("Enter the node : ");
    int val = scn.nextInt();
    if(val == 0 )
    {
        System.out.println("ListNode is Empty");
    }
    ListNode head = new ListNode(val);
    ListNode temp = head;
    for(int i=1;i<n;i++)
    {
        val = scn.nextInt();
        temp.next = new ListNode(val);
        temp = temp.next;
    }
    Solution sol = new Solution();
    ListNode result = sol.removeNodes(head);
    while(result!= null)
    {
        System.out.print(result.val + " ");
        result = result.next;
    }
}
}
