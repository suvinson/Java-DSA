import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int compare = 0;
        for(int i=0;i<gain.length;i++)
        {
            compare += gain[i];
            if(result < compare)
            {
                result = compare;
            }
        }
        return result;
    }
}
public class Highest_attitude {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0 ;i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.largestAltitude(arr);
        System.out.println("The highest attitude is : " + result);
    }
}
