import java.util.*;
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]!=0)
        {
            arr[0] =1;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1] - arr[i] <=1 )
            {
                continue;
            }
            else
            {
                arr[i+1] = arr[i]+1;
            }
        }
        return arr[arr.length-1];
    }
}
public class Max_decrease {
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
        int result = sol.maximumElementAfterDecrementingAndRearranging(arr);
        System.out.println("Maximum Element After Decreasing and Rearranging : " + result);
    }
}
