import java.util.*;
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0;
        for(int i = 0 ; i < cardPoints.length; i++)
        {
            total += cardPoints[i];
        }
        int window = cardPoints.length - k ;
        int current = 0;
        for(int i = current ; i < window ; i++)
        {
            current += cardPoints[i];
        }
        int mini = current;
        for(int i = window; i < cardPoints.length ; i++ )
        {
            current = (current - cardPoints[i - window]) + cardPoints[i];
            mini = Math.min(current, mini);
        }
        return total - mini;
    }
}
public class Maximum_cards {
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
        System.out.println("Enter the kth element : ");
        int k = scn.nextInt();
        Solution sol = new Solution();
        int ans = sol.maxScore(arr, k);
        System.out.println("The maximum is : " + ans);
    }
}
