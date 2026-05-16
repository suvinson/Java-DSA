import java.util.*;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        int count =0;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        while(count>0)
        {
            temp = head;
            for(int i=0;i<count;i++)
            {
                if(temp.next!=null && temp.val>temp.next.val)
                {
                    int t = temp.val;
                    temp.val = temp.next.val;
                    temp.next.val = t;
                }
                temp = temp.next;
            }
            count--;
        }
        return head;
    }
}
class Insertion_sort_list {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the linked list : ");
        int n = scn.nextInt();
        System.out.println("Enter the list values : ");
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
        ListNode result = sol.insertionSortList(head);
        System.out.println("Linked list in insertion sort : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

