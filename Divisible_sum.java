import java.util.*;
class Divisible_sum
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n,m;
        System.out.println("Enter the number: ");
        n=scn.nextInt();
        System.out.println("Enter the divisor: ");
        m=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.differenceOfSums(n,m);
        System.out.println("The difference is : " + result);
    }
}
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0,sum1=0;
       while(n!=0)
       {
            if(n%m==0)
            {
                sum+=n;
            }
            else
                sum1+=n;
            n-=1;
       }
        return sum1-sum;
    }
}