import java.util.*;
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high = maxi(nums);
        int low = 1;
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(search(nums,mid,threshold))
            {
                high = mid - 1;
            }
            else 
            {
                low = mid + 1;
            }

        }
        return low;
    }
    private int maxi(int[] nums)
    {
        int maxi = 0;
        for(int i=0;i<nums.length;i++)
        {
            maxi = Math.max(maxi,nums[i]);
        }
        return maxi;
    }
    private boolean search(int[] nums, int div, int d)
    {
        int ans = 0;
            for(int j=0;j<nums.length;j++)
            {
                ans += Math.ceil((double) nums[j] / div);
            }
            return ans <= d;
    }
}
public class Divisor_threshold {
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
        System.out.println("Enter the threshold value : ");
        int threshold  = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.smallestDivisor(arr, threshold);
        System.out.println("The Smallest Divisor Given a Threshold is : " + result);
    }
}
