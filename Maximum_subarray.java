import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        int maxValue = nums[0];
        int currentValue = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            currentValue = Math.max(nums[i], currentValue+nums[i]);
            maxValue = Math.max(maxValue,currentValue);
        }
        return maxValue;
    }
}
public class Maximum_subarray {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.maxSubArray(arr);
        System.out.println("The maximum subarray is : " + result );
    }
}
