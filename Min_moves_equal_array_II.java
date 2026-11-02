import java.util.*;
class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length == 1)
            return 0;
        Arrays.sort(nums);
        int mini = nums[nums.length / 2];
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > mini)
            {
                ans += nums[i] - mini;
            }
            else
            {
                ans += mini - nums[i]; 
            }
        }
        return ans;
    }
}
public class Min_moves_equal_array_II {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.minMoves2(arr);
        System.out.println("Minimum Moves to Equal Array Elements II is : " + ans);
    }
}
