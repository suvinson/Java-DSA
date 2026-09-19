import java.util.*;
class Solution {
    long mod = 1000000007;
    public int countGoodNumbers(long n) {
            long even = (n + 1) / 2;
            long odd = n / 2;
            long first = pow(5,even);
            long second = pow(4,odd);
            return (int) ((first * second) % mod);
    }
    private long pow(long base, long expo)
    {
        long res = 1;
        while(expo > 0)
        {
            if(expo % 2 == 1)
            {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            expo = expo / 2;
        }
        return res;
    }
}
public class Count_good_num {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num = scn.nextLong();
        Solution sol = new Solution();
        int ans = sol.countGoodNumbers(num);
        System.out.println("The total good numbers are : " + ans);
    }
}
