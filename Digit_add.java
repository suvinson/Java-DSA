import java.util.*;
class Digit_add
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner (System.in);
        int n;
        System.out.println("Enter the number: ");
        n=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.checkDivisibility(n);
        System.out.println(result);
    }
}
class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1;
        int n1=n;
        while(n!=0)
        {
            int rev=n%10;
            sum+=rev;
            pro*=rev;
            n/=10;
        }
        if(n1%(sum+pro)==0)
            return true;
        else
            return false;
    }
}