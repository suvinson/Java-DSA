import java.util.*;
class Solution
{
    public int minAddToMakeValid(String s)
    {
        //stack method 
        /*
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stk.push(s.charAt(i));
            }
            if(!stk.isEmpty() && stk.peek() == '(' && s.charAt(i) == ')')
            {
                stk.pop();
            }
            else if(s.charAt(i) == ')')
            {
                stk.push(s.charAt(i));
            }
        }
        return stk.size();
         */
        // optimised coding 
        int open = 0;
        int minadd = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                open++;
            }
            else
            {
                if(open > 0)
                {
                    open--;
                }
                else
                {
                    minadd++;
                }
            }
        }
        return open + minadd;
    }
}
class Min_add_parentheses
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the parentheses : ");
        String s = scn.next();
        Solution sol = new Solution();
        int result = sol.minAddToMakeValid(s);
        System.out.println("Minimum add of parentheses is : " + result);
    }
}