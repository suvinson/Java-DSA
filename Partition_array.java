import java.util.*;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr1 = new int[nums.length];
        int j =0;
        for(int i=0;i<nums.length;i++)
        {
            if(pivot > nums[i])
            {
                arr1[j] = nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(pivot == nums[i])
            {
                arr1[j] = nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(pivot < nums[i])
            {
                arr1[j] = nums[i];
                j++;
            }
        }
        return arr1;
    }
}
public class Partition_array
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array element : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the pivot element from your array : ");
        int p = scn.nextInt();
        Solution sol = new Solution();
        int[] result = sol.pivotArray(arr, p);
        System.out.println("Elements are in partition according to pivot : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}