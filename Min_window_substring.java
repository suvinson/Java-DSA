import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        int mini = Integer.MAX_VALUE;
        int index = -1;
        int r = 0, l = 0;
        int[] hash = new int[256];
        for(char c : t.toCharArray())
        {
            hash[c]++;
        }
        int count = 0;
        while(r < s.length())
        {
            if(hash[s.charAt(r)] > 0) count++;
            hash[s.charAt(r)]--;
            while(count == t.length())
            {
                if(r - l + 1 < mini)
                {
                    mini = r - l + 1;
                    index = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) count--;
                l++;
            }
            r++;
        }
        return index == -1 ? "" : s.substring(index, index + mini);
    }
}
public class Min_window_substring {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String s = scn.nextLine();
        System.out.println("Enter the second string : ");
        String t = scn.nextLine();
        Solution sol = new Solution();
        String ans = sol.minWindow(s, t);
        System.out.println("The min window substring is : " + ans);
    }
}
