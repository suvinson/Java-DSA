import java.util.*;
class Common_factor
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers: ");
        a=scn.nextInt();
        b=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.commonFactors(a,b);
        System.out.println("The common factors: "+result);
    }
}
class Solution {
    public int commonFactors(int a, int b) {
        int count=0,c=0;
        if(a>b)
        {
            c=a;
        }
        else
            c=b;
        for(int i=1;i<=c;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        return count;
    }
}