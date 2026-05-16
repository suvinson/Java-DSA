import java.util.*;
class Max_three
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
    int result=sol.maximumProduct(arr);
    System.out.println(result);
    }
}
class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);   // sort array (ascending)

        int n = nums.length;

        int case1 = nums[n-1] * nums[n-2] * nums[n-3]; // largest 3
        int case2 = nums[n-1] * nums[0] * nums[1];     // largest + 2 smallest

        return Math.max(case1, case2);
    }
}
/*class Solution {
    public int maximumProduct(int[] nums) {
        int mul=1;
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            mul=mul*nums[i];
        }
        int j=0;
        int mul1=nums[j]*nums[nums.length-1]*nums[nums.length-2];
        if(mul1>mul)
            return mul1;
        return mul;
    }
}*/
//import java.util.Arrays;
