import java.util.*;
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
       /*  int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            {
                for(int j=i+k;j<nums.length;j++)
                    {
                        int currentSum = nums[i] + nums[j];
                        if(currentSum > max)
                        {
                            max = currentSum;
                        }
                    }
            }
        return max; */

        int maxAns = Integer.MIN_VALUE;
        int maxLeft = Integer.MIN_VALUE;
        for(int j=k;j<nums.length;j++)
            {
                maxLeft = Math.max(maxLeft,nums[j-k]);

                if(maxLeft+nums[j] > maxAns)
                {
                    maxAns = maxLeft+nums[j];
                }
            }
        return maxAns;
    }
}
public class Pair_sum {
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
        System.out.println("Enter the Kth value : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.maxValidPairSum(arr,k);
        System.out.println("Enter the maximum sum pair is : " + result);
    }
}
