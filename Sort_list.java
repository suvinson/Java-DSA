import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode h = head;
        int count = 0;
        while(h!=null)
        {
           h = h.next;
            count++;
        }
        ListNode h1 = head;
        int[] arr = new int[count];
        for(int i=0;i<count;i++)
        {
            arr[i] = h1.val;
            h1 = h1.next;
        }
        int start = 0;
        int end = count-1;
        mergeSort(arr,start,end);
        ListNode head1 = null;
        if(arr.length!=0)
        {
            head1 = new ListNode(arr[0]);
        }
        ListNode curr = head1;
        for(int i=1;i<arr.length;i++)
        {
            ListNode newNode = new ListNode(arr[i]);
            curr.next = newNode;
            if(curr.next!=null)
            {
                curr = curr.next;
            }
        }
        return head1; 
    }
    public void mergeSort(int[] nums , int start , int end)
        {
            if(start>=end)
            {
                return ;
            }
            int mid = (start+end)/2;
            mergeSort(nums,start, mid);
            mergeSort(nums,mid+1,end);
            merge(nums, start,mid,end);
        }
        public int[] merge(int[] nums, int start, int mid, int end)
        {
            int i=start , j = mid+1 , k = start;
            int[] res = new int[nums.length];
            while(i<=mid && j<=end)
            {
                if(nums[i] <= nums[j])
                {
                    res[k] = nums[i];
                    i++;
                    k++;
                }
                else
                {
                    res[k] = nums[j];
                    j++;
                    k++;
                }
            }
            while(i<=mid)
            {
                res[k] = nums[i];
                i++;
                k++;
            }
            while(j<=end)
            {
                res[k] = nums[j];
                j++;
                k++;
            }
            for(int r=start;r<=end;r++)
            {
                nums[r] = res[r];
            }
            return nums;
        }

}

public class Sort_list {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of the node : ");
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
        Solution sol = new Solution();
        ListNode result = sol.sortList(head);
        System.out.println("List is sorted order : ");
        while(result!=null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
