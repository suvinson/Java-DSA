import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<>();
        int j = 0;
        if(nums.length==0)
        {
            return str;
        }
        int first = nums[0];
        int count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            j++;
            if(j<nums.length && nums[i]+1 == nums[j])
            {
                count++;
                continue;
            }
            else
            {
                if(count > 0)
                {
                    str.add(first+"->"+nums[i]);
                    if(j<nums.length)
                    {
                        first = nums[j];
                    }
                }
                else
                {
                    str.add(""+nums[i]);
                    if(j<nums.length)
                    {
                        first = nums[j];
                    }
                }
                count = 0;
            }
            
        }
        return str;
    }
}
public class Summary_ranges {
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
        List<String> st = sol.summaryRanges(arr);
        System.out.println("The summary ranges : " + st);
    }
}
