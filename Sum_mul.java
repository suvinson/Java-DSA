import java.util.*;
class Sum_mul
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=scn.nextInt();
        Solution sol=new Solution();
        long result=sol.sumAndMultiply(num);
        System.out.println(result);
    }
}
class Solution {
    public long sumAndMultiply(int n) {
        long sum=0,sum1=0,rev=0,rev1=0;
        long n1=n;
        long ar=0;
        if(n==0)
            return 0;
       while(n!=0){
            rev=n%10;
            if(rev!=0)
            {
                sum=sum+rev;
            }
            ar=ar*10+rev;
            n=n/10;
       }
       while(ar!=0){
            rev1=ar%10;
            if(rev1!=0)
            {
                sum1=sum1*10+rev1;
            }
            ar=ar/10;
       }
        return sum*sum1;
    }
}

