import java.util.*;
class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int mini = Integer.MAX_VALUE;
        for(int i=0; i < nums.length ; i++)
        {
            if(nums[i] < mini)
                mini = nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            sum += ( nums[i] - mini );
        }
        return sum;
    }
}
public class Min_moves_equal_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for( int i=0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.minMoves(arr);
        System.out.println("Minimum Moves to Equal Array Elements is : " + ans);
    }
}
