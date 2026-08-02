import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
       //brute force
        /* if(nums.length == 1)
            return nums[0];
        int ans = 0;
        for(int i= 0;i<nums.length;i++)
        {
            int pro = 1;
            for(int j=i;j<nums.length;j++)
            {
                pro *= nums[j];
                ans = Math.max(ans,pro);
            }
        }
        return ans; */

        //optimal
        if(nums.length == 1)
            return nums[0];
        int prefix = 1, suffix = 1;
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(prefix == 0)
                prefix = 1;
            if(suffix == 0)
                suffix = 1;
            prefix *= nums[i];
            suffix *= nums[nums.length - i - 1];
            ans = Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
}
public class Max_subarray_product {
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
        int result = sol.maxProduct(arr);
        System.out.println("The maximum product of the subarray is : " + result);
    }
}
