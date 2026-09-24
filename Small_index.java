import java.util.*;
class Solution {
    public int smallestIndex(int[] nums) { 
        for(int i=0;i<nums.length;i++)
        {
            int ans = Integer.MAX_VALUE;
            ans = digit(nums[i]);
            if(ans == i)
            {
                return ans;
            }
        }
        return -1;
    }
    private int digit(int num)
    {
        int ans = 0;
        while(num !=0)
        {
            int rev = num % 10;
            ans += rev;
            num = num / 10;
        }
        return ans;
    }
}
public class Small_index {
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
        int ans = sol.smallestIndex(arr);
        System.out.println("The smallest index with equal digit sum is : " + ans);

    }
}
