import java.util.*;
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int count = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stk.push(i);
            }
            if(s.charAt(i) == ')')
            {
                stk.pop();

                if(stk.isEmpty())
                {   
                    stk.push(i);
                }   
                else
                {
                    count = i - stk.peek();
                    ans = Math.max(ans, count);
                }
            }
        }
        return ans;
    }
}
public class Longest_valid_parentheses {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.longestValidParentheses(s);
        System.out.println("The longest valid parentheses is : " + ans);
    }
}
