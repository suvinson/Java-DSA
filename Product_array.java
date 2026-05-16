import java.util.*;
class Product_array
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner (System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the  array values : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        Solution sol=new Solution();
        int result=sol.arraySign(arr);
        System.out.println(result);
    }
}
class Solution {
    public int arraySign(int[] nums) {
        double product=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                return 0;
            product=product*nums[i];
        }
        if(product>0)
            return 1;
        else 
            return -1;
    }
}