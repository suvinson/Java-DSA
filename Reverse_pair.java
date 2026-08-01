import java.util.*;
class Solution {
    int count = 0;
    public int reversePairs(int[] nums) {
        Merge(nums,0,nums.length-1);
        return count;
    }
    public void Merge(int[] nums,int low,int high)
    {
        if(low >= high)
        {
            return;
        }
        int mid = (low + high) / 2;
        Merge(nums,low,mid);
        Merge(nums,mid+1,high);
        pairCount(nums,low,mid,high);
        mergeSort(nums,low,mid,high);
    }
    public void pairCount(int[] nums,int low, int mid, int high)
    {
        int right = mid + 1;
        for(int i=low;i<=mid;i++)
        {
            while(right <= high && nums[i] > 2L * nums[right])
            {
                right++;
            }
            count += (right -(mid+1));
        }
    }
    public int[] mergeSort(int[] nums,int low , int mid,int high)
    {
        int start = low;
        int k = low ;
        int end = mid+1;
        int[] arr= new int[nums.length];
        while(start <= mid && end <= high)
        {
            if(nums[start] < nums[end])
            {
                arr[k] = nums[start];
                start++;
                k++;
            }
            else
            {
                arr[k] = nums[end];
                end++;
                k++;
            }
        }
        while(start <= mid)
        {
            arr[k] = nums[start];
            start++;
            k++;
        }
        while(end <= high)
        {
            arr[k] = nums[end];
            end++;
            k++;
        }
        for(int i=low;i<=high;i++)
        {
            nums[i] = arr[i];
        }
        return nums;
    }
}
public class Reverse_pair {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array values : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.reversePairs(arr);
        System.out.println("The total reverse pairs are : " + result);
    }
}
