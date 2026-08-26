import java.util.*;
class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            char temp = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(temp);
            if(sb.toString().equals(goal))
            {
                return true;
            }
        }
        return false;
    }
}
public class Rotate_string {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
         System.out.println("Enter the first string : ");
        String s = scn.nextLine();
        System.out.println("Enter the second string : ");
        String t = scn.nextLine();
        Solution sol = new Solution();
        boolean ans = sol.rotateString(s, t);
        if(ans)
        {
            System.out.println("It is a possible Strings");
        }
        else
            System.out.println("It is not a possible Strings");
    }
}
