import java.util.*;
class Solution {
    public int findMin(int[] nums) {
       /*  Arrays.sort(nums);
        return nums[0]; */

        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int mini = Integer.MAX_VALUE;
        while(low <= high)
        {
            mid = (low+high) / 2;
            if(nums[low] <= nums[mid])
            {
                mini = Math.min(mini,nums[low]);
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
                mini = Math.min(mini,nums[mid]);
            }
        }
        return mini;
    }
}
public class MIn_sorted_array {
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
        int result = sol.findMin(arr);
        System.out.println("The minimum rotated sorted array element is : " + result);
    }
}
