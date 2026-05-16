import java.util.*;
class Min_digit
{
    public static void main(String arg[])
    {
        Scanner scn= new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the number: ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array numbers: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol= new Solution();
        int result=sol.minElement(arr);
        System.out.println("Sum of minimum digit is : " + result);
    }
}
class Solution {
    public int minElement(int[] nums) {
       for(int i=0;i<nums.length;i++)
       {
            int sum=0;
            while(nums[i]!=0)
            {
                int rev=nums[i]%10;
                sum=sum+rev;
                nums[i]/=10;
            }
            nums[i]=sum;
       } 
       Arrays.sort(nums);
       return nums[0];
    }
}