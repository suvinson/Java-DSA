import java.util.*;
class Swap_node {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the linked list size :");
        int n = scn.nextInt();
        System.out.println("Enter the node values :");
        int val = scn.nextInt();

        ListNode head = new ListNode(val);
        ListNode temp = head;

        for(int i=1;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        System.out.println("Enter the node position to change : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        ListNode result = sol.swapNodes(head,k);
        System.out.println("Linked list after swaping : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        /*ListNode temp = head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        int count=0;
        while(temp1!=null)
        {
            temp1 = temp1.next;
            count++;
        }
        int n= count-k+1;
        while(k-1>0)
        {
            temp = temp.next;
            k--;        
        }
        while(n-1>0)
        {
            temp2 = temp2.next;
            n--;
        }
        int tem = temp.val;
        temp.val = temp2.val;
        temp2.val = tem;
        return head;*/

        ListNode first = head;
        ListNode second = head;
        ListNode fast = head;

        for(int i=1;i<k;i++)
        {
            first = first.next;
        }

        fast = first;

        while(fast.next!= null)
        {
            fast = fast.next;
            second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
        
    }
}
