import java.util.*;
class Solution {
    public boolean stoneGame(int[] piles) {
        /* if(recursion(piles,0,piles.length-1) >= 0)
            return true;
        else
            return false;  */
        return true;
    }
    /* int recursion(int[] piles, int start, int end)
    {
        if(start == end)
            return piles[start];
        int Alice = piles[start] - recursion(piles,start+1,end);
        int Bob = piles[end] - recursion(piles,start,end-1);
        return Math.max(Alice,Bob);
    }  */
}
public class Stone_game {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        boolean  ans = sol.stoneGame(arr);
        if(ans)
            System.out.println("Alice wins");
        else
            System.out.println("Bob wins");
    }
}
