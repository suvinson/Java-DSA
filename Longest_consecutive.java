import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) 
            return 0;
        Arrays.sort(nums);
        int longest = 1;
        int countCurrent = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] - 1 == lastSmaller) 
            {
                countCurrent++;
                lastSmaller = nums[i];
            }
            else if (nums[i] != lastSmaller)
            {
                countCurrent = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, countCurrent);
        }
        return longest;
    }
}
public class Longest_consecutive {
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
        int result = sol.longestConsecutive(arr);
        System.out.println("The longest consecutive array length is : " + result);
    }
}
