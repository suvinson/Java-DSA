import java.util.*;
class Index_sum
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol= new Solution();
        int result=sol.sumOfSquares(arr);
        System.out.println("The sum of square special element is : " + result);
    }
}
class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0,j=0;
        for(int i=1;i<=nums.length;i++)
        {
            if(nums.length%i==0)
            {
                sum=sum+(nums[j]*nums[j]);
            }
            j++;
        }
        return sum;
    }
}