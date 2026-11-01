import java.util.*;
class Solution {
    public int minMergedInteger(int[] nums) {
        String s = ""; 
        int j = 1;
        int maxi = Integer.MAX_VALUE;
        for(int i=0 ; i < nums.length - 1 ; i = i + 2)
        {
            s += nums[i];
            s += nums[j];
            j = j + 2;
            int res = Integer.parseInt(s);
            if(res < maxi)
            {
                maxi = res;
            }
            s = "";
        }
        return maxi;
    }
}
public class Min_value_merged_int {
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
        int ans = sol.minMergedInteger(arr);
        System.out.println("Minimum Value of Merged Integers : " + ans);
    }
}
