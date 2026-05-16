import java.util.*;
class Gcd2
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.gcdOfOddEvenSums(num);
        System.out.println("GCD of first "+num + "  odd & even is : "+result);
    }
}
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum=0,sum1=0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
            else
                sum1+=i;
        }
        while(sum1!=0)
        {
            int temp=sum1;
            sum1=sum%sum1;
            sum=temp;
        }
        return sum;
    }
}