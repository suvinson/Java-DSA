import java.util.*;
class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        while(true)
        {
            ans = multi(n);
            if(ans % t == 0 )
            {
                break;
            }
            else
                n = n + 1;
        }
        return n;
    }
    private int multi(int n)
    {
        int mul = 1;
        while(n!=0)
        {
            int rev = n % 10;
            mul *= rev;
            n = n / 10;
        }
        return mul;
    }
}
public class Smallest_divisible_digit {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scn.nextInt();
        System.out.println("Enter the divisor : ");
        int t = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.smallestNumber(n,t);
        System.out.println("Smallest Divisible Digit Product I : " + result);
    }
}
