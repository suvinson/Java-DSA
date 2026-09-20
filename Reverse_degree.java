import java.util.*;
class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int j = 1;
        for(int i=0;i<s.length();i++)
        {
            char ascii = s.charAt(i);
            int temp = (int) ascii;
            ans += (123 - temp) * j;
            j++;
        }
        return ans;
    }
}
public class Reverse_degree {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.reverseDegree(s);
        System.out.println("The reverse degree of a string is : " + ans);
    }
}
