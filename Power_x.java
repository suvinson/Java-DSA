import java.util.*;
class Solution {
    public double myPow(double x, int n) {
        
        long power = n;
        if (power < 0) {
            power = -power;
            return 1.0 / power(x, power);
        }

        return power(x, power);
    }

    private double power(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        if (n == 1) {
            return x;
        }

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }
}
public class Power_x {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value : ");
        double x = scn.nextDouble();
        System.out.println("Enter the nth number : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        double ans = sol.myPow(x, n);
        System.out.println("The power is : " + ans);
    }
}
