import java.util.*;
class Solution {
    public int longestOnes(int[] nums, int k) {
        /* int count = 0;
        int i = 0;
        int zero = 0;
        List<Integer> ls = new ArrayList<>();
        while(i < nums.length)
        {
            if(ls.isEmpty())
            {
                if(nums[i] == 0)
                {
                    ls.add(nums[i]);
                    zero++;
                }
                else
                {
                    ls.add(nums[i]);
                }
            }
            else if(nums[i] == 1)
            {
                ls.add(nums[i]);
            }
            else
            {
                zero++;
                ls.add(nums[i]);
                if(zero > k)
                {
                    while(true)
                    {
                        if(!ls.isEmpty())
                        {
                        if(ls.get(0) == 0)
                        {
                            ls.remove(0);
                            zero--;
                            break;
                        }
                        else
                        {
                            ls.remove(0);
                        }
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            }
            if( zero > k )
            {
                while(true)
                    {
                        if(!ls.isEmpty())
                        {
                        if(ls.get(0) == 0)
                        {
                            ls.remove(0);
                            zero--;
                            break;
                        }
                        else
                        {
                            ls.remove(0);
                        }
                        }
                        else
                        {
                            break;
                        }
                    }
            }
            count = Math.max(count , ls.size());
            i++;
        }
        return count; */

        int r = 0, l = 0, count = 0, zero = 0;
        while(r < nums.length)
        {
            if(nums[r] == 0) 
                zero++;
            if(zero > k)
            {
                if(nums[l] == 0)
                {
                    zero--;
                }
                l++;
            }
            if(zero <= k)
            {
                int len = r - l + 1;
                count = Math.max(count , len);
            }
            r++;
        }
        return count;
    }
}
public class Max_consecutive_ones_III {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.longestOnes(arr, k);
        System.out.println("Max Consecutive Ones III is : " + ans);
    }
}
