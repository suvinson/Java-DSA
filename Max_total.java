import java.util.*;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        for(int i=nums.length-1;i>=nums.length-k;i--)
            {
                
                if(mul>0)
                {
                    ans += (long)nums[i] * mul;
                    mul--;
                }
                else 
                {
                    ans +=nums[i];
                }
            }
        return ans;
    }
}
public class Max_total {
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
        System.out.println("Enter the multiply element : ");
        int mul = scn.nextInt();
        Solution sol = new Solution();
        long result = sol.maxSum(arr, k, mul);
        System.out.println("The maximum total sum : " + result);
    }   
}
