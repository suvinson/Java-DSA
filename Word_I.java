import java.util.*;
class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        for(int i=0;i<word.length();i++)
        {
            ans += i / 8 + 1;
        }
        return ans;
    }
}
public class Word_I {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String str = scn.nextLine();
        Solution sol = new Solution();
        int result = sol.minimumPushes(str);
        System.out.println("Minimum Number of Pushes to Type Word I : " + result);
    }
}
