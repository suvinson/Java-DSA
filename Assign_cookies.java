import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int i = 0;
       int j = 0;
       int cnt = 0;
       while(i < g.length && j < s.length)
       {
            if(g[i] <= s[j])
            {
                i++;
                cnt++;
            }
            j++;
       }
        return cnt;
    }
}
public class Assign_cookies {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the children contain : ");
        int n = scn.nextInt();
        System.out.println("Enter the children's desired cookies : ");
        int[] g = new int[n];
        for(int i=0;i<n;i++)
        {
            g[i] = scn.nextInt();
        }
        System.out.println("Enter the size of the cookies contain : ");
        int m = scn.nextInt();
        System.out.println("Enter the actual cookies : ");
        int[] s = new int[n];
        for(int i=0;i<m;i++)
        {
            s[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.findContentChildren(g, s);
        System.out.println("The possible assignment is : " + ans);
    }
}
