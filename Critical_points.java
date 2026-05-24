import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 2;
        ArrayList<Integer> arr = new ArrayList<>();
        while(curr!= null && curr.next!=null)
        {
            if(curr.val > prev.val && curr.val > curr.next.val)
            {
                arr.add(index);
            }
            else if( curr.val < prev.val && curr.val < curr.next.val)
            {
                arr.add(index);
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        int min=Integer.MAX_VALUE;
        int max =0;
        if(arr.size()>=2)
        {
            max = arr.get(arr.size()-1) - arr.get(0);
       
            for(int i=0;i<arr.size()-1;i++)
            {
                if(arr.get(i+1) - arr.get(i)< min)
                {
                    min = Math.abs(arr.get(i) - arr.get(i+1));
                }
            }
        }
        if(arr.size()<2)
        {
            return new int[]{-1,-1};
        }
        else
            return new int[]{min,max};
    }
}
public class Critical_points {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the ListNode size : ");
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
        Solution sol = new Solution();
        int[] result = sol.nodesBetweenCriticalPoints(head);
        System.out.println("The min and max critical points are : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
