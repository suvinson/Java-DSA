import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i--)
        {
            if(s.charAt(i) == ' ' && count > 0)
            {
                break;
            }
            if(s.charAt(i) != ' ')
            {
                count++;
            }
        }
        return count;
    }
}
public class Length_of_lastword {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.lengthOfLastWord(s);
        System.out.println("The length of the last word is : " + ans);
    }
}
