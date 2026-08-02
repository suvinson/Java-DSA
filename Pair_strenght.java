import java.util.*;
class Solution {
    public long maxPairStrength(int[] nums) {
        long ans = 0;
        for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                    {
                        ans = Math.max(ans,(((long) nums[i]*nums[j]) / (gcd(nums[i],nums[j]) * gcd(nums[i],nums[j]))));
                    }
            }
        return ans;
    }
    private int gcd(int i , int j)
    {
        int max1 = 0,max2 = 0;
        if(i>j)
        {
            max1 = i;
            max2 = j;
        }
        else
        {
            max2 = i;
            max1 = j;
        }
        while( max2!= 0)
        {
            int temp = max2;
            max2 = max1 % max2;
            max1 = temp;
        }
        return max1;
    }
}
public class Pair_strenght {
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
        long ans = sol.maxPairStrength(arr);
        System.out.println("Max Pair Strength Using GCD : " + ans);
    }
}
