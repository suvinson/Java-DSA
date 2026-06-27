import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String[] s = path.split("/");
        for(String ss : s)
        {
            if(ss.equals(""))
            {
                continue;
            }
            else if(ss.equals("."))
            {
                continue;
            }
            else if(ss.equals(".."))
            {
                if(!stk.isEmpty())
                {
                    stk.pop();
                }
                else
                {
                    continue;
                }
            }
            else 
            {
                stk.push(ss);
            } 
        }
        String ans = "";
        if(stk.isEmpty())
            {
                ans +='/';
                return ans;
            }
        for(int i = 0;i<stk.size();i++)
        {
        
                ans +='/';
                ans += stk.get(i);
            
        }
        return ans;
    }
}
public class Simplify_path {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the directory string : ");
        String path = scn.nextLine();
        Solution sol = new Solution();
        String result = sol.simplifyPath(path);
        System.out.println("The simplify path : " + result);
    }
}
