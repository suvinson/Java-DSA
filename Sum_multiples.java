import java.util.*;
class Sum_multiples
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.sumOfMultiples(num);
        System.out.println(result);
    }
}
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}