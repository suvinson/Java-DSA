import java.util.*;
class Solution {
    public int minDeletions(int[] nums) {
        int count = 0;
        int j = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(j < nums.length)
            {
                if((nums[i] == nums[j]) && (nums[i] ^ nums[j]) == 0)
                {
                    count++;
                }
            }
            j++;
        }
        return count;
    }
}
public class Min_del_xor {
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
        int ans = sol.minDeletions(arr);
        System.out.println("Minimum Deletions to Make Array Sharp is : " + ans);
    }
}
