import java.util.*;
class Sort_array
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        sol.sortArrayByParity(arr);
    }
}
class Solution {
    public void sortArrayByParity(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]%2==1 && nums[j]%2==0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
         System.out.println("The array in even to odd : ");
         for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}