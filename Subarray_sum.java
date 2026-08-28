import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            int sum = 0;
            for(int j = i;j<nums.length;j++)
            {
                sum += nums[j];
                if(sum == k)
                    count++;
            }
        }
        return count;
    }
}
public class Subarray_sum {
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
        System.out.println("Enter the k value : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.subarraySum(arr, k);
        System.out.println("The total number of subarray sum is equals to k is : " + result);
    }
}
