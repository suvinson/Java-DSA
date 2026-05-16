import java.util.*;
class Divisor_game
{
    public static void main(String arg[])
    {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num=scn.nextInt();
        Solution sol=new Solution();
        boolean result=sol.divisorGame(num);
        if(result)
        {
            System.out.println("Alice wins the game");
        }
        else
            System.out.println("Bob wins the game");
    }
}
class Solution {
    public boolean divisorGame(int n) {
        int x=0;
        if(n%2==0)
            x=n-1;
        else
            x=n-1;
        if(x%2==1)
            return true;
        else
            return false;
    }
}