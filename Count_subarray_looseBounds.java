import java.util.*;
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int start = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] >= minK && nums[i] <= maxK)
            {
                start++;
            }   
            else
            {
                start = 0;
            }   
            ans += start;
        }
        return ans;
    }
}
public class Count_subarray_looseBounds {
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
        System.out.println("Enter the mink value : ");
        int minK = scn.nextInt();
        System.out.println("Enter the maxK value : ");
        int maxK = scn.nextInt();
        Solution sol = new Solution();
        long ans = sol.countSubarrays(arr, minK, maxK);
        System.out.println("Subarrays With Loose Bounds count is : " + ans);
    }
}
