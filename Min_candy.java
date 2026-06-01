import java.util.*;
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        for(int i=0 , j=cost.length-1 ; i<j ; i++,j--)
        {
            int temp = cost[i];
            cost[i] = cost[j];
            cost[j] = temp;
        }
        int sum = 0;
        for(int i=0; i<cost.length; i++)
        {
            if(i%3!=2)
            {
                sum +=cost[i];
            }
        }
        return sum;
    }
}
public class Min_candy {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the cost of the candies one by one : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.minimumCost(arr);
        System.out.println("The sum of minimum cost of candies : " + result);
    }
}
