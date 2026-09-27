import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],hs.getOrDefault(nums[i],0) + 1);
        }
        List<Integer> values = new ArrayList<>(hs.keySet());
        Collections.sort(values);
        int maxFrequency = Collections.max(hs.values());
        int[] ans = new int[nums.length];
        int k = 0;
        for(int round = 1; round <= maxFrequency; round++)
        {
            for (int value : values) {
                if (hs.get(value) >= round) {
                    ans[k++] = value;
                }
            }
        }
        return ans;
    }
}
public class Arrange_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int[] fin = sol.rearrangeArray(ans);
        System.out.println("The final array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(fin[i] + " ");
        }
    }
}
