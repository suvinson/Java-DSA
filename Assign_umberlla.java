import java.util.*;
class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] str = new String[rain.length];
        int j = 1;
        int bob = 0;
        int alice = 0;
        for(int i = 0 ; i < rain.length ; i++)
        {
            if( bob >= alice && j < rain.length && rain[i] == 1 && rain[j] == 1)
            {
                str[i] = "Alice";
                j++;
                alice++;
                continue;
            }
            if(rain[i] == 1)
            {
                str[i] = "Bob";
                bob++;
                j++;
                continue;
            }
            else
            {
                str[i] = "None";
                j++;
            }
        }
        return str;
    }
}
public class Assign_umberlla {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements only 0 and 1 : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        String[] ans = sol.assignUmbrella(arr);
        System.out.println("Assigned umberlla : ");
        for(int i = 0 ; i < ans.length ; i++)
        {
            System.out.print(ans[i] + " ");
        }

    }
}
