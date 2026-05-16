import java.util.*;
class Running_sum
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result[]=sol.runningSum(arr);
        System.out.println("The running sum of one dimensional array is : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
class Solution {
    public int[] runningSum(int[] nums) {
        int num[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<=i;j++)
            {
                sum=sum+nums[j];
            }
            num[i]=sum;
        }
        return num;
    }
}