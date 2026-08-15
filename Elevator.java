import java.util.*;
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans = requests[0];
        int j = 1 ;
        for(int i=0;i<requests.length-1;i++)
            {
               ans = ans + Math.abs((requests[i] - requests[j])); 
                j++;
            }
        return ans;
    }
}
public class Elevator {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the floor count : ");
        int count = scn.nextInt();
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.elevatorRequests(count, arr);
        System.out.println("The total time in seconds is : " + ans);
    }
}
