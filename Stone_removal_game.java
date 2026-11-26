import java.util.*;
class Solution {
    public boolean canAliceWin(int n) {
        int alice = 10;
        int bob = 0;
        while(true)
        {
            if(alice <= n)
            {
                n = n - alice;
                bob = alice - 1;
            }
            else
            {
                return false;
            }
            if(bob <= n)
            {
                n = n - bob;
                alice = bob - 1;
            }
            else
            {
                return true;
            }
        }
    }
}
public class Stone_removal_game {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 50 : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        boolean ans = sol.canAliceWin(n);
        if(ans)
            System.out.println("The winner is Alice ");
        else
            System.out.println("The winner is Bob ");
    }
}
