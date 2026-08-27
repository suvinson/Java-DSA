import java.util.*;
class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')')
            {
                ans = Math.max(ans,stk.size());
                stk.pop();
            }
        }
        return ans;
    }
}
public class Max_nesting_depth_parentheses {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string vaule with parentheses : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.maxDepth(s);
        System.out.println("The maximum depth of the of the parentheses is : " + ans);
    }
}
