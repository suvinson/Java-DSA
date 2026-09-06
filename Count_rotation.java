import java.util.*;
class Solution {
    public int countRotations(String s, int k) {
        int ans = 0;
        for(int i=0;i<s.length();i++)
        {
            String rotate = s.substring(i) + s.substring(0,i);
            int adj = findAdj(rotate);
            if(adj == k)
            {
                ans++;
            }
        }
        return ans;
    }
    private int findAdj(String str)
    {
        int count = 0;
        int j = 1;
        for(int i=0;i<str.length();i++)
        {
            if(j < str.length())
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }
            j++;
        }
        return count;
    }
}
public class Count_rotation {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string element : ");
        String s = scn.nextLine();
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.countRotations(s, k);
        System.out.println("The equal k times are : " + ans);
    }
}
