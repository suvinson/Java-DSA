import java.util.*;
class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        int sign = 1;
        boolean started = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ' && !started) {
                continue;
            }

            else if ((s.charAt(i) == '-' || s.charAt(i) == '+') && !started) {
                if (s.charAt(i) == '-') {
                    sign = -1;
                }
                started = true;
                continue;
            }

            else if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }

            ans = ans * 10 + Character.getNumericValue(s.charAt(i));
            started = true;

            // Check overflow
            if (ans * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (ans * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int)(ans * sign);
    }
}
public class Str_to_Int {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scn.nextLine();
        Solution sol = new Solution();
        int ans = sol.myAtoi(s);
        System.out.println("The final answer is : " + ans);
    }
}
