import java.util.*;
class Solution {
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        mergeSort(nums,start,end);
        return nums;
    }
    public void mergeSort(int[] nums , int start , int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid = (start+end)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    public int[] merge(int[] nums, int start , int mid , int end)
    {
        int i = start;
        int j = mid + 1;
        int k = start;
        int[] arr = new int[nums.length];
        while(i<=mid && j<=end)
        {
            if(nums[i] <= nums[j])
            {
                arr[k] = nums[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = nums[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            arr[k] = nums[i];
            i++;
            k++;
        }
        while(j<=end)
        {
            arr[k] = nums[j];
            j++;
            k++;
        }
        for(int r=start;r<=end;r++)
        {
            nums[r] = arr[r];
        }
        return nums;
    }
}
public class Merge_sort_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int[] result = sol.sortArray(arr);
        System.out.println("Array is sorted using merge sort");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
