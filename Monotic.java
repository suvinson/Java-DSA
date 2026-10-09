import java.util.*;
class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 1)
            return true;
        if(nums[0] > nums[1])
        {
            return greater(nums,0);
        }
        if(nums[0] < nums[1])
        {
            return smaller(nums,0);
        }
        if(nums[0] == nums[1])
        {
            int j = 1;
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i] == nums[j])
                {
                    j++;
                    continue;
                }
                if(nums[i] > nums[j])
                {
                    return greater(nums,i);
                }
                else
                {
                    return smaller(nums,i);
                }
            }
        }
        return true;
    }
    private boolean greater(int[] nums,int k)
    {
        int j = k+1;
            for(int i=k;i<nums.length;i++)
            {
                if(j<nums.length && nums[i] < nums[j])
                {
                    return false;
                }
                j++;
            }
            return true;
    }
    private boolean smaller(int[] nums,int k)
    {
        int j = k+1;
            for(int i=k;i<nums.length;i++)
            {
                if(j<nums.length && nums[i] > nums[j])
                {
                    return false;
                }
                j++;
            }
            return true;
    }
}
public class Monotic {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the Array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        boolean ans = sol.isMonotonic(arr);
        if(ans)
        {
            System.out.println("It is a monotic array ");
        }
        else
            System.out.println("It is not a monotic array ");
    }
}
