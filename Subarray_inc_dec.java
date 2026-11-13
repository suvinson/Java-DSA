import java.util.*;
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int maxLen = 1;
        for(int i = 1; i < nums.length ; i++)
        {
            if(nums[i] < nums[i - 1])
            {
                inc = inc + 1;
                dec = 1;
            }
            else if(nums[i] > nums[i - 1])
            {
                dec = dec + 1;
                inc = 1;
            }
            else
            {
                inc = 1;
                dec = 1;
            }
            int total = Math.max(inc, dec);
            maxLen = Math.max(maxLen, total);
        }
        return maxLen;
    }
}
public class Subarray_inc_dec {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.longestMonotonicSubarray(arr);
        System.out.println("The longest increasing or decreasing subarray length is : " + ans);
    }
}
