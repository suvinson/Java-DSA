import java.util.*;
class Remove_zeros
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        long num;
        System.out.println("Enter the number: ");
        num=scn.nextLong();
        Solution sol = new Solution ();
        long result= sol.removeZeros(num);
        System.out.println("After removing zeros: " + result);
    }
}
class Solution {
    public long removeZeros(long n) {
        long sum=0;
        while(n!=0)
        {
            long rev=n%10;
            if(rev!=0)
            {
                sum=sum*10+rev;
            }
            n=n/10;
        }
        long sum1=0;
        while(sum!=0)
        {
            long rev1=sum%10;
            if(rev1!=0)
            {
                sum1=sum1*10+rev1;
            }
            sum=sum/10;
        }
        return sum1;
    }
}