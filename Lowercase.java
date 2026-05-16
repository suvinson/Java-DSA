import java.util.*;
class Lowercase
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        String s;
        System.out.println("Enter the string value : ");
        s=scn.nextLine();
        Solution sol = new Solution();
        String result = sol.toLowerCase(s);
        System.out.println("String in lower case : " + result);
    }
}
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}