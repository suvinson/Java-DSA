import java.util.*;
/* class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            ans = Math.max(ans,sequence(nums,i));
        }
        return ans;
    }
    private int sequence(int[] arr, int start)
    {
        int sum = arr[start];
        for(int i=start+1;i<arr.length;i++)
        {   
            sum = sum ^ arr[i];
        }
        if(sum != 0)
            return arr.length - start;
        boolean hasNonZero = false;
        for (int x : arr) 
        {
            if (x != 0)
            {
                hasNonZero = true;
                break;
            }
        }
        if (hasNonZero)
        {
            return arr.length - start - 1;
        }
        return 0;
    }
} */
class Solution {
    public int longestSubsequence(int[] nums) {

        int xor = 0;
        boolean hasNonZero = false;

        for (int num : nums) {
            xor ^= num;

            if (num != 0) {
                hasNonZero = true;
            }
        }

        if (xor != 0) {
            return nums.length;
        }

        if (hasNonZero) {
            return nums.length - 1;
        }

        return 0;
    }
}
public class Xor_problem {
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
        int ans = sol.longestSubsequence(arr);
        System.out.println("Longest Subsequence With Non-Zero Bitwise XOR : " + ans);
    }
}
