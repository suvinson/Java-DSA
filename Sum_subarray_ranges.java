import java.util.*;
class Solution {
    public long subArrayRanges(int[] nums) {
        long ans = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int mini = Integer.MAX_VALUE;
            int maxi = nums[i];
            for(int j = i ; j < nums.length ; j++)
            {
                if(nums[j] < mini)
                {
                    mini = nums[j];
                }
                if(nums[j] > maxi)
                {
                    maxi = nums[j];
                }
                ans = ans + (maxi - mini);
            }
        }
        return ans;
    }
}
public class Sum_subarray_ranges {
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
        long ans = sol.subArrayRanges(arr);
        System.out.println("The sum of subarray ranges is : " + ans);
    }
}
