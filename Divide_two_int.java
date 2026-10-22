import java.util.*;
class Solution {
    public int divide(int dividend, int divisor) {
       if(dividend == divisor)
       {
            return 1;
       }
        boolean sign = true;
       if(dividend >= 0 && divisor < 0)
            sign = false;
        else if(dividend <= 0 && divisor > 0)
            sign = false;
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long q = 0;

        while(n >= d)
        {
            int cnt = 0;
            while(n >= (d<<(cnt+1)))
            {
                cnt++;
            }
            q = q + (1<<cnt);
            n = n - (d<<cnt);
        }
        if(q == (1 << 31) && sign)
            return Integer.MAX_VALUE;  
        if(q == (1 << 31) && !sign )
            return Integer.MIN_VALUE;
        return (sign) ? (int) q : (int) -q;
    }
}
public class Divide_two_int {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int dividend = scn.nextInt();
        System.out.println("Enter the divisor : ");
        int divisor = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.divide(dividend, divisor);
        System.out.println("The division without using / : " + dividend + " / " + divisor + " = " + ans);
    }
}
