import java.util.*;
class Solution {
    public boolean threeFibonacciSum(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        int first = 0;
        int second = 1;
        while (first <= n || ls.size() < 3)
        {
            ls.add(first);
            int next = first + second ;
            first = second;
            second = next;
        }
        for(int i=0;i+2<ls.size();i++)
        {
                int sum = ls.get(i) + ls.get(i + 1) + ls.get(i + 2);
                if (sum == n) 
                {
                    return true;
                }
            
        }
        return false;
    }
}
public class Tree_fibonacci {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        boolean ans = sol.threeFibonacciSum(n);
        if(ans)
        {
            System.out.println("Three Fibonacci Sum is possible ");
        }
        else
        {
            System.out.println("Three Fibonacci Sum is possible ");
        }
    }
}
