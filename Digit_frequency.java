import java.util.*;
class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        while(n!=0)
        {
            int rev = n%10;
            sum +=rev;
            n /=10;
        }
        return sum;
    }
}
public class Digit_frequency {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        int result = sol.digitFrequencyScore(n);
        System.out.println("Digit frequency score is : " + result);
    }
}
