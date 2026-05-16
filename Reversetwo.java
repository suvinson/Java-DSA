import java.util.*;
class Reversetwo
{
    public static  void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int nums;
        System.out.println("Enter the number:");
        nums=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.isSameAfterReversals(nums);
        if(result)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0,sum=0,rev1=0,sum1=0;
        int copy=num;
        while(num!=0)
        {
            rev=num%10;
            sum=(sum*10)+rev;
            num=num/10;
        }
         while(sum!=0)
        {
            rev1=sum%10;
            sum1=(sum1*10)+rev1;
            sum=sum/10;
        }
        if(sum1==copy)
            return true;
        else 
            return false;
    }
}