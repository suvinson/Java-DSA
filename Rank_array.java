import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ar = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ar[i] = arr[i];
        }
        Arrays.sort(ar);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(ar[i]))
            {
                map.put(ar[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
public class Rank_array {
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
        int[] result = sol.arrayRankTransform(arr);
        System.out.println("Rank Transform of an Array : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
