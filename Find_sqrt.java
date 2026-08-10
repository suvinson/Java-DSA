import java.util.*;
class Solution 
{
    public int findSqrt(int n)
    {
        //Brute force
        /* int ans = 1;
        for(int i=1;i<=n;i++)
        {
            if(i*i <= n)
            {
                ans = i;
            }
            else
                break;
        }
        return ans; */

        int ans = 1;
        int low = 1;
        int high = n;
        int mid = 0;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(mid * mid <= n)
            {
                ans = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return ans;
    }
}
public class Find_sqrt {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value to find the maximum square root : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.findSqrt(n);
        System.out.println("The maximum square root is : " + result);
    }
}
