import java.util.*;
class Solution {
    public int minRange(int a, int b, int c) {
        int ans = Math.max(a,Math.max(b,c)) - Math.min(a,Math.min(b,c));
        int one = b + c;
        int second = a + b;
        int third = c + a;
        ans = Math.min(ans, Math.max(one,Math.max(b,c)) - Math.min(one,Math.min(b,c)));
        ans = Math.min(ans, Math.max(second,Math.max(a,b)) - Math.min(second,Math.min(a,b)));
        ans = Math.min(ans, Math.max(third,Math.max(c,a)) - Math.min(third,Math.min(c,a)));
        return ans;
    }
}
public class Min_sum_after_operation {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("The value for a : ");
        int a = scn.nextInt();
        System.out.println("The value for b : ");
        int b = scn.nextInt();
        System.out.println("The value for c : ");
        int c = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.minRange(a, b, c);
        System.out.println("Minimum Range After Sum Operations : " + ans);
    }
}
