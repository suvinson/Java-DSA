import java.util.*;
class Solution {
    public int sortPermutation(int[] nums) {
        int ans = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(i != nums[i])
            {
                if(ans == -1)
                {
                    ans = nums[i];
                }
                else
                {
                    ans = ans & nums[i];
                } 
            }
        }
        return ans == -1 ? 0 : ans;
        
    }
}
public class Min_k_sort_permutation {
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
        int ans = sol.sortPermutation(arr);
        System.out.println("The Maximum K to Sort a Permutation is : " + ans);
    }
}
