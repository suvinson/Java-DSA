import java.util.*;
class Sneaky_number
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
        int result[]=sol.getSneakyNumbers(arr);
        System.out.println("Sneaky numbers are : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    arr[k]=nums[i];
                    k++;
                }
            }
        }
        return arr;
    }
}