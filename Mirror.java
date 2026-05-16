import java.util.*;
class Mirror
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.mirrorDistance(num);
        System.out.println("The distance mirror number is: "+ result);
    }
}
class Solution {
    public int mirrorDistance(int n) {
        int n1=n;
        int sum=0;
        while(n1!=0)
        {
            int rev=n1%10;
            sum=sum*10+rev;
            n1=n1/10;
        }
        return Math.abs(n-sum);
    }
}