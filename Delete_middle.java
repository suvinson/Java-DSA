import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = head;
        /*int count = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        if(count ==1)
        {
            return null;
        }
        if(count == 2)
        {
            head.next = null;
            return head;
        }
        count/=2;
        count-=1;
        while(count>0)
        {
            temp1 = temp1.next;
            count--;
        }
        temp1.next = temp1.next.next;
        */
        if(head.next ==null)
        {
            return null;
        }
        ListNode prev = temp;
        while(temp1!=null && temp1.next!= null)
        {
            prev = temp;
            temp = temp.next;
            temp1 = temp1.next.next;
            
        }
        prev.next = temp.next;
        return head;
    }
}
class Delete_middle{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n = scn.nextInt();
        System.out.println("Enter the node values : ");
        int val = scn.nextInt();
        ListNode head = new ListNode(val);
        ListNode temp = head;
        for(int i= 1 ;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        Solution sol = new Solution();
        ListNode result = sol.deleteMiddle(head);
        System.out.println("After removing the middle node : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}