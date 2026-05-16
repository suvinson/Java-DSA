//Happy number
import java.util.*;
class Happynumber{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num;
        num=scn.nextInt();
        Solution sol = new Solution();        // Create object
        boolean result = sol.isHappy(num);    // Call method

        if (result)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }
}
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1)
        {
            if(seen.contains(n))
            {
                return false;
            }
            seen.add(n);
            int sum=0,d;
            while(n>0)
            {
                d=n%10;
                sum=sum+(d*d);
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
}