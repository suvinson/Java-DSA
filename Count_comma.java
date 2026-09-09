import java.util.*;
class Solution {
    public int countCommas(int n) {
        if(n<1000)
            return 0;
        else
            return (n - 1000)+1;
    }
}
public class Count_comma {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.countCommas(n);
        System.out.println("The total commas are : " + ans);
    }
}
