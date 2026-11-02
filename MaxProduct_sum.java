import java.util.*;
class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int product = Integer.MIN_VALUE;
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(target - nums[i]))
               {
                    int j = hs.get(target - nums[i]);
                    if(nums[i] > nums[j])
                    {
                        int currentProduct = nums[i] * nums[j];
                        if(currentProduct > product)
                        {
                            product = Math.max(product,currentProduct);
                            arr[0] = i;
                            arr[1] = j;
                        }
                    }
               }
        }
        return arr;
    }
}
public class MaxProduct_sum {
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
        int[] ans = sol.maxProductPair(arr, k);
        System.out.println("The maximum product's index is : " + "("+ ans[0] + "," + ans[1] +")" );
    }
}
