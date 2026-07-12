import java.util.*;
class Solution {
    public int minimumCost(int[] nums, int k) {
       long val = k;
        long total = 0;
        for(int i=0;i<nums.length;i++)
            {
                if(val < nums[i])
                {
                   long need = nums[i] - val;
                    long pack = (need + k-1)/k;

                    val +=pack *k;
                    total +=pack;
                }
                val -= nums[i];
            }
        long a = total;
        long b = total + 1;
        if(a % 2 ==0)
        {
            a /= 2;
        }
        else 
            b/=2;

        a %= 1000000007;
        b %= 1000000007;
        
        long ans = (a*b) % 1000000007;
        return (int) ans;
    }
}
public class Min_cost {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the k value : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.minimumCost(arr,k);
        System.out.println(" Minimum Total Cost to Process All Elements : " + result);
    }
}
