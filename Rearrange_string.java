import java.util.*;
class Solution {
    public String rearrangeString(String s, char x, char y) {
        String str1 = "";
        String str2 = "";
        int len = s.length();
        for(int i=0;i<len;i++)
            {
                if(s.charAt(i) != y)
                {
                    str1 += s.charAt(i);
                }
                else
                    str2 +=s.charAt(i);
            }
        return str2+str1;
    }
}
public class Rearrange_string {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String str = scn.nextLine();
        System.out.println("Enter the x char : ");
        char x = scn.nextLine().charAt(0);
        System.out.println("Enter the y char : ");
        char y = scn.nextLine().charAt(0);
        Solution sol = new Solution();
        String ans = sol.rearrangeString(str, x, y);
        System.out.println("After rearrange : " + ans);
    }
}
