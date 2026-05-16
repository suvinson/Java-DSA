import java.util.*;
class UglyNumber
{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.isUgly(num);
        if(result)
            System.out.println(num + " is an ugly number");
        else
            System.out.println(num + " is not an ugly number");
    }
}
class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
        {
            return false;
        }
        while(n>1)
        {
            if(n%2==0)
                n=n/2;
            else if(n%3==0)
                n=n/3;
            else if(n%5==0)
                n=n/5;
            else
                return false;
        }
        if(n==1)
            return true;
        else 
            return false;
    }
}