import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
       /*  int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int ans[] = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                pos[j] = nums[i];
                j++;
            }
        }
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]<0)
            {
                neg[k] = nums[i];
                k++;
            }
        }
        for(int i=0;i<pos.length;i++)
        {
            ans[i*2] = pos[i];
            ans[i*2+1] = neg[i];
        } */
        int ans[] = new int[nums.length];
        int j=0,k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] >=0)
            {
                ans[j] = nums[i];
                j +=2;
            }
            else
            {
                ans[k] = nums[i];
                k +=2 ;
            }
        }
        return ans;
    }
}
public class Array_sign {
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
        int[] result = sol.rearrangeArray(arr);
        System.out.println("Rearrange Array Elements by Sign");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
