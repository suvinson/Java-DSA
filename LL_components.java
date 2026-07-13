import java.util.*;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            arr.add(nums[i]);
        }
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            if(arr.contains(temp.val) )
            {
                if(temp.next==null || !arr.contains(temp.next.val))
                {
                    count++;
                }
            }
            temp = temp.next ;
        }
        return count ;
    }
}
public class LL_components {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int n = scn.nextInt();
        System.out.println("Enter the node values : ");
        int val = scn.nextInt();
        ListNode head = new ListNode(val);
        ListNode temp = head;

        for(int i=1;i<n;i++)
        {
            val = scn.nextInt();
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        System.out.println("Enter the array size : ");
        int s = scn.nextInt();
        System.out.println("Enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<s;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.numComponents(head, arr);
        System.out.println("Linked List components are : " + result);
    }
}
