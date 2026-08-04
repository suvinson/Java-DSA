import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        int j = 0;
        for(int i=nums[0];i<nums[nums.length-1];i++)
        {
            if(nums[j] != i)
            {
                ls.add(i);
            }
            else
                j++;
        }
        return ls;
    }
}
public class Find_missing_element {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        List<Integer> result = sol.findMissingElements(arr);
        System.out.println("The missing elements are : " + result);
    }
}
