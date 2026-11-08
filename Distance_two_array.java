import java.util.*;
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i=0; i < arr1.length ; i++)
        {
            boolean ans = true;
            for(int j = 0; j < arr2.length; j++)
            {
                if(Math.abs(arr1[i] - arr2[j]) <= d)
                {
                    ans = false;
                }
            }
            if(ans)
            {
                count++;
            }
        }
        return count;
    }
}
public class Distance_two_array {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first array size : ");
        int n1 = scn.nextInt();
        System.out.println("Enter the first array elements : ");
        int[] arr1 = new int[n1];
        for(int i=0 ; i < n1 ; i++)
        {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter the second array size : ");
        int n2 = scn.nextInt();
        System.out.println("Enter the second array elements : ");
        int[] arr2 = new int[n1];
        for(int i=0 ; i < n1 ; i++)
        {
            arr1[i] = scn.nextInt();
        }
        System.out.println("Enter the distance : ");
        int d = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.findTheDistanceValue(arr1, arr2, d);
        System.out.println("The distance value is : " + ans);
    }
}
