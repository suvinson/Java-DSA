import java.util.*;
class Solution
{
    public double maxWeight(List<List<Integer>> ls,int weight)
    {
        ls.sort(Comparator.comparingDouble((List<Integer> pair) -> (double) pair.get(0) / pair.get(1)).reversed());
        double ans = 0.0;
            for (List<Integer> pair : ls) 
            {
                int second = pair.get(1);
                if(second <= weight)
                {
                    ans += pair.get(0);
                    weight -= pair.get(1);
                }
                else
                {
                    ans += ((double) pair.get(0) / pair.get(1)) * weight;
                    break;
                }
            }
        return ans;
    }
}
public class Fractional_knapsack {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        List<List<Integer>> ls = new ArrayList<>();
        System.out.println("Enter the array size : ");
        int n = scn.nextInt();
        System.out.println("Enter the value and weight as a pair : ");
        for(int i=0;i<n;i++)
        {
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<2;j++)
            {
                l.add(scn.nextInt());
            }
            ls.add(l);
        }
        System.out.println("Enter the weight : ");
        int weight = scn.nextInt();
        Solution sol = new Solution();
        double ans = sol.maxWeight(ls,weight);
        System.out.println("The maximum weight to store is : " + ans);
    }
}
