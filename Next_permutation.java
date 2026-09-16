import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i = n-2 ; i>=0 ; i--)
        {
            if(nums[i+1] > nums[i])
            {
                index = i ;
                break;
            }
        }

        //edge case
        if(index == -1)
        {
            reverse(nums,0,n-1);
            return;
        }

        //else
        for(int i=n-1;i>index ; i--)
        {
            if(nums[i] > nums[index])
            {
                swap(nums,i,index);
                break;
            }
        }

        reverse(nums,index+1,n-1);
    }
    private void swap(int[] nums, int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i, int j)
    {
        while(i<j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
        }
        
    }
}
public class Next_permutation {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        sol.nextPermutation(arr);
        System.out.println("The next permutation : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
