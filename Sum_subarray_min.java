import java.util.*;
class Solution {
    public int sumSubarrayMins(int[] arr) {
        
        int[] NSE = findNSE(arr);
        int[] PSEE = findPSEE(arr);
        long total = 0 ;
        int mod = (int) (1e9 + 7);
        for(int i = 0 ; i < arr.length; i++)
        {
            long left = i - PSEE[i];
            long right = NSE[i] - i;
            total = (total + (left * right * arr[i]) )% mod;
        }
        return (int) total;
    }
    private int[] findNSE(int[] arr)
    {
        int[] nse = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i])
            {
                stk.pop();
            }
            nse[i] = stk.isEmpty() ? arr.length : stk.peek();
            stk.push(i);
        }
        return nse;
    }
    private int[] findPSEE(int[] arr)
    {
        int[] pse = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i])
            {
                stk.pop();
            }
            pse[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        return pse;
    }
}

public class Sum_subarray_min {
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
        int ans = sol.sumSubarrayMins(arr);
        System.out.println("The sum of subarray minimums is : " + ans);
    }
}
