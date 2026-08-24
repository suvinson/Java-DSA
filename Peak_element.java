import java.util.*;
class Solution {
    public int findPeakElement(int[] nums) {
       /* int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
                ans = i;
            }
        }
        return ans;
        */
        int low = 1;
        int high = nums.length-2;
        if(nums.length == 1)
            return 0;
        int n = nums.length;
        if(nums[0] > nums[1]) 
            return 0;
        if(nums[n-1] > nums[n-2]) 
            return n-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1])
            {
                return mid;
            }
            else if(nums[mid] < nums[mid-1])
            {
                high = mid -1 ;
            }
            else if(nums[mid] < nums[mid+1])
            {
                low = mid + 1;
            }
        }
        return -1;
    }
}
public class Peak_element {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array element : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.findPeakElement(arr);
        System.out.println("Peak element's index is : " + result);
    }
}
