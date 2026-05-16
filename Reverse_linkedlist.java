import java.util.*;
class ListNode 
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) 
      { 
        this.val = val; 
      }
      ListNode(int val, ListNode next) 
      { 
        this.val = val; 
        this.next = next; 
      }
}
class Solution {
    public ListNode reverseList(ListNode head) {
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
        return head=prev;
    }
}
class Reverse_linkedlist
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n=scn.nextInt();
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

        Solution sol = new Solution();
        ListNode result = sol.reverseList(head);
        System.out.println("LinkedList in reverse order : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}