import java.util.*;
class Four_digit{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the four digit number : ");
        num=scn.nextInt();
        Solution sol=new Solution();
        int result = sol.minimumSum(num);
        System.out.println("The minimum sum of four number after spliting digits is : " + result);
    }
}
class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        int i=0;
        while(num!=0)
        {
            int rev=num%10;
            arr[i]=rev;
            num/=10;
            i++;
        }
        Arrays.sort(arr);
        int new1=arr[0];
        new1=new1*10+arr[3];
        int new2=arr[1];
        new2=new2*10+arr[2];
        return new1+new2;
    }
}