import java.util.*;
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
       for(int i=Math.max(1,n-k); i<=k+n ; i++)
            {
                if( Math.abs(n-i) <= k && ((n & i) == 0) )
                {
                    sum +=i;
                }
            }
        return sum;
    }
}
public class Compatible_range {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = scn.nextInt();
        System.out.println("Enter the max range : ");
        int k = scn.nextInt();
        Solution sol  = new Solution();
        int result = sol.sumOfGoodIntegers(n,k);
        System.out.println("The sum of good integer is " + result );
    }
}
