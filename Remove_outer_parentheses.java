import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int count = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if( count > 0)
                {
                    ans += '(';
                }
                count ++;
            }
            else if(ch == ')')
            {
                if(count > 1)
                {
                    ans += ')';
                }
                count--;
            }
            
        }
        return ans;
    }
}
public class Remove_outer_parentheses {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string with parentheses : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        String ans = sol.removeOuterParentheses(s);
        System.out.println("After removing the outermost parentheses : " + ans);
    }
}
