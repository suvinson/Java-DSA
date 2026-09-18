import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<candyType.length;i++)
        {
            hs.add(candyType[i]);
        }
        if(hs.size() < candyType.length / 2)
        {
            return hs.size();
        }
        return candyType.length / 2;
    }
}
public class Distribute_Candies {
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
        int ans = sol.distributeCandies(arr);
        System.out.println("The maximum types of candies Alice ate : " + ans);
    }
}
