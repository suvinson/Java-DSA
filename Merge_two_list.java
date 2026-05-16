import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        if(list1 ==null && list2 ==null)
        {
            return null;
        }
        if(list1==null && list2!=null)
        {
            return list2;
        }
        while(temp1.next!=null)
        {
            temp1 = temp1.next;
        }
        temp1.next = list2;
        ListNode temp = list1;
        int count = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        while(count>0)
        {
            temp = list1;
            for(int i=0;i<count;i++)
            {
                if(temp.next!=null && temp.val>temp.next.val)
                {
                    int tem = temp.val;
                    temp.val = temp.next.val;
                    temp.next.val = tem;
                }
                temp = temp.next;
            }   
            count--; 
        }
        return list1;
    }
}
class Merge_two_list
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of first node :");
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
        System.out.println("Enter the size of second node :");
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
        ListNode result = sol.mergeTwoLists(head1,head2);
        System.out.println("Combination of two sorted nodes : ");
        while(result!=null)
        {
            System.out.print(result.val +" ");
            result = result.next;
        }
    }

}