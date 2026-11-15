import java.util.*;
class Solution {
    public int countConsistent(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int mini = Integer.MAX_VALUE;
            int op = nums[i];
            for(int j = i ; j < nums.length ; j++)
            {
                op = op & nums[j];
                mini = Math.min(mini,nums[j]);
                if(mini == op)
                    count++;
            }
        }
        return count;
    }
}
public class Count_consistent_subarray_I {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i= 0 ; i < n ;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.countConsistent(arr);
        System.out.println("The consistent subarray count is : " + ans);
    }
}
