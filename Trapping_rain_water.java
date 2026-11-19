import java.util.*;
class Solution {
    public int trap(int[] height) {
        int total = 0 ;
        /* int[] prefix = new int[height.length];
        prefix[0] = height[0];
        for(int i = 1 ; i < height.length ; i++)
        {
            prefix[i] = Math.max(prefix[i - 1] , height[i]);
        }
        int[] sufix = new int[height.length];
        sufix[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2 ; i >= 0 ; i--)
        {
            sufix[i] = Math.max(sufix[i + 1] , height[i]);
        }
        for(int i = 0 ; i < height.length ; i++)
        {
            total += Math.min(prefix[i] , sufix[i]) - height[i] ;
        }
        return total ; */

        //optimised
        int r = height.length - 1 , l = 0 , lMax  = height[0] , rMax = height[height.length - 1];
        while(l < r)
        {
            if(height[l] <= height[r]){
            if(lMax > height[l])
            {
                total += lMax - height[l];
            }
            else
            {
                lMax = height[l];
            }
            l = l + 1;
            }
            else
            {
                if(rMax > height[r])
                {
                    total += rMax - height[r];
                }
                else
                {
                    rMax = height[r];
                }
                r = r - 1;
            }
        }
        return total ;
    }
}
public class Trapping_rain_water {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the height of the buildings : ");;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.trap(arr);
        System.out.println("The total number of water that we can store in-between buildings are : " + ans);
    }
}
