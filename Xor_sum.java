import java.util.*;
class Xor_sum
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int num=0;
        System.out.println("Enter the size of array:");
        num=scn.nextInt();
        int start;
        System.out.println("Enter the start value:");
        start=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.xorOperation(num,start);
        System.out.println("The sum is: "+result);
    }
}
class Solution {
    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
            {
                arr[i]=start+2*i;
            }
        for(int i=0;i<n;i++)
            {
                sum=sum^arr[i];
            }
        return sum;
    }
}