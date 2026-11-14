import java.util.*;
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.size() ; i++)
        {
            int cnt = 0;
            int sum = 0;
            int j = i;
            while(j < nums.size() && cnt < r)
            {
                cnt = cnt + 1;
                sum += nums.get(j);
                j++;
                if(sum > 0 && (cnt >= l && cnt <= r))
                {
                    ans = Math.min(ans, sum);
                }
            }      
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}
public class Min_pos_sum_subarray {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        ArrayList<Integer> nums = new ArrayList<>(n);
        for(int i = 0 ; i < n ; i++)
        {
            nums.add(scn.nextInt());
        }
        System.out.println("Enter the size of the subarray from left : ");
        int l = scn.nextInt();
        System.out.println("Enter the size of the subarray to right : ");
        int r = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.minimumSumSubarray(nums, l, r);
        System.out.println("The minimum positive sum of subarray is : " + ans);
    }
}
