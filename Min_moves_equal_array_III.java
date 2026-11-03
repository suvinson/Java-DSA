import java.util.*;
class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] > maxi)
            {
                maxi = nums[i];
            }
        }
        for(int i=0; i < nums.length; i++)
        {
            ans += (maxi - nums[i]);
        }
        return ans;
    }
}
public class Min_moves_equal_array_III {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.minMoves(arr);
        System.out.println("Minimum Moves to Equal Array Elements III is : " + ans);
    }
}
