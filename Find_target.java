import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Brute force
        /* List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
                ls.add(i);
            }
        }
        return ls; */

        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < target)
            {
                cnt1++;
            }
            else if(nums[i] == target)
            {
                cnt2++;
            }
        }

        List<Integer> ls = new ArrayList<>();
        for(int i = cnt1; i < cnt1 + cnt2; i++)
        {
            ls.add(i);
        }
        return ls;
    }
}
public class Find_target {
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
        System.out.println("Enter the target element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        List<Integer> ans = sol.targetIndices(arr, k);
        System.out.println("The indices are : " + ans);
    }
}
