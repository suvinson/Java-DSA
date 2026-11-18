import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> maxi = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            while(!deque.isEmpty() && deque.peekFirst() <= i - k)
            {
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
            {
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i >= k - 1)
            {
                maxi.add(nums[deque.peekFirst()]);
            }
        }
        int[] arr = new int[maxi.size()];
        for(int i = 0 ; i < maxi.size() ; i++)
        {
            arr[i] = maxi.get(i);
        }
        return arr;
    }
}
public class Sliding_window_max {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int[] ans = sol.maxSlidingWindow(arr, k);
        System.out.println("The maximum value in each sliding window is : " );
        for(int i = 0 ; i < ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
