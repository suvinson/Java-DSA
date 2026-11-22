import java.util.*;
class Solution {
    public int countDominantElements(int[] nums) {
        if(nums.length == 1)
            return 1;
        int count = 0;
        if(nums[0] >= nums[1])
            count++;
        if(nums[nums.length - 1] >= nums[nums.length - 2])
            count++;
        for(int i = 1 ; i < nums.length - 1; i++)
        {
            if( i + 1 < nums.length && (Math.floor(nums[i - 1] + nums[i + 1]) / 2) <= nums[i])
            {
                count++;
            }
        }
        return count ; 
    }
}
public class Count_dominant_elements {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.countDominantElements(arr);
        System.out.println("The count of dominant elements : " + ans);
    }
}
