import java.util.*;
class Sqrt
{
    public static void main(String arg[])
    {
        Scanner scn =new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.mySqrt(num);
        System.out.println("The square root of "+num+" is "+result);
    }
}
class Solution 
{
    public int mySqrt(int x)
    {
        if(x<2)
            return x;
        int left=1;
        int right=x/2;
        int ans=0;
        while(left<=right)
        {
            int mid = left+ (right -left)/2;

            if(mid <=x/mid)
            {
                ans=mid;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
}