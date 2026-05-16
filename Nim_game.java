import java.util.*;
class Nim_game
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter value :");
        int n;
        n=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.canWinNim(n);
        if(result)
            System.out.println("Frind one is the winner");
        else
            System.out.println("Frind two is the winner");
    }
}
class Solution {
    public boolean canWinNim(int n) {
        if(n%4==0)
            return false;
        else
            return true;
    }
}