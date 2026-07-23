import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
           ls.add(ncr(i));
        }
        return ls;
    }
    private List<Integer> ncr(int row)
    {
        long ans = 1;
        List<Integer> l = new ArrayList<>();
        l.add(1);
        for(int col = 1;col<row;col++)
        {
            ans = ans * (row-col);
            ans = ans / (col);
            l.add((int) ans);
        }
        return l;
    }
}
public class Pascal_triangle {
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = scn.nextInt();
        Solution sol = new Solution();
        List<List<Integer>> result = sol.generate(n);
        System.out.println("The list is : " + result);
    }
}
