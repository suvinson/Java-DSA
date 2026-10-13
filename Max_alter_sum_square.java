import java.util.*;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = nums[i] * nums[i];
        }
       Arrays.sort(nums);
       int j = nums.length - 1;
       long ans = 0;
       for(int i=0;i<nums.length/2;i++)
       {
            ans = ans + nums[j];
            ans = ans - nums[i];
            j--;
       }
       if(nums.length % 2 == 1)
       {
            ans += nums[j];
       }
       return ans;
    }
}
public class Max_alter_sum_square {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array element : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        long ans = sol.maxAlternatingSum(arr);
        System.out.println("The maximum alternating sum is : " + ans);
    }   
}
