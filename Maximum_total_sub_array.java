import java.util.*;
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long ans =0;
        int mx = 0;
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            mx = Math.max(mx, nums[i]);
            mn = Math.min(mn, nums[i]);
        }
        ans = mx-mn;
        return ans*k;
    }
}
public class Maximum_total_sub_array {
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
        System.out.println("Enter how many times you want add the sub array : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        long result = sol.maxTotalValue(arr,k);
        System.out.println("Maximum total sub array value : " + result);
    }
}
