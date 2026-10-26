import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(maxIndex >= i)
            {
                maxIndex = Math.max(maxIndex,nums[i] + i);
            }
            else 
            {
                return false;
            }
        }
        return true;
    }
}
public class Jump_game {
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
        boolean  ans = sol.canJump(arr);
        if(ans)
        {
            System.out.println("You can reach the last element ");
        }
        else
        {
            System.out.println("You can't reach the last element ");
        }
    }
}
