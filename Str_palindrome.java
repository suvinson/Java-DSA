import java.util.*;
class Solution {
    public int minOperations(String s) {
        char[] ch = s.toCharArray();
        int ans = Integer.MAX_VALUE;
        for (int rotation = 0; rotation < s.length(); rotation++) 
        {
            int first = 0;
            int last = s.length()-1;
            int cost = 0;
            while (first < last) 
            {
                char left = ch[(first + rotation) % s.length()];
                char right = ch[(last + rotation) % s.length()];
                cost += calculateCost(left, right);
                first++;
                last--;
            }
            int total = cost + rotation;
            if (total < ans) 
            {
                ans = total;
            }
        }
        return ans;
    }
    private int calculateCost(char first, char last)
    {
        int a = first - 'a';
        int b = last - 'a';
        int cost1 = (b - a + 26) % 26;
        int cost2 = (a - b + 26) % 26;
        
        return Math.min(cost1,cost2);
    }
}
public class Str_palindrome {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.minOperations(s);
        System.out.println("Minimum Operations to Make a Rotated Palindrome I is : " + ans);
    }
}
