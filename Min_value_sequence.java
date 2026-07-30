import java.util.*;
class Solution {
    public long maximumValue(int n, int s, int m) {
        /* long ans1 = s,ans2 = s;
        long ans = s;
        for(int i=1;i<n;i++)
            {
                if(i % 2 != 0 )
                {
                    ans1 += m;
                }
                else 
                    ans1 -= 1;
                ans = Math.max(ans,ans1);
            }
        for(int i=1;i<n;i++)
            {
                if(i % 2 != 0 )
                {
                    ans2 -= 1 ;
                }
                else 
                    ans2 += m  ;
                ans = Math.max(ans2,ans);
            }
        return ans; */
        if(n==1)
            return s;

        long up1 = (long) n / 2;
        long down1 = up1 > 0 ? up1 - 1 : 0 ;
        long max1 = s + (up1 * m) - down1;

        
        long up2 = (long) (n-1)/2 ;
        long down2 = up2;
        long max2 =  s + (up2 * m) - down2;

        return Math.max(s,Math.max(max1,max2));
    }
}
public class Min_value_sequence {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of length : ");
        int n = scn.nextInt();
        System.out.println("Enter the initial number : ");
        int s = scn.nextInt();
        System.out.println("Enter the difference number : ");
        int m = scn.nextInt();
        Solution sol = new Solution();
        long result = sol.maximumValue(n, s, m);
        System.out.println("The max value is : " + result);
    }
}
