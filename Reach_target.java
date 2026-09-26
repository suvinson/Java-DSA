import java.util.*;
class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        if(source[0] == target[0] && source[1] == target[1])
        {
            return 0;
        }
        if((source[0] == target[0]) || (source[1] == target[1]) || Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1]))
        {
            return 1;
        }
        return 2;
    }
}
public class Reach_target {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the current place of queen in chess : ");
        int[] source = new int[2];
        for(int i=0;i<source.length;i++)
        {
            source[i] = scn.nextInt();
        }
        System.out.println("Enter the target place of queen in chess : ");
        int[] target = new int[2];
        for(int i=0;i<target.length;i++)
        {
            target[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int ans = sol.minQueenMoves(source, target);
        System.out.println("The minimum moves to reach the traget is : " + ans);
    }
}
