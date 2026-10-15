import java.util.*;
class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0 ;
        for(int i=0;i<nums.size();i++)
        {
            Set<Integer> st = new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                st.add(nums.get(j));
                ans += (st.size() * st.size()) ;
            }
        }
        return ans;
    }
}
public class Subarray_square_sum {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            arr.add(scn.nextInt());
        }
        Solution sol = new Solution();
        int ans = sol.sumCounts(arr);
        System.out.println("Subarrays Distinct Element Sum of Squares I : " + ans);
    }
}
