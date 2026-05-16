import java.util.*;
class Tribonacci
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.tribonacci(num);
        System.out.println("Tribonacci addition is: "+result);
    }
}
class Solution {
    public int tribonacci(int n) {
       int sum=0,pre1=0,pre2=1,pre3=1;
       if(n==1 || n==2)
        return 1;
       for(int i=2;i<n;i++)
       { 
            sum=pre1+pre2+pre3;
            pre1=pre2;
            pre2=pre3;
            pre3=sum;
       } 
       return sum;
    }
}