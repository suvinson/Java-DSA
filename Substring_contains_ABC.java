import java.util.*;
class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] arr = {-1,-1,-1};
        for(int i=0 ; i < s.length() ; i++)
        {
            arr[s.charAt(i) - 'a'] = i;

            count += 1 + Math.min(arr[0],Math.min(arr[1],arr[2]));
        }
        return count;
    }
}
public class Substring_contains_ABC {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string contains only 'abc' : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.numberOfSubstrings(s);
        System.out.println("The Number of Substrings Containing All Three Characters : " + ans);
    }
}
