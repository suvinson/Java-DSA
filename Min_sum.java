import java.util.*;
class Min_sum
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n,divisor;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter the divisor: ");
        divisor=scn.nextInt();
        Solution sol=new Solution();
        int result=sol.minOperations(arr,divisor);
        System.out.println("The minimum sum of the array is : "+ result);
    }
}
class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if(sum%k==0)
            return 0;
        while(sum%k!=0)
        {
            sum=sum-1;
            count++;
        }
        return count;
    }
}