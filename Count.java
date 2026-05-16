import java.util.*;
class Count
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int nums;
        System.out.println("Enter the number:");
        nums=scn.nextInt();
        Solution sol=new Solution();
        int result = sol.countDigits(nums);
        System.out.println(result);
    }
}
class Solution {
    public int countDigits(int num) {
      int count=0,rev=0;
      int num1=num;
      while(num!=0)
      {
        rev=num%10;
        num=num/10;
        if(num1%rev==0)
            count++;
      }  
      return count;
    }
}