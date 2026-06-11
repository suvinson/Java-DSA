import java.util.*;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        while(head!=null)
        {
            while(head.next!=null)
            {
                if(head.next!=null && head.next.val!=0)
                {
                    sum +=head.next.val;
                    head = head.next;
                }
                else if(head.next!=null && head.next.val == 0)
                {
                    arr.add(sum);
                    sum =0;
                    head = head.next;
                }
            }
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i=0;i<arr.size();i++)
        {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}
public class Merge_nodes_zeros {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the linked-list size : ");
        int n = scn.nextInt();
        System.out.println("Enter the list elements : ");
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
        ListNode result = sol.mergeNodes(head);
        System.out.println("After merging the nodes in between zeros : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
