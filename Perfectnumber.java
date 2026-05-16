import java.util.*;
public class Perfectnumber 
{
    public static void main(String args[]) 
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n = scn.nextInt();
        Solution sol = new Solution();
        boolean result = sol.checkPerfectNumber(n);
        if (result)
            System.out.println(n + " is a perfect number");
        else
            System.out.println(n + " is not perfect number");
    }
}

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1)
            return false;
        int sum = 0;
        for (int i = 1; i <=num; i++) 
        {
            if (num % i == 0) 
            {
                sum=sum+i;
            }
        }
        return 
            sum==num;
    }
}