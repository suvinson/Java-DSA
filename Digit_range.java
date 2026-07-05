import java.util.*;
class Solution {
    public int maxDigitRange(int[] nums) {
        int digit = 0;
        int total =0;
       for(int i = 0;i<nums.length;i++)
           {
               String str = String.valueOf(Math.abs(nums[i]));
               char[] ch = str.toCharArray();
               Arrays.sort(ch);
               int current = ch[ch.length-1] - ch[0];
               if(current >digit)
               {
                   digit = current;
                   total =nums[i];
               }
               else if(current == digit)
               {
                   total += nums[i];
               }
           }
        return total;
    }
}
public class Digit_range {
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
        Solution sol  = new Solution();
        int result = sol.maxDigitRange(arr);
        System.out.println("Sum of maximum digit range is : " + result);
    }
}
