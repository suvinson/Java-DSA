import java.util.*;
class Solution {
    public boolean predictTheWinner(int[] nums) {
        if(recursion(nums,0,nums.length-1) >= 0)
            return true;
        else
            return false;
    }
    private int recursion(int[] nums , int start , int end)
    {
        if(start == end)
            return nums[start];
        int left = nums[start] - recursion(nums,start+1,end);
        int right = nums[end] - recursion(nums,start,end-1);
        return Math.max(left,right);
    }
}
public class Predict_the_winner {
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
        boolean result = sol.predictTheWinner(arr);
        if(result)
        {
            System.out.println("Player 1 wins ");
        }
        else
            System.out.println("Player 2 wins ");
    }
}
