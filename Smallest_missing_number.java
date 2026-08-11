import java.util.*;
class Solution {
    public int missingInteger(int[] nums) {
       /*  Arrays.sort(nums);
        return nums[nums.length-1] + 1; */
        

        /* if(nums.length == 1)
            return nums[0] + 1; */
        int ans = nums[0];
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int i=1;i<nums.length;i++)
        {
             if(nums[i] == nums[i - 1] + 1)
             {
                    ans += nums[i];
             }
             else
                break;
        }
       while(hs.contains(ans))
       {
            ans++;
       }
       return ans;
        
       
    }
}
public class Smallest_missing_number {
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
        int result = sol.missingInteger(arr);
        System.out.println("Smallest Missing Integer Greater Than Sequential Prefix Sum is : " + result);
    }
}
