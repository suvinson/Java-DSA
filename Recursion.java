import java.util.*;
class Solution
{
    public int run(int n)
    {
        int fact = n;
        if(n == 1)
            return 1;
        fact = fact * run(n-1);
        return fact;
    }
}
public class Recursion {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.run(n);
        System.out.println("The factorial of " + n + " is " + ans);
    }
}
