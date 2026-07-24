import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(arr.size() == 0 || arr.get(0)!= nums[i])
            {
                int count = 0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[i] == nums[j])
                    {
                        count++;
                    }
                }
                if(count > nums.length/3)
                    arr.add(nums[i]);
            }
            if(arr.size() == 2)
                break;
        } 
        return arr;
    }
}
public class Majority_II {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i= 0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        List<Integer> result = sol.majorityElement(arr);
        System.out.println("Majority elements II : " + result);
    }
}
