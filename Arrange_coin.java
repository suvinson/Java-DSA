import java.util.*;
class Arrange_coin
{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        int n;
        System.out.println("Enter the coins number to arrange : ");
        n=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.arrangeCoins(n);
        System.out.println("Incomplete row is : " + result);
    }
}
class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
             n=n-i;
             count++;
             if(n<0)
             {
                break;
             }
        }
        return count;
    }
}