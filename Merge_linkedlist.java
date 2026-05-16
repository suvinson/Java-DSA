 import java.util.*;
 class ListNode 
    {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       ListNode temp1 = list1;
       ListNode temp2 = list1;
       ListNode temp3 = list2;
       while(a>1)
       {
            temp1 = temp1.next;
            a--;
       }
        while(b>0)
        {
            temp2 = temp2.next;
            b--;
        }
        temp2= temp2.next;
        while(temp3.next!=null)
        {
            temp3 = temp3.next;
        }
        temp3.next = temp2;
        temp1.next = list2;
        return list1;
       
    }
}
class Merge_linkedlist
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of first node :");
        int n1 = scn.nextInt();
        System.out.println("Enter the first node values :");
        int val1 = scn.nextInt();
        ListNode head1 = new ListNode(val1);
        ListNode temp1 = head1;
        for(int i=1;i<n1;i++)
        {
            val1 = scn.nextInt();
            temp1.next = new ListNode(val1);
            temp1 = temp1.next;
        }
        System.out.println("Enter two nodes from the first node : ");
        int a= scn.nextInt();
        int b= scn.nextInt();
        System.out.println("Enter the number of second node :");
        int n2 = scn.nextInt();
        System.out.println("Enter the second node values :");
        int val2 = scn.nextInt();
        ListNode head2 = new ListNode(val2);
        ListNode temp2 = head2;
        for(int i=1;i<n2;i++)
        {
            val2 = scn.nextInt();
            temp2.next = new ListNode(val2);
            temp2 = temp2.next;
        }
        Solution sol = new Solution();
        ListNode result = sol.mergeInBetween(head1,a,b,head2);
        System.out.println("Merge in between linked list : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}