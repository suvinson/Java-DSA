import java.util.*;
class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k == nums.length)
        {
            int max = nums[0];
            for(int i=0;i<nums.length;i++)
            {
                max = Math.max(max,nums[i]);
            }
            return max;
        }
        if(k == 1)
        {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i : nums)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
            int fin = -1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            {
                if(entry.getValue() == 1)
                {
                    fin = Math.max(fin,entry.getKey());
                }
            }
            return fin;
        }
        int ans = 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[0] == nums[i])
            {
                ans = -1;
                break;
            }
            else
            {
                ans = nums[0];
            }
        }
        int ans1 = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[nums.length-1] == nums[i])
            {
                ans1 = -1;
                break;
            }
            else
            {
                ans1 = nums[nums.length-1];
            }
        }
        if(ans > ans1)
            return ans;
        else
            return ans1;
    }
}
public class Largest_k_number {
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
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.largestInteger(arr, k);
        System.out.println("The Largest Almost Missing Integer is : " + ans);
    }
}
