import java.util.*;
class Solution {
    public int beautySum(String s) {
        int total = 0;
        for(int i=0;i<s.length();i++)
        {
            Map<Character, Integer> hs = new HashMap<>();
            for(int j=i;j<s.length();j++)
            {
                hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j),0) + 1);
                if(j - i + 1 >= 3)
                {
                    int max = Collections.max(hs.values());
                    int min = Collections.min(hs.values());
                    total += max - min;
                }
            }
        }
        return total;
    }
}
public class Sum_of_beauty {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.beautySum(s);
        System.out.println("The Sum of Beauty of All Substrings is : " + ans);
    }
}
