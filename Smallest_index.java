import java.util.*;
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            int maxi = nums[0];
            int mini = nums[i];
            for(int j=0;j<=i;j++)
            {
                maxi = Math.max(maxi,nums[j]);
            }
            for(int m=i;m<nums.length;m++)
            {
                mini = Math.min(mini,nums[m]);
            }
            int score = maxi - mini;
            if(score <= k)
            {
                return i;
            }
        }
        return -1;
    }
}
public class Smallest_index {
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
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.firstStableIndex(arr, k);
        System.out.println("The smallest stable index is : " + ans);
    }
}
