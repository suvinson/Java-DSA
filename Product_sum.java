import java.util.*;
class Product_sum
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.subtractProductAndSum(num);
        System.out.println(result);
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
        int add=0,mul=1;
        while(n!=0)
        {
            int rev=n%10;
            add=add+rev;
            mul=mul*rev;
            n=n/10;
        }
        return mul-add;
    }
}