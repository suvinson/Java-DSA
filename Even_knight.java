import java.util.*;
class Solution {
    public boolean canReach(int[] start, int[] target) {
        if((start[0]+start[1]) % 2 ==  (target[0]+target[1]) % 2 )
            return true;
        else
            return false;
            
    }
}
public class Even_knight {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the start of knight : ");
        int[] start = new int[2];
        for(int i=0;i<2;i++)
        {
            start[i] = scn.nextInt();
        }
        System.out.println("Enter the target of knight : ");
        int[] target = new int[2];
        for(int i=0;i<2;i++)
        {
            target[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        boolean result  = sol.canReach(start, target);
        if(result)
        {
            System.out.println("The knight can reach in even steps ");
        }
        else
            System.out.println("The knight can reach in odd steps ");
    }
}
