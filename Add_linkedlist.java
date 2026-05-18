import java.util.*;

class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        int carry =0;
        while(l1!=null || l2!=null || carry!=0) 
        {
            int x=0;
            int y=0;
            if(l1!=null)
            {
                x=l1.val;
            }
            if(l2!=null)
            {
                y=l2.val;
            }
            int sum = x+y+carry;
            carry = sum/10;
            int digit = sum%10;
            l3.next = new ListNode(digit);
            l3 = l3.next;
            if(l1!=null)
            {
                l1 = l1.next;
            }
            if(l2!=null)
            {
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}
class Add_linkedlist {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first node size : ");
        int n1 = scn.nextInt();
        System.out.println("Enter the first node elements ; ");
        int val1 = scn.nextInt();
        ListNode head1 = new ListNode(val1);
        ListNode temp1 = head1;
        for(int i=1;i<n1;i++)
        {
            val1 = scn.nextInt();
            temp1.next = new ListNode(val1);
            temp1 = temp1.next;
        }
        System.out.println("Enter the second node size : ");
        int n2 = scn.nextInt();
        System.out.println("Enter the second node elements ; ");
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
        ListNode result = sol.addTwoNumbers(head1, head2);
        System.out.println("Addition of two node values : ");
        while(result!=null)
        {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print("null");
    }
}
