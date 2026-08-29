import java.util.*;
class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        if ((source[0] + source[1]) % 2 != (target[0] + target[1]) % 2)
        {
            return -1;
        }
        if(source[0] + source[1] == target[0] + target[1])
        {
            return 1;
        }
        if(Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1]))
            return 1;
        else
            return 2;
    }
}
public class Bishop {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the inital position in chess : ");
        int[] source = new int[2];
        for(int i=0;i<source.length;i++)
        {
            source[i] = scn.nextInt();
        }
        System.out.println("Enter the target position in chess : ");
        int[] target = new int[2];
        for(int i=0;i<target.length;i++)
        {
            target[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.minBishopMoves(source, target);
        System.out.println("The moves are : " + ans);
    }
}
