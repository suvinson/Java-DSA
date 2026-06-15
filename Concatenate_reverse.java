import java.util.*;
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = nums[i];
        }
        int n = nums.length;
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[n] = nums[i];
            n++;
        }
        return arr;
    }
}
public class Concatenate_reverse {
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
        int[] result = sol.concatWithReverse(arr);
        System.out.println("Concatenation array elements with reverse : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
