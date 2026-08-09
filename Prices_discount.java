import java.util.*;
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double ans = 0;
        int n = discounts.length-1;
        for(int i=prices.length-1;i>=0;i--)
            {
                if(n>=0)
                {
                    ans += prices[i] * ((double) 100 - discounts[n]) / 100 ;
                    n--;
                }
                else
                {
                    ans += prices[i];
                }
            }
        return ans;
    }
}
public class Prices_discount {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the price's array size : ");
        int n1 = scn.nextInt();
        System.out.println("Enter the prices : ");
        int[] prices = new int[n1];
        for(int i=0;i<n1;i++)
        {
            prices[i] = scn.nextInt();
        }
        System.out.println("Enter the discount's array size : ");
        int n2 = scn.nextInt();
        System.out.println("Enter the prices : ");
        int[] discount = new int[n2];
        for(int i=0;i<n2;i++)
        {
            discount[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        double result = sol.minPrice(prices, discount);
        System.out.println("The Minimum Total Price After Applying Discounts : " + result);
    }
}
