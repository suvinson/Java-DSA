import java.util.*;
class Solution {
    public int maxLength(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int a = nums[i];
            int b = nums[i];
            int prod = 1;
            int count = 0;
            for(int j = i ; j < nums.length ; j++)
            {
                prod *= nums[j];
                a = gcd(a , nums[j]);
                b = lcm(b , nums[j]);
                count++;
                if(prod == a * b)
                {
                    ans = Math.max(ans , count);
                }
            }
        }
        return ans;
    }
    private int gcd(int a , int b)
    {
        if(b == 0)
        {
            return Math.abs(a);
        }
        return gcd(b , a % b);
    }
    private int lcm(int a , int b)
    {
        if(a == 0 || b == 0)
        {
            return 0;
        }
        return Math.abs(a / gcd(a,b)) * Math.abs(b);
    }
}
public class Max_subarray_equal_product {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.maxLength(arr);
        System.out.println("Maximum subarray with equal product : " + ans);
    }
}
