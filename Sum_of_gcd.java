import java.util.*;
class Solution {
    public long gcdSum(int[] nums) {
        int[] preFix = new int[nums.length];
        int mx = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            mx = Math.max(mx,nums[i]);
            preFix[i] = prefixGcd(nums[i],mx);
        }
        Arrays.sort(preFix);
        long ans = 0;
        for(int i=0,j=preFix.length-1;i<j;i++,j--)
        {
            ans += prefixGcd(preFix[i],preFix[j]);
        }
        return ans;
    }
    public int prefixGcd(int nums,int mx)
    {
        while(nums!=0)
        {
            int temp = nums;
            nums = mx % nums;
            mx = temp;
        }
        return mx;
    }
}
public class Sum_of_gcd {
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
        long result = sol.gcdSum(arr);
        System.out.println("Sum of GCD of Formed Pairs : " + result);
    }
}
