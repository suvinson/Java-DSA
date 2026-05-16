import java.util.*;
class Harshad_number
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.sumOfTheDigitsOfHarshadNumber(num);
        System.out.println(result);
    }
}
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
       int x1=x;
       int sum=0;
       while(x!=0)
       {
            int rev=x%10;
            sum=sum+rev;
            x=x/10;
       } 
       if(x1%sum==0)
       {
        return sum;
       }
       else 
            return -1;
    }
}