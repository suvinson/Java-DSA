import java.util.*;
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int count =0;
        for(int i=0;i<nums.length;i++)
            {
                int even = 0;
                int odd = 0;
                for(int j=i;j<nums.length;j++)
                    {
                        if(nums[j] % 2 == 0)
                            even++;
                        else
                            odd++;
                        if(odd > 0 && even * b <= a * odd)
                            count++;
                    }
            }
        return count;
    }
}
public class Count_subarray_odd_even {
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
        System.out.println("Enter the a's ratio : ");
        int a = scn.nextInt();
        System.out.println("Enter the b's ratio : ");
        int b = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.countRatioSubarrays(arr, a, b);
        System.out.println("The number of valid subarray count is : " + ans);
    }
}
