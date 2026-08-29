import java.util.*;
class Solution {
    public String longestPalindrome(String s) {
        for(int end = s.length(); end > 0; end--)
        {
            for(int start = 0 ; start <= s.length() - end; start++)
            {
                if(check(start,start + end,s))
                {
                    return s.substring(start, start + end);
                }
            }
        }
        return "";
    }
    private boolean check(int i , int j , String s)
    {
        int left = i;
        int right = j - 1;
        while(left < right)
        {
            if(s.charAt(left) == s.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
public class Longest_palindromic_substring {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        String ans = sol.longestPalindrome(s);
        System.out.println("The longest palindromic substring is : " + ans);
    }
}
