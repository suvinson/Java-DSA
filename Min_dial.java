import java.util.*;
class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int current = 0;
        int target = 0;
        for(int i=0;i<s.length();i++)
        {
            int clock = Integer.MAX_VALUE;
            int counter = Integer.MAX_VALUE;
            target = s.charAt(i) - '0';
            clock = Math.abs(current - target);
            counter = 10 - clock;
            ans += Math.min(clock,counter);
            current = target;
        }
        return ans;
    }
}
public class Min_dial {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 10 digit string : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.minRotations(s);
        System.out.println("The minimum dial rotation is : " + ans);
    }
}
