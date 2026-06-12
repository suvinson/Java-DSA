import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            st.add(nums[i]);
        }
        while(head.next!=null && st.contains(head.val))
        {
            head = head.next;
        }
        ListNode temp = head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.next!=null && st.contains(temp.next.val))
            {
                temp.next = temp.next.next;
            }
            else
                temp = temp.next;
        }
        return head;
    }
}
public class Delete_node_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the list node : ");
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
        System.out.println("Enter the size of the array : ");
        int n1 = scn.nextInt();
        System.out.println("Enter the array values to delete in the array : ");
        int[] arr = new int[n1];
        for(int i = 0;i<n1;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        ListNode result = sol.modifiedList(arr, head);
        System.out.println("Linked list after the deletion in the array elements : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
