import java.util.*;
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0;
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            {
                if(i==0 || nums[i] != nums[i-1])
                {
                    if (seen.contains(nums[i])) 
                    {
                       repeated.add(nums[i]);
                    }
                    else
                    {
                        seen.add(nums[i]);
                    }
                }
            }
        for(int value : seen)
            {
                if(!repeated.contains(value))
                {
                    count++;
                }
            }
        return count;
    }
}
public class Single_block {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.countSpecialIntegers(arr);
        System.out.println("The special integers are : " + ans);
    }
}
