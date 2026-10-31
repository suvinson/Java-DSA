import java.util.*;
class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int r = 0;
        int l = 0;
        while(r < nums.length - 1)
        {
            int far = 0;
            for(int i = l ; i <= r ; i++)
            {
                far = Math.max(far, nums[i] + i);
            }
            l = r + 1;
            r = far;
            jump++;
        }
        return jump;
    }
}
public class Jump_II {
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
        int ans = sol.jump(arr);
        System.out.println("The minimum number of jumps to reach the last element is : " + ans);
    }
}
