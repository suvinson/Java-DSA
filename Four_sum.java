import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Brute force 
        /* Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    for(int l=k+1;l<nums.length;l++)
                    {
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target)
                        {
                            List<Integer> ls = Arrays.asList(nums[i] , nums[j] , nums[k] , nums[l]);
                            Collections.sort(ls);
                            st.add(ls);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans; */   

        // Better code 
        /* Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                Set<Long> hs = new HashSet<>();
                for(int k=j+1;k<nums.length;k++)
                {
                    long fourth = (long) target - ((long) nums[i] + nums[j] + nums[k]);
                    if(hs.contains(fourth)) 
                    {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hs.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(st); */

        //Optimised code 

        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
                continue;
            for(int j=i+1;j<nums.length;j++)
            {
                if(j != i+1 && nums[j] == nums[j-1])
                    continue;
                int k = j+1;
                int l = nums.length-1;
                while(k<l)
                {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target)
                    {
                        List<Integer> ll = Arrays.asList(nums[i] , nums[j] , nums[k] , nums[l]);
                        ls.add(ll);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1])
                            k++;
                        while(k<l && nums[l] == nums[l+1])
                            l--;
                    }
                    else if(sum < target)
                        k++;
                    else
                        l--;
                }
            }
        }
        return ls;
    }
}
public class Four_sum {
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
        int target = scn.nextInt();
        Solution sol = new Solution();
        List<List<Integer>> result = sol.fourSum(arr, target);
        System.out.println("The four sum list is : " + result);
    }
}
