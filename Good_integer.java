import java.util.*;
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        int n1 = n;
        while(n>0)
            {
                int rev = n%10;
                squareSum +=rev*rev;
                digitSum +=rev;
                n /=10;
            }
        if(squareSum - digitSum >= 50)
        {
            return true;
        }
        else 
            return false;
    }
}
public class Good_integer {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        boolean result = sol.checkGoodInteger(n);
        if(result)
        {
            System.out.println("It is a good integer");
        }
        else
        {
            System.out.println("It is not a good integer");
        }
    }
}
