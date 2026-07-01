import java.util.*;
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int  j=1;
        for(int i=0;i<nums.length;i=i+2)
        {
            result += Math.min(nums[i],nums[j]);
            if(j<nums.length)
                j=j+2;
        }
        return result;
        /* Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result; */
    }
}
public class Array_partition {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.arrayPairSum(arr);
        System.out.println("The array pair sum is : " + result);    
    }
}
