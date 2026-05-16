import java.util.*;
class Count_even
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array values : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result=sol.countPartitions(arr);
        System.out.println(result);
    }
}
class Solution {
    public int countPartitions(int[] nums) {
        int sum=0,sum1=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            sum1+=nums[i];
            if(sum%2==0)
            {
                count++;
            }
        }
        return count;
    }
}