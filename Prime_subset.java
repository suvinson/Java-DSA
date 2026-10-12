import java.util.*;
class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ls = new ArrayList<>();
        if(s <= 1)
            return ls;
        int num = 2;
        long sum = 0;
        while (num <= n) {
            if (isPrime(num)) {
                if (sum + num > s) 
                {
                    break; 
                }
                ls.add(num);
                sum += num;
            }
            num++;
        }
        return ls;
    }
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
public class Prime_subset {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the nth number : ");
        int n = scn.nextInt();
        System.out.println("Enter the sth number : ");
        int s = scn.nextInt();
        Solution sol = new Solution();
        List<Integer> ls = sol.maxPrimes(n, s);
        System.out.println("The prime subset : " + ls);
    }
}
