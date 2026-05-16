import java.util.*;
class Fibo
{
    public static void main(String arg[])
    {
        int num;
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=scn.nextInt();
        Solution s = new Solution();
        int ans = s.fibo(num);
        System.out.println(ans);
    }
}
    class Solution 
    {
        public int fibo(int n) 
        {
            int a=0,b=1,c=0;
            if(n==0)
                return 0;
            if(n==1)
                return 1;
            for(int i=1;i<n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }
