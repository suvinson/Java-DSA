import java.util.*;
class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1)
            return 1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int min = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(mini > nums[i])
            {
                mini = nums[i];
                min = i;
            }
            if(maxi < nums[i])
            {
                maxi = nums[i];
                max = i;
            }
        }
        int front = Math.max(min,max) + 1;
        int back = nums.length - Math.min(min,max) ;
        int fb = (Math.min(min,max) + 1) + (nums.length - Math.max(min,max));
        return Math.min(front, Math.min(back,fb));
    }
}
public class Remove_min_max {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.minimumDeletions(arr);
        System.out.println("The minimum deletion of min and max is : " + ans);
    }
}
