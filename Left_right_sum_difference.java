import java.util.*;
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0;
        int leftSum = 0;
        int[] arr = new int[nums.length];
        int[] arr1 = new int[nums.length];
        arr[0] =0;
        arr1[0] = 0;
        for(int i=0;i<nums.length;i++){
            arr[i] = leftSum;
            leftSum +=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            arr1[i] = rightSum;
            rightSum +=nums[i];
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(arr[i]-arr1[i]);
        }
        return ans;
    }
}
public class Left_right_sum_difference {
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
        int[] result = sol.leftRightDifference(arr);
        System.out.println("Left and right sum difference : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
